package S6;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.io.File;
import java.io.IOException;

public class write_opert {
    public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
        // create file
        File f= new File("D:\\software_selenium\\Writeex.xls");
        //create workbook
        WritableWorkbook wb = Workbook.createWorkbook(f);
        //create sheet
        WritableSheet sh =wb.createSheet("Data", 0);
        //create column header
        Label l1 =new Label(0,0,"Name");
        sh.addCell(l1);
        sh.addCell(new Label(0,1,"ramesh"));
        sh.addCell(new Label(0,2,"raji"));
        //create column header
        Label l2 =new Label(1,0,"Age");
        sh.addCell(l2);
        sh.addCell(new Label(1,1,"26"));
        sh.addCell(new Label(1,2,"24"));
        wb.write();
        wb.close();
        System.out.println("Workbook Created");
    }

}
