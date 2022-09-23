package S6;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class Readwrite {

    //add jsl file
    public static void main(String[] args) throws BiffException, IOException {
        //access the file
        File f=new File("D:\\software_selenium\\read.xls");
        //access the workbook
        Workbook wb=Workbook.getWorkbook(f);
        //access the sheet
        Sheet sh=wb.getSheet(0);
        //no.of rows and columns
        int rowcount = sh.getRows();
        int colscount =sh.getColumns();
        System.out.println("No.of rows are "+rowcount+" and no.of columns are "+colscount);
        // particular data
        String info = sh.getCell(0,3).getContents();
        //password
        String info1 = sh.getCell(1,3).getContents();
        System.out.println("\4th row data: "+info+" "+info1);
        //entire excel sheet
        String data="";
        System.out.println("\nExcel Sheet data\n");
        for(int i=0;i<rowcount;i++) {
            for(int j=0;j<colscount;j++) {
                data=sh.getCell(j,i).getContents();
                System.out.print(data+"\t");
            }
            System.out.println();
        }



    }
}
