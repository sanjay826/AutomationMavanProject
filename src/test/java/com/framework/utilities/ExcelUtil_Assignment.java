package com.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil_Assignment {

	public static List<Map<String, String>> readExcelData(String fileName, String sheetName) {

		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName); // read
																													// the
																													// file
			XSSFWorkbook workbook = new XSSFWorkbook(file); // share the file with excel classes
			XSSFSheet sheet = workbook.getSheet(sheetName); // get the sheet to read data
			int totalRows = sheet.getPhysicalNumberOfRows(); // total number of rows having data
			int totalcolumns = sheet.getRow(0).getPhysicalNumberOfCells(); // total number of columns having data in
																			// specific row

			for (int r = 1; r < totalRows; r++) {
				Map<String, String> rowdata = new HashMap<String, String>();
				for (int c = 0; c < totalcolumns; c++) {
					String columnName = sheet.getRow(0).getCell(c).getStringCellValue();
					String columnValue = sheet.getRow(r).getCell(c).getStringCellValue();
					rowdata.put(columnName, columnValue);
				}
				data.add(rowdata);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return data;

	}
}
