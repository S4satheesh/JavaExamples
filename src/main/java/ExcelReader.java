import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    private String filePath;

    public ExcelReader(String filePath) {
        this.filePath = filePath;
    }

    public List<String> readColumnData(int sheetIndex, int columnIndex) {
        List<String> data = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(sheetIndex);
            for (Row row : sheet) {
                Cell cell = row.getCell(columnIndex);
                if (cell != null) {
                    data.add(cell.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}

