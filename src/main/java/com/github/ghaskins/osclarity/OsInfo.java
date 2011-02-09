package com.github.ghaskins.osclarity;

import java.util.Properties;

public class OsInfo {
	
	protected String name;
	protected String version;
	protected String arch;
	
	public OsInfo() {
		Properties props = System.getProperties();

		name    = (String)props.get("os.name");
		version = (String)props.get("os.version");
		arch    = (String)props.get("os.arch");	
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public String getArch() {
		return arch;
	}
}
