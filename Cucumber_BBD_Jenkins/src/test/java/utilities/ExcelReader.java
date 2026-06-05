package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static List<String> getProducts() throws Exception {

        List<String> products = new ArrayList<>();

        FileInputStream fis =
                new FileInputStream("C:\\Users\\PC\\OneDrive\\Documents\\search data.xlsx");

        XSSFWorkbook workbook =
                new XSSFWorkbook(fis);

        XSSFSheet sheet =
                workbook.getSheet("Sheet1");

        int rows = sheet.getLastRowNum();

        for(int i = 1; i <= rows; i++) {

            String product =
                    sheet.getRow(i)
                         .getCell(0)
                         .getStringCellValue();

            products.add(product);
        }

        workbook.close();

        return products;
    }
}