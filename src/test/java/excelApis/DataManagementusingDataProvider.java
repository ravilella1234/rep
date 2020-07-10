package excelApis;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataManagementusingDataProvider 
{
 
  @Test(dataProvider = "testData")
  public void f(String Runmode,String Col1, String Col2, String Col3) 
  {
	  
  }
  
  @DataProvider
  public Object[][] testData() throws Exception
  {
	  
	    ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\SuiteA.xlsx");
		String sheetName = "Data";
		String testcaseName = "TestA";
		
		int testStartRowNum = 0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testcaseName))
		{
			testStartRowNum++;
		}
		System.out.println("test Starts from row :- " + testStartRowNum);
		
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2;
		
		
		//calculate the row of data
		int rows=0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are :- " + rows);

		
		//calculate the total Columns
		int cols =0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total cols are :- " + cols);
		
		
		//read the data
		int dataRow=0;
		Object[][] data=new Object[rows][cols];
		
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			for(int cNum=0;cNum<cols;cNum++)
			{
				//System.out.println(e.getCellData(sheetName, cNum, rNum));
				data[dataRow][cNum]=e.getCellData(sheetName, cNum, rNum);
			}
			dataRow++;
		}
	  
	  
	return data;
	  
  }
}
