package com.pruebadocker.autweb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	
	public static Properties ofSerenity() {
		Properties property =  new Properties();
		try {
			InputStream input = new FileInputStream("serenity.properties");
			property.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property;
	}

}
