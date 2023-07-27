package org.example;

import org.example.controller.ExcelToXMLConverter;

import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ExcelToXMLConverter arquivo = new ExcelToXMLConverter(new File(".\\src\\main\\java\\org\\example\\teste.xlsx"));
        System.out.println("teste: "+arquivo.getSheet().getRow(0));

    }
}