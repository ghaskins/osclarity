package com.github.ghaskins.osclarity;

import java.util.Properties;

public class OsInfoFactory {
	static public OsInfo getInfo()  {
		OsInfo osinfo = new OsInfo();
		
		Properties props = System.getProperties();
		
		if (props.get("os.name").equals("Linux")) {			
			try	{
				osinfo = new LinuxInfo();
			} catch (Exception e) {}
		}
		
		return osinfo;
	}
}
