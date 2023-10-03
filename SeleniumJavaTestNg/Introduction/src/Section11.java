import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Section11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\UserDrive\\Prashan\\drivers\\chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//1. to get the count of "a" tag links
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. to get the count of "a" tag links in footer section.
		System.out.println(driver.findElement(By.id("gf-BIG")).findElements(By.tagName("a")).size());
		
		//3. to get the count of "a" tag links in first column of footer section.
		System.out.println(driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]//td[1]")).findElements(By.tagName("a")).size());
		
		
		//4. click the links of all "a" tag links in first column of footer section and check whether the link is opening and get the title
		List<WebElement> l = driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]//td[1]")).findElements(By.tagName("a"));
		
	//	Actions a = new Actions(driver);
		
		for(int i=1;i<driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]//td[1]")).findElements(By.tagName("a")).size();i++)
		{
			
			
			//a.moveToElement(l.get(i)).keyDown(Keys.CONTROL).click().build().perform();
			
			//Keyboard actions
			String clickOn = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			l.get(i).sendKeys(clickOn);
			
		}
		
		Set<String> s = driver.getWindowHandles();
		for(String b : s)
		{
			System.out.println(driver.switchTo().window(b).getTitle());
		}
		
		driver.quit();
		
	
		/*Assignment program
		
		driver.findElement(By.name("checkBoxOption2")).click();
		String boxname = driver.findElement(By.xpath("//input[@name='checkBoxOption2']/..")).getText();
		
		Thread.sleep(2000);
		
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(boxname);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(boxname);
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		
		System.out.println(driver.switchTo().alert().getText().contains(boxname));*/
		
		
		
		
		}

}
