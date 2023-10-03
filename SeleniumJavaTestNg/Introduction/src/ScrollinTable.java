import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollinTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://10.93.5.171/COSEC/Login");
		driver.findElement(By.id("loginid")).sendKeys("21777");
		driver.findElement(By.id("pwd")).sendKeys("Temenos@179");
		
		driver.findElement(By.id("btnlogin")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[text()='Daily Attendance']/..")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement m  = driver.findElement(By.xpath("//table[@style=\"margin-top: 0% !important;\"]/.."));
		//js.executeScript("window.scrollBy(0,300)", m);
		js.executeScript("arguments[0].scrollIntoView(true)", m);
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");
	
		

	}

}
