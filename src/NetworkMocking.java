import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.fetch.Fetch;

public class NetworkMocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();

		devTools.createSession();
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		devTools.addListener(Fetch.requestPaused(), request -> {
			if (request.getRequest().getUrl().contains("shetty"))
				;
			{
				String mockedUrl = request.getRequest().getUrl().replace("=shetty", "=BadGuy");

				System.out.println(mockedUrl);
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(mockedUrl),
						Optional.of(request.getRequest().getMethod()), request.getRequest().getPostData(),
								request.getResponseHeaders(), java.util.Optional.empty()));
			}
			{
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()),
						Optional.of(request.getRequest().getMethod()), request.getRequest().getPostData(),
								request.getResponseHeaders(), java.util.Optional.empty()));
				
			}
			
			driver.get("https://rahulshettyacademy.com/angularAppdemo");
			
			driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
			
			
			
			

		});
	}

}
