package com.apaul.jmx;

public interface SystemConfigMBean {
	public void setThreadCount(int noOfThreads);
	public int getThreadCount();

	public void setSchemaName(String schemaName);
	public String getSchemaName();
	
	public String getAttributeName();
	public void setAttributeName(String attributeName);

	// any method starting with get and set are considered
	// as attributes getter and setter methods, so I am 
	// using do* for operation.
	public String doConfig();
}
