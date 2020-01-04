package homeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements2 {
public static WebDriver driver;
public static String url="https://the-internet.herokuapp.com/";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
	}

}
