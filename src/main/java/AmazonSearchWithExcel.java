import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class AmazonSearchWithExcel {

    public static void main(String[] args) {
        // Excel file path
        String filePath = "C:/Users/SatheeshNichenametla/IdeaProjects/JavaExamples/resources/AmazonSearch.xlsx"; // Update this with your actual path

        // Setup WebDriver
        WebDriver driver = new ChromeDriver();

        // Read product names from Excel
        ExcelReader excelReader = new ExcelReader(filePath);
        List<String> products = excelReader.readColumnData(0, 0);  // Assuming sheet 0, column 0 has product names

        ExcelWriter excelWriter = new ExcelWriter(filePath);
        int rowIndex = 1;  // Start writing from the second row (row 1)

        try {
            for (String product : products) {
                System.out.println("Searching for product: " + product);

                // Open Amazon
                driver.get("https://www.amazon.com");
                driver.manage().window().maximize();

                // Find search box and search button
                WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
                searchBox.clear();
                searchBox.sendKeys(product);
                driver.findElement(By.id("nav-search-submit-button")).click();

                // Get the first product title
                WebElement firstResult = driver.findElement(By.cssSelector(".s-main-slot .s-title-instructions-style h2 a span"));
                String firstResultText = firstResult.getText();
                System.out.println("First result for " + product + ": " + firstResultText);

                // Write first result to Excel
                excelWriter.writeData(0, rowIndex++, 1, firstResultText);  // Write to column B (index 1)
            }
        } finally {
            driver.quit();  // Close browser
        }
    }
}
