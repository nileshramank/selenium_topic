package S11_keywordDriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadXL {
    static XSSFWorkbook wb;
    static XSSFSheet sh;
    public static void setexecel(String path,int sheetnum) {
        try {
            File f= new File(path);
            FileInputStream fis=new FileInputStream(f);
            wb=new XSSFWorkbook(fis);
            sh=wb.getSheetAt(sheetnum);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static String readdata(int rownum,int cellnum) {
        String data
                =sh.getRow(rownum).getCell(cellnum).getStringCellValue();
        return data ;
    }
}
