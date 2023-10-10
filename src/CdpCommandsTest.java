import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.emulation.Emulation;

public class CdpCommandsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 DevTools devTools = driver.getDevTools();	
		 devTools.createSession();
		 Map deviceMatrics = new HashMap();
		 deviceMatrics.put("width",600);
		 deviceMatrics.put("height",1000);
		 deviceMatrics.put("deviceScaleFactor",50);
		 deviceMatrics.put("mobile",true);
		 
		
		 driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMatrics);
		 driver.get("https://letcode.in/test");

	}

}
	