package S10_data_driven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
//add jar file folder
public class read {
    public static void main(String[] args) throws IOException, IOException {
        String path = "D:\\software_selenium\\readdata.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheetAt(0);
        //no of rows and columns
        int rowscount = sh.getLastRowNum() + 1;
        int colscount = sh.getRow(0).getLastCellNum();
        System.out.println("No.of rows are " + rowscount + "rows and no.of columns are" + colscount + "columns");
        //particular data
        String s = sh.getRow(1).getCell(0).getStringCellValue();
        System.out.println("\n particular data: " + s);
        System.out.println("\n---------------Entire excel data-------");
        //entire excel data
        for (int i = 0; i < rowscount; i++) {
            for (int j = 0; j < colscount; j++) {
                String s1 = sh.getRow(i).getCell(j).getStringCellValue();
                System.out.print(s1 + " ");
            }
            System.out.println();
        }
    }
}