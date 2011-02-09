package com.github.ghaskins.osclarity;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	OsInfo osinfo = OsInfoFactory.getInfo();

    	System.out.println("Name: " + osinfo.getName() +
    						" Version: " + osinfo.getVersion() +
    						" Arch: " + osinfo.getArch());
    }
}
