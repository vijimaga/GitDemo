import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.emulation.Emulation;

public class MobileEmulatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 DevTools devTools = driver.getDevTools();	
		 devTools.createSession();
		 	//send 	commands CDP
		 devTools.send(Emulation.setDeviceMetricsOverride(300, 800, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		 driver.get("https://rahulshettyacademy.com/learning-path");

	}

}
