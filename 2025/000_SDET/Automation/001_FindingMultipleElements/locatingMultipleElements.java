package pack1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		List<WebElement> leftmenu = driver.findElements(By.xpath("//ul[@class='leftmenu']/li"));
		for(WebElement ele: leftmenu) {
			System.out.println(ele.getText());
			Thread.sleep(1000);
		}
//		Another way
		for(int i = 0; i < leftmenu.size(); i++) {
			System.out.println(i + ">" + leftmenu.get(i).getText());
			Thread.sleep(1000);
		}
		driver.quit();
	}

}
