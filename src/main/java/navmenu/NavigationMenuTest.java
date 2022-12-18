package navmenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMenuTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();;
		
		// Test Case ID: 1001
		driver.get("https://www.amazon.in/");
		WebElement miniTv = driver.findElement(By.linkText("Amazon miniTV"));
		miniTv.click();
		System.out.println(driver.getTitle());
		
		// Test Case ID: 1002
		driver.get("https://www.amazon.in/");
		WebElement sell = driver.findElement(By.linkText("Sell"));
		sell.click();
		System.out.println(driver.getTitle());
		
		// Test Case ID: 1003
		driver.get("https://www.amazon.in/");
		WebElement bestSellers = driver.findElement(By.linkText("Best Sellers"));
		bestSellers.click();
		System.out.println(driver.getTitle());
		
		// Test Case ID: 1004
		driver.get("https://www.amazon.in/");
		WebElement mobiles = driver.findElement(By.partialLinkText("Mobiles"));
		mobiles.click();
		System.out.println(driver.getTitle());
		
		// Test Case ID: 1005
		driver.get("https://www.amazon.in/");
		WebElement deals = driver.findElement(By.linkText("Today's Deals"));
		deals.click();
		System.out.println(driver.getTitle());
		
		// Test Case ID: 1006
		driver.get("https://www.amazon.in/");
		WebElement service = driver.findElement(By.linkText("Customer Service"));
		service.click();
		System.out.println(driver.getTitle());
		
		// Test Case ID: 1007
		driver.get("https://www.amazon.in/");
		WebElement electronics= driver.findElement(By.partialLinkText("Electronics"));
		electronics.click();
		System.out.println(driver.getTitle());
		
		// Test Case ID: 1008
		driver.get("https://www.amazon.in/");
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		prime.click();
		System.out.println(driver.getTitle());
		
		// Test Case ID: 1009
		driver.get("https://www.amazon.in/");
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		fashion.click();
		System.out.println(driver.getTitle());
		
		// Test Case ID: 1010
		driver.get("https://www.amazon.in/");
		WebElement home = driver.findElement(By.partialLinkText("Kitchen"));
		home.click();
		System.out.println(driver.getTitle());

		// Test Case ID: 1011
		driver.get("https://www.amazon.in/");
		WebElement hamburger = driver.findElement(By.id("nav-hamburger-menu"));
		hamburger.click();

		driver.close();
	}

}
