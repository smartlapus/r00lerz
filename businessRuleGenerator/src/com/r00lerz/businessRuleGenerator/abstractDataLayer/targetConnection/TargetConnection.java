package com.r00lerz.businessRuleGenerator.abstractDataLayer.targetConnection;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public interface TargetConnection {
	public void persist();
	public Map<String, ArrayList<String>> getTargetData() throws SQLException;
	public void close() throws SQLException;
}
