package com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import oracle.jdbc.pool.OracleDataSource;

public class OracleTargetConnection implements TargetConnection {

	Connection connection = null;
	PreparedStatement statement = null;

	public OracleTargetConnection() throws SQLException {
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
	}

	@Override
	public void persist() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, ArrayList<String>> getTargetData() throws SQLException {

		HashMap<String, ArrayList<String>> target = new HashMap<String, ArrayList<String>>();
		statement = connection.prepareStatement("select * from tables_columns");

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

		return target;
	}

	public void close() throws SQLException {
		statement.close();
		connection.close();
	}
}