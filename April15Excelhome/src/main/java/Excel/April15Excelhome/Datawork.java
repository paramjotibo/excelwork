package Excel.April15Excelhome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datawork {
int i=0;
int k=0;
int column=0;

	public ArrayList<String> getData(String Testcase) throws IOException
	{
		ArrayList<String> al=new ArrayList<String>();
		FileInputStream Fis=new FileInputStream("C:\\Users\\15199\\Desktop\\Excelwork.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(Fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
				{
				XSSFSheet aim=workbook.getSheetAt(i);
				Iterator<Row> id=aim.rowIterator();
			Row firstrow=id.next();
		Iterator<Cell> id1=	firstrow.cellIterator();
		int k=0;
		int column=0;
		while(id1.hasNext())
		{
			Cell value=id1.next();
			if (value.getStringCellValue().equalsIgnoreCase("TestCase"))
			{
				column=k;
			}
			k++;
		}
		System.out.println(k);
		System.out.println("value of column is :" +column);
		while(id.hasNext())
		{
			Row rw=id.next();
			if(rw.getCell(column).getStringCellValue().equalsIgnoreCase(Testcase))
			{
				Iterator<Cell> col=rw.cellIterator();
				while(col.hasNext())
				{
					al.add(col.next().getStringCellValue());
				}
			}
		}
			}
		}
		return al;
		
	
	}
}
