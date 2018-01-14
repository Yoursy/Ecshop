package com.tt.learning;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * ReadExcel��ʹ��POI-XSSFʵ��2007�汾�Ժ�excel�ļ���ָ��sheetҳ���ݵĶ�ȡ
 * @author YOURSY
 *
 */
public class ReadExcel
{
	/**
	 * getDataFromExcel��̬�������ڶ�ȡ��resoureĿ¼�µ�xlsx�ļ��ƶ�ҳ������
	 * @param excelFileName ��resourceĿ¼�µ�xlsx�ļ���������Ҫָ��·��
	 * @param sheetName �����ȡ���������ڵ�sheetҳ����
	 * @return ��������ν��ά���鷵��
	 */
	public static Object[][] getLoginDataFromExcel(String excelFileName,String sheetName)
	{
		Object[][] obj=null;
		InputStream is = ReadExcel.class.getClassLoader().getResourceAsStream(excelFileName);
		Workbook wb =null;
		Sheet sheet = null; //��ȡָ����sheetҳ����
		//�������·���ж�ȡָ�����ļ��������������	
		try
		{
			wb= new XSSFWorkbook(is); //ͨ����������ȡexcel�ļ���workbook����
			sheet = wb.getSheet(sheetName);
			int lastRowNum =sheet.getLastRowNum();			//��ȡ���һ���ı��
			int lastCellNum = sheet.getRow(lastRowNum).getLastCellNum();  //��ȡ���һ����Ԫ��ı��(�кţ�����Ҫ��һ
			
			System.out.println("lastRowNum="+lastRowNum);
			System.out.println("lastCellNum="+lastCellNum);
			
			
			obj = new Object[lastRowNum][lastCellNum];
			for(int i = 1; i <= lastRowNum; i++)
			{
				for(int j = 0; j < lastCellNum; j++)
				{
					 String str= sheet.getRow(i).getCell(j).getStringCellValue();
					 if(str.equalsIgnoreCase("empty")) //�жϲ���Ϊ�յ����
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
		Sheet sheet = null; //��ȡָ����sheetҳ����
		//�������·���ж�ȡָ�����ļ��������������	
		try
		{
			wb= new XSSFWorkbook(is); //ͨ����������ȡexcel�ļ���workbook����
			sheet = wb.getSheet(sheetName);
			int lastRowNum =sheet.getLastRowNum();			//��ȡ���һ���ı��
			int lastCellNum = sheet.getRow(lastRowNum).getLastCellNum();  //��ȡ���һ����Ԫ��ı��(�кţ�����Ҫ��һ
			
			System.out.println("lastRowNum="+lastRowNum);
			System.out.println("lastCellNum="+lastCellNum);
			
			
			obj = new Object[lastRowNum][lastCellNum];			
			for(int i = 1; i <= lastRowNum; i++)
			{
				for(int j = 0; j < lastCellNum; j++)
				{
					 String str= sheet.getRow(i).getCell(j).getStringCellValue();
					 if(str.equalsIgnoreCase("empty")) //�жϲ���Ϊ�յ����
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
