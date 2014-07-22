package com.ismartv.poi;

import com.ismartv.poi.bean.DataBean;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
//        InputStream is = new FileInputStream("/home/fenghb/Desktop/3.xlsx");
//        XSSFWorkbook xwb = new XSSFWorkbook(is);
//        XSSFSheet sheet = xwb.getSheetAt(0);
//        XSSFRow row;
//        String cell;
//        for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {
//            row = sheet.getRow(i);
//            for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells(); j++) {
//                cell = row.getCell(j).toString();
//                System.out.print(cell + "\t");
//            }
//            System.out.println("");
//        }


        ExampleEventUserModel example = new ExampleEventUserModel();
        example.processOneSheet("/home/fenghb/Desktop/3.xlsx");


    }


//    public List<DataBean> getListFromFile(InputStream inputStream) {
//
//        return null;
//    }


}
