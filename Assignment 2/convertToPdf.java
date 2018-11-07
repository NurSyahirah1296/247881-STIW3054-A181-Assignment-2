package com.realtime.Assignment2;
import java.io.FileOutputStream;
import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class convertToPdf {
    	
    	public static void Convert(final ArrayList<dataExcel> data, final ArrayList<String> dataOutside) throws Exception{

            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\setul\\Desktop\\ChessResultLists.pdf"));
            PdfPTable table = new PdfPTable(new float[] { 1, 5, 1, 1, 1, 3 });
            table.setWidthPercentage(100);
            table.setSpacingBefore(15f);
            table.setSpacingAfter(10f);
            document.open();
            
            int infos = 0;
            Paragraph p = new Paragraph();
            
            for(String text : dataOutside) {
            	
            	if(infos >= 0 && infos <4) {
            		
            		p = new Paragraph(new Phrase(text));
            		document.add(p);
            	}
            	  infos++;
            }
            
            for (dataExcel info : getExcelData.findInfo()) {
               
            	table.addCell(info.getNo());
                table.addCell(info.getName());
                table.addCell(info.getFideID());
                table.addCell(info.getFED());
                table.addCell(info.getRtg());
                table.addCell(info.getClub_City());
            }

            document.add(table);
            
            infos = 0;
            
            for(String text : dataOutside) {
            	
            	if(infos >= 4 && infos <=6) {
            		
            		p = new Paragraph(new Phrase(text));
            		document.add(p);
            	}
            	  infos++;
            }

            document.close();
            System.out.println("PDF file created!!");

        }    
   }

