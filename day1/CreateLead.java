package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateLead {
public static void main(String[]args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http:/leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lokeshwari");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kaviya");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Renuka");
	driver.findElement(By.name("departmentName")).sendKeys("CA");
	driver.findElement(By.name("description")).sendKeys("Hello, testleaf");
	driver.findElement(By.name("primaryEmail")).sendKeys("loki83@gmail.com");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println(driver.getTitle());
	
}
}
