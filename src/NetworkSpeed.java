import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.network.model.ConnectionType;
import org.openqa.selenium.devtools.v116.network.Network;

import com.google.common.base.Optional;

public class NetworkSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		//devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		//devTools.send(Network.emulateNetworkConditions(false, 3000	, 20000, 30000,Optional.empty()));

	}

}
