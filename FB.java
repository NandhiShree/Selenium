package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjEm4qU5bn6AhVEJCsKHYAVDTYYABAAGgJzZg&ohost=www.google.com&cid=CAESauD24-dR0Ev_owprvgabnRcb9qsGxbQ6bTBJVkGg7SAQO5vJO4vKGSVs9_cLInuhd6wuDvENdU5hgUqoNbmYm0MW_KKWzokUQ7qCuYoddOFvE-uYEySYLmCR97Pbh5IAuxH8x1X58XlHZdI&sig=AOD64_1GiVd5gIQv82NrTFdbwSkyvCXgzg&q&adurl&ved=2ahUKEwi-s4OU5bn6AhWo-jgGHZiKA8sQ0Qx6BAgDEAE");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("nandhi");
		driver.findElement(By.name("lastname")).sendKeys("Shree");
		driver.findElement(By.name("reg_email__")).sendKeys("nandhishree593580@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nandhishree593580@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("nandhishree593580");
	
		 WebElement dateElement = driver.findElement(By.name("birthday_day"));
		 Select dateDropdown = new Select (dateElement);
		 dateDropdown.selectByVisibleText("22");
		 
		 WebElement monthElement = driver.findElement(By.name("birthday_month"));
		 Select monthDropdown = new Select (monthElement);
		 monthDropdown.selectByVisibleText("Aug");
		 
		 WebElement yearElement = driver.findElement(By.name("birthday_year"));
		 Select yearDropdown = new Select (yearElement);
		 yearDropdown.selectByVisibleText("2001");
		 
		 driver.findElement(By.name("sex")).click();
		
		 driver.findElement(By.name("websubmit")).click();

	}

}
