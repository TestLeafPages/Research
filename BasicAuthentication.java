package practise;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicAuthentication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("./MultiPass-for-HTTP-basic-authentication.crx"));
		ChromeDriver driver = new ChromeDriver(options);
		String URL="chrome-extension://enhldmjbphoeibbpdhmjkchohnidgnah/options.html";
		driver.get(URL);
		
		driver.findElement(By.id("url")).sendKeys(".*.the-internet.herokuapp.com/basic_auth");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");

	}

}
