package com.github.ghaskins.osclarity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LinuxInfo extends OsInfo {
	public LinuxInfo() throws Exception {
		super();

		if (!name.equals("Linux"))
			throw new Exception("Unsupported Type");

		checkSuse();
	}

	private void checkSuse() {
		File susebrand = new File("/etc/SuSE-brand");

		try {
			FileReader reader = new FileReader(susebrand.getAbsolutePath());
			Scanner scanner = new Scanner(reader);

			String nameline = scanner.nextLine();
			String versionline = scanner.nextLine();
			String delims = "[ ]+=[ ]+";
			String[] tokens = versionline.split(delims);

			if (tokens.length == 2 && tokens[0].equals("VERSION")) {
				name = nameline;
				version = tokens[1];
			}
		} catch (FileNotFoundException e) {

		}
	}
}
