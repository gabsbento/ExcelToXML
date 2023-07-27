package org.example.controller;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.template.ContratoExcel;

import java.io.File;
import java.util.List;

public class ExcelToXMLConverter {
    Workbook workbook;
    Sheet sheet;
    public ExcelToXMLConverter(File inputFile){
        try{
            workbook = new XSSFWorkbook(inputFile);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e ){
            e.printStackTrace();
        }

    }

    public Sheet getSheet(){
        return sheet;
    }

    public List<ContratoExcel> readSheetData(Sheet sheet){
        return null;
    }

}
