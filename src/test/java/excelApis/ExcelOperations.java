package excelApis;

public class ExcelOperations 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e1 = new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata.xlsx");
		
		int rCount = e1.getRowCount("login");
		System.out.println(rCount);
		
		int cCount = e1.columnCount("login");
		System.out.println(cCount);
		
		System.out.println(e1.getCellData("login", 1, 3));
		
		System.out.println(e1.getCellData("login", "UserName", 1));
		
		e1.setCellData("login", 4, 1, "Passed");

	}

}
