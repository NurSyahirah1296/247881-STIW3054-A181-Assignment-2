package com.realtime.Assignment2;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class getExcelData {

	private static ArrayList<dataExcel>  data = new ArrayList<dataExcel>(); 
	private static ArrayList<String>  dataOutside = new ArrayList<>();
	
	public static void readExcel() throws IOException {
	
		try {
		
    	FileInputStream fis = new FileInputStream("C:\\Users\\setul\\Desktop\\chessResultsList.xlsx");   	
        XSSFWorkbook Workbook = new XSSFWorkbook(fis);
        XSSFSheet xssfSheet = Workbook.getSheetAt(0);
        
        Iterator<Row> rowIterator = xssfSheet.iterator();
        DataFormatter dataFormatter = new DataFormatter();

        while (rowIterator.hasNext()) {
        	
            Row row = rowIterator.next();
            
             if(row.getRowNum() < 4 || row.getRowNum() > 157) {
            	 dataOutside.add(row.getCell(0).toString());
            
             }
             
             else {
            	
            	String No = dataFormatter.formatCellValue(row.getCell(0));
                String Name = row.getCell(2).toString();
                String FideID = row.getCell(3).toString();
                String FED = row.getCell(4).toString();
                String Rtg = dataFormatter.formatCellValue(row.getCell(5));
                String Club_City = row.getCell(6).toString();
                
                data.add(new dataExcel(No, Name, FideID, FED, Rtg, Club_City));
               
            }

        }
     }
		catch(IOException e) {
    	 
     }
		
	}
        public static ArrayList<dataExcel> findInfo(){
        	return data;
        }
        
        public static ArrayList<String> getDataOutside(){
        	return dataOutside;
        }
    }

