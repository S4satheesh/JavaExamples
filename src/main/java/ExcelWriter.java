import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {

    private String filePath;

    public ExcelWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeData(int sheetIndex, int rowIndex, int columnIndex, String data) {
        try (Workbook workbook = new XSSFWorkbook(new File(filePath))) {
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            Row row = sheet.getRow(rowIndex);
            if (row == null) {
                row = sheet.createRow(rowIndex);
            }
            Cell cell = row.getCell(columnIndex);
            if (cell == null) {
                cell = row.createCell(columnIndex);
            }
            cell.setCellValue(data);

            try (FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath))) {
                workbook.write(fileOutputStream);
            }
        } catch (IOException | InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}

