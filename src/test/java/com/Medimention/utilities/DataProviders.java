package com.Medimention.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="RegData") 
	public String[][] getData() throws IOException
	{
		String path="C:\\Users\\vsharma\\eclipse-workspace\\Project26April\\TestData\\Data.xlsx";
		ExcelUtility util= new ExcelUtility(path);
	
		int rows= util.getRowCount("data");
		int cols= util.getCellCount("data", 1);
		
		String registerData[][]= new String[rows][cols];
		for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				registerData[i-1][j]=util.getCellData("data", i, j);
			}
		}
		return registerData;
	}
	
	
}


