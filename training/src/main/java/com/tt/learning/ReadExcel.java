package com.tt.learning;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * ReadExcel类使用POI-XSSF实现2007版本以后excel文件中指定sheet页数据的读取
 * @author YOURSY
 *
 */
public class ReadExcel
{
	/**
	 * getDataFromExcel静态方法用于读取在resoure目录下的xlsx文件制定页的数据
	 * @param excelFileName 在resource目录下的xlsx文件名，不需要指定路径
	 * @param sheetName 所需读取的数据所在的sheet页名称
	 * @return 将数据所谓二维数组返回
	 */
	public static Object[][] getLoginDataFromExcel(String excelFileName,String sheetName)
	{
		Object[][] obj=null;
		InputStream is = ReadExcel.class.getClassLoader().getResourceAsStream(excelFileName);
		Workbook wb =null;
		Sheet sheet = null; //获取指定的sheet页对象
		//从类加载路径中读取指定的文件，获得其输入流	
		try
		{
			wb= new XSSFWorkbook(is); //通过输入流读取excel文件到workbook对象
			sheet = wb.getSheet(sheetName);
			int lastRowNum =sheet.getLastRowNum();			//获取最后一样的编号
			int lastCellNum = sheet.getRow(lastRowNum).getLastCellNum();  //获取最后一个单元格的编号(列号），需要减一
			
			System.out.println("lastRowNum="+lastRowNum);
			System.out.println("lastCellNum="+lastCellNum);
			
			
			obj = new Object[lastRowNum][lastCellNum];
			for(int i = 1; i <= lastRowNum; i++)
			{
				for(int j = 0; j < lastCellNum; j++)
				{
					 String str= sheet.getRow(i).getCell(j).getStringCellValue();
					 if(str.equalsIgnoreCase("empty")) //判断参数为空的情况
					 {
						 obj[i-1][j]="";
					 }
					 else
					 {
						 obj[i-1][j]=str;
					 }
				}
			}
			wb.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				wb.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return obj;
	}	
	
	public static Object[][] getRegiestDataFromExcel(String excelFileName,String sheetName)
	{		
		Object[][] obj=null;
		InputStream is = ReadExcel.class.getClassLoader().getResourceAsStream(excelFileName);
		Workbook wb =null;
		Sheet sheet = null; //获取指定的sheet页对象
		//从类加载路径中读取指定的文件，获得其输入流	
		try
		{
			wb= new XSSFWorkbook(is); //通过输入流读取excel文件到workbook对象
			sheet = wb.getSheet(sheetName);
			int lastRowNum =sheet.getLastRowNum();			//获取最后一样的编号
			int lastCellNum = sheet.getRow(lastRowNum).getLastCellNum();  //获取最后一个单元格的编号(列号），需要减一
			
			System.out.println("lastRowNum="+lastRowNum);
			System.out.println("lastCellNum="+lastCellNum);
			
			
			obj = new Object[lastRowNum][lastCellNum];			
			for(int i = 1; i <= lastRowNum; i++)
			{
				for(int j = 0; j < lastCellNum; j++)
				{
					 String str= sheet.getRow(i).getCell(j).getStringCellValue();
					 if(str.equalsIgnoreCase("empty")) //判断参数为空的情况
					 {
						 obj[i-1][j]="";
					 }
					 else
					 {
						 obj[i-1][j]=str;
					 }
				}
			}
			wb.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try
			{
				wb.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return obj;
	}
}
