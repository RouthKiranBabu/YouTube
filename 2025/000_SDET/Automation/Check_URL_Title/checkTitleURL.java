package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		String tle = driver.getTitle(); System.out.println(tle);
		if (tle.contains("Online Banking")) System.out.println("Yes, It provides Online Banking...");
		if (tle.equals("ParaBank | Welcome | Online Banking")) System.out.println("Title Expected...");
		String url = driver.getCurrentUrl();
		if (url.contains("parabank.parasoft.com")) System.out.println("Yes, It contains parabank.parasoft.com");
		driver.quit();
	}

}
