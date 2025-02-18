import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v129.emulation.Emulation;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class EmulateDeviceScreen {

    public static void main(String[] args)
    {

        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Emulation.setDeviceMetricsOverride(400,832,50,true,
                Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),
                Optional.empty(),Optional.empty(),Optional.empty(), Optional.empty(),
                Optional.empty(),Optional.empty()));

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        //driver.quit();



    }
}
