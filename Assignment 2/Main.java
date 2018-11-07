package com.realtime.Assignment2;

public class Main {
	
    public static void main(String[] args) throws Exception {

    	getExcelData.readExcel();
        convertToPdf.Convert(getExcelData.findInfo(), getExcelData.getDataOutside());
		
    }

}