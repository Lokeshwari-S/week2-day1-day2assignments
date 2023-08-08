package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContant {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("L");
		driver.findElement(By.id("lastNameField")).sendKeys("S");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Lokeshwari");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CA");
		driver.findElement(By.name("description")).sendKeys("Hello, testleaf");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("loki83@gmail.com");
		WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select st=new Select(State);
		st.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testleaf");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		System.out.println(driver.getTitle());
	}
}
