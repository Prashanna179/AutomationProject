import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		String downloadPath = System.getProperty("user.dir");
		
		//Configure Download Path from chrome
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		//chromePrefs.put("download.default_directory", downloadPath+"/jpgFolder");
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs",chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		
		//Handling Window Authentication
		//driver.get("https://the-internet.herokuapp.com/");
		/*driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();*/
		
		//AutoIT
		
		driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Choose Files']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\prashanna.ramesh\\Downloads\\FileUpload.exe");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()=' Convert files']")).click();
		
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//i[@class='fa fa-download']/.."))));
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//i[@class='fa fa-download']/..")).click();
		Thread.sleep(5000);
	//	File f = new File(downloadPath+"/jpgFolder/LIC_Policy.jpg");
		File f = new File(downloadPath+"/LIC_Policy.jpg");
		if(f.exists())
		{
			System.out.println("File Found");
			if(f.delete())
			{
				System.out.println("File Deleted");
			}
		}

	}

}
