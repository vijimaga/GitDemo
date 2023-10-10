import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class SetGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 DevTools devTools = driver.getDevTools();
		 devTools.createSession();
		 
		 Map <String,Object>coordinates = new HashMap<String,Object>();
		 coordinates.put("latitude", 40);
		 coordinates.put("longitude", 3);
		 coordinates.put("accuracy", 3);
		 driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);	
		 driver.get("https://www.google.com/");
		 driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
			 driver.findElements(By.cssSelector(".LC20lb ")).get(0).click();	
				 String title=driver.findElement(By.cssSelector(".nmhp-card-hero-text-title")).getText();
		 System.out.println(title);
		 	
	}

}
