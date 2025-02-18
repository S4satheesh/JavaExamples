import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LocalizationTesting {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();


        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        Map<String, Object> coordinates = new HashMap<String, Object>();
        coordinates.put("latitude", 40);
        coordinates.put("longitude",3);
        coordinates.put("accuracy",1);

        driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
        driver.get("https://www.netflix.com/");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.findElement(By.name("q")).sendKeys("Netflix", Keys.ENTER);




    }
}
