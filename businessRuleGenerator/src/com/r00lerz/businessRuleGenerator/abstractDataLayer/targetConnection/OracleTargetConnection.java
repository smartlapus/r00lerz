package com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import oracle.jdbc.pool.OracleDataSource;

public class OracleTargetConnection implements TargetConnection {


	public OracleTargetConnection(){
		
	}
	
	public Connection createConnection(){
		Connection connection = null;
		try {
			OracleDataSource ds = new OracleDataSource();
			ds.setDriverType("thin");
			ds.setServerName("ondora01.hu.nl");
			ds.setServiceName("cursus01.hu.nl");
			ds.setNetworkProtocol("tcp");
			ds.setDatabaseName("tho7_2013_2a_team4_target");
			ds.setPortNumber(8521);
			ds.setUser("tho7_2013_2a_team4_target");
			ds.setPassword("tho7_2013_2a_team4");
			connection = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	@Override
	public void executeStatement(String query) throws SQLException {
		Connection connection = this.createConnection();
		PreparedStatement statement = connection.prepareStatement(query);

		statement.executeQuery();
		this.close(statement, connection);
	}
	
	public static void main(String[]args) throws SQLException{
		TargetConnection tc = new OracleTargetConnection();
		
		tc.executeStatement("CREATE OR REPLACE TRIGGER BRG_CSA_ORD_TRIGGER	BEFORE DELETE OR INSERT OR UPDATE	ON ORDERITEMS	FOR EACH ROW DECLARE	l_oper			varchar2(3);	l_error_stack	varchar2(4000);BEGIN	IF INSERTING THEN		l_oper :='INS';	ELSIF UPDATING THEN		l_oper :='UPD';	ELSIF DELETING THEN		l_oper :='DEL';	END IF;	--Evaluates: BRG_CSA_ORD_TRG_ACR_11	DECLARE		l_passed boolean := true;	BEGIN		IF l_oper in ('INS', 'UPD')THEN --shoulde be replaced with dynamic code later.			l_passed := :new.ORDER_ITEM_ID = 11;			IF NOT l_passed THEN				l_error_stack := l_error_stack || 'ORDERITEMS.ORDER_ITEM_ID must be equal to 11.';			END IF;		END IF;	END;	IF l_error_stack IS NOT NULL THEN		raise_application_error(-20800, l_error_stack);	END IF;END BRG_CSA_ORD_TRIGGER;");
	}

	@Override
	public Map<String, ArrayList<String>> getTargetData() throws SQLException {
		Connection connection = this.createConnection();
		Map<String, ArrayList<String>> target = new HashMap<String, ArrayList<String>>();
		PreparedStatement statement = connection.prepareStatement("select * from tables_columns");

		ResultSet results = statement.executeQuery();

		while (results.next()) {
			String table = results.getString("table_name");
			String column = results.getString("column_name");

			if (target.containsKey(table)) {
				ArrayList<String> columns = target.get(table);
				if (!columns.contains(column)) {
					columns.add(column);
				}
			} else {
				ArrayList<String> columns = new ArrayList<String>(Arrays.asList(column));
				target.put(table, columns);
			}
		}
		this.close(statement, connection);
		return target;
	}

	private void close(Statement statement, Connection connection) throws SQLException {
		statement.close();
		connection.close();
	}
}