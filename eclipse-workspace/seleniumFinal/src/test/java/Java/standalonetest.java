package Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class standalonetest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		LandingPage landingPage=new LandingPage(driver);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("mohanmarkande5@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Mohan@123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
        WebElement prod=products.stream().filter(product->
        product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
	}

}
