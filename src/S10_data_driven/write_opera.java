package S10_data_driven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class write_opera {
    public static void main(String[] args) throws IOException {
        String path="D:\\software_selenium\\readdata.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh=wb.getSheetAt(0);
        //no of rows and columns
        int rowscount=sh.getLastRowNum()+1;
        int colscount=sh.getRow(0).getLastCellNum();
        System.out.println("No.of rows are " +rowscount+ "rows and no.of columns are" +colscount+ "columns");
        Row r=sh.getRow(0);
        Cell c=r.createCell(3);
        c.setCellValue("Status");
        for(int i=1; i<rowscount; i++){
            Row row=sh.getRow(i);
            Cell cell=row.createCell(3);
            //create cell()=to create column
            cell.setCellValue("join");
        }
        FileOutputStream fos=new FileOutputStream(path);
        wb.write(fos);
        wb.close();
    }
}
