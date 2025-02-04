package com.framwork.test;

import java.util.Properties;

import com.framework.utilities.PropUtil;

public class ReadPropertyFile {

	public static void main(String[] args) {
		
		System.out.println();

     Properties prop = PropUtil.readData("prod", "Config.properties");
     
     System.out.println(prop.getProperty("url"));
     System.out.println(prop.getProperty("username"));
     System.out.println(prop.getProperty("password"));

	}

}
