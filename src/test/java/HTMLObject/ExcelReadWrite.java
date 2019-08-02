package HTMLObject;

import org.apache.poi.hssf.usermodel.HSSFAnchor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelReadWrite {

    public void ExcelRead(String FilePath, String FileName, String SheetName) throws IOException {
        FileInputStream fi = new FileInputStream(FilePath + "\\" + FileName);
        String FileExtension = FileName.substring(FileName.indexOf("."));

        Workbook armanwb =null;

        if(FileExtension.equals(".xls")){
            armanwb = new HSSFWorkbook(fi);

        }else if(FileExtension.equals(".xlsx")){
            armanwb = new XSSFWorkbook(fi);

        }

        Sheet armanSheet = armanwb.getSheet(SheetName);

        int totalRowCount = armanSheet.getLastRowNum() - armanSheet.getFirstRowNum();

        for(int i = 0; i<=totalRowCount; i++){
            Row armanworksheetRow = armanSheet.getRow(i);

            for(int j = 0;j<armanworksheetRow.getLastCellNum();j++){
                System.out.print(armanworksheetRow.getCell(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Total Rows = "+ totalRowCount);

    }

    public void ExcelWrite(String FilePath, String FileName, String SheetName, String[] InputData) throws IOException {

        FileInputStream fileInput = new FileInputStream(FilePath + "\\" + FileName);

        String FileExtension = FileName.substring(FileName.indexOf("."));

        Workbook armanWorkBook =null;

        if(FileExtension.equals(".xls")){
            armanWorkBook = new HSSFWorkbook(fileInput);

        }else if(FileExtension.equals(".xlsx")){
            armanWorkBook = new XSSFWorkbook(fileInput);

        }

        Sheet armanWorkSheet = armanWorkBook.getSheet(SheetName);

        int totalRowCount = armanWorkSheet.getLastRowNum() - armanWorkSheet.getFirstRowNum();

        Row DataEntryRow = armanWorkSheet.createRow(totalRowCount +1);
        Row firstRow = armanWorkSheet.getRow(0);


            for(int j = 0; j < firstRow.getLastCellNum() ;j++){
                Cell DataEntryRowCell = DataEntryRow.createCell(j);
                DataEntryRowCell.setCellValue(InputData[j]);
            }

            fileInput.close();
            FileOutputStream fileOutput = new FileOutputStream(FileName);

            armanWorkBook.write(fileOutput);
            fileOutput.close();
    }

    public static void main(String[] args)throws IOException{
        String FilePath = System.getProperty("user.dir");
        String FileName = "arman.xls";

        ExcelReadWrite excelReadWrite = new ExcelReadWrite();

        //String[] InputData = {"6", "Mortuza", "Kamal", "43"};
        //excelReadWrite.ExcelWrite(FilePath, FileName, "Sheet1", InputData);
        excelReadWrite.ExcelRead(FilePath, FileName,"Sheet1");




    }




    }

