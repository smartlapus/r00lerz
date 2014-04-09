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
		Statement statement = connection.createStatement();

		statement.executeQuery(query);
		this.close(statement, connection);
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