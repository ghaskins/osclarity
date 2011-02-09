package com.github.ghaskins.osclarity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

public class Clarify {
	static void process() {
		Properties props = System.getProperties();
		String osname = (String)props.get("os.name");
		
		if (osname.equals("Linux")) {
			File susebrand = new File("/etc/SuSE-brand");
				
			try	{
				FileReader reader = new FileReader(susebrand.getAbsolutePath());
				Scanner scanner = new Scanner(reader);
				
				String os = scanner.nextLine();
				String version = scanner.nextLine();
				String delims = "[ ]+=[ ]+";
				String[] tokens = version.split(delims);
				
				if (tokens.length == 2 && tokens[0].equals("VERSION")) {
					props.put("os.name", os);
					props.put("os.version", tokens[1]);
				}
			} catch (FileNotFoundException e) {
				
			}
		}
	}
}
