package pack1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginToWebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		WebElement passele = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Thread.sleep(1000);
		passele.sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
//            Alert alert = driver.switchTo().alert();
//            System.out.println("Alert Text: " + alert.getText());
//            alert.accept();
//        } else {
//            System.out.println("No alert found.");
//        }
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		List<WebElement> outmenu = driver.findElements(By.xpath("//ul[@role='menu']/li"));
		for (WebElement ele: outmenu) {
			if(ele.getText().equals("Logout")) System.out.println("You are Loggedin...");
		}
		for(int i = 0; i < outmenu.size(); i++) {
			System.out.println(i + " > " + outmenu.get(i).getText());
			Thread.sleep(1000);
		}
		driver.close();
	}

}
