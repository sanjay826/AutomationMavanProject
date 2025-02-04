package com.framwork.test;

import java.util.List;
import java.util.Map;

import com.framework.utilities.ExcelUtil;

public class ReadExcelData {

	public static void main(String[] args) {
		
		String[][] data=ExcelUtil.readData("TestData.xlsx", "sheet1");
		
		for(String[] dataset: data  ) {
			
			for(String values : dataset ) {
				System.out.println(values);
			}
		}
		
		//read Excel data 
		System.out.println("=======Read the Data From Collection==========");
		List<Map<String, String>> excelData=ExcelUtil.readExcelData("TestData.xlsx", "sheet1");
		System.out.println(excelData.get(2).get("Password"));

	}

}
