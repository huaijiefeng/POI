package com.ismartv.poi;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/home/fenghb/Desktop/2.xlsx");
        XSSFWorkbook xwb = new XSSFWorkbook(is);
        XSSFSheet sheet = xwb.getSheetAt(0);
        XSSFRow row;
        String cell;
        for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {
            row = sheet.getRow(i);
            for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells(); j++) {
                cell = row.getCell(j).toString();
                System.out.print(cell + "\t");
            }
            System.out.println("");
        }
    }
}
