package com.framwork.test;

import java.util.List;
import java.util.Map;

import com.framework.utilities.ExcelUtil;

public class ReadAssignment_Excel_Data {

	public static void main(String[] args) {

		List<Map<String, String>> excelData = ExcelUtil.readExcelData("Collections_Assignment.xlsx", "StudentDetails");

		excelData.stream().filter(data -> "Office Depot".equals(data.get("Supplier Name")))
				.forEach(System.out::println);

	}

}
