package org.example.controller;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.template.ContratoExcel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class ExcelToXMLConverter {
    private Workbook workbook;
    private Sheet sheet;
    public ExcelToXMLConverter(File inputFile){
        try{
            this.workbook = new XSSFWorkbook(inputFile);
            this.sheet = workbook.getSheetAt(0);
        } catch (Exception e ){
            e.printStackTrace();
        }

    }

    public Sheet getSheet(){
        return sheet;
    }

    public List<ContratoExcel> readSheetData(Sheet sheet){
        System.out.println(sheet.getActiveCell());
        return null;
    }

    public boolean createXML(File inputFile){
        try{
            JAXBContext context = JAXBContext.newInstance(ContratoExcel.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(readSheetData(getSheet()), new FileOutputStream(inputFile));

            System.out.println("Arquivo xml criado");
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }


}
