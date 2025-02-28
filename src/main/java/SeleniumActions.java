import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class SeleniumActions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        // Find all product names
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        // Generate a random index to select a product
        Random random = new Random();
        int randomIndex = random.nextInt(products.size());

        // Get the selected product name
        String selectedProductName = products.get(randomIndex).getText().trim();
        System.out.println("Selected Product: " + selectedProductName);

        // Click the "ADD TO CART" button corresponding to the selected product
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
        addToCartButtons.get(randomIndex).click();

        // Generate a random quantity between 1 and 9
        int randomQuantity = random.nextInt(9) + 1;
        System.out.println("Random Quantity: " + randomQuantity);

        // Locate the quantity input field and enter the random quantity
        List<WebElement> quantityInputs = driver.findElements(By.xpath("//input[@type='number']"));

        if (randomIndex < quantityInputs.size()) {
            WebElement quantityInput = quantityInputs.get(randomIndex);
            quantityInput.clear();  // Clear existing value
            quantityInput.sendKeys(String.valueOf(randomQuantity)); // Enter the random quantity
        } else {
            System.out.println("Quantity input field not found for the selected product.");
        }

        WebElement price = driver.findElement(By.xpath("(//div[@class='cart-info']//td)[6]"));
        System.out.println("Price: " + price.getText());

        // Close the browser
        //driver.quit();
    }
}