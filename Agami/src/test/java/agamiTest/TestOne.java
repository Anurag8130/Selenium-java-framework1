package agamiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestOne {

			public static WebDriver driver;
			public static int browser;
			public static String BrowserName;

			public static void main(String[] args) throws InterruptedException {

			for (browser = 1; browser <= 3; browser++){
			if (browser == 1) {

			System.setProperty("webdriver.gecko.driver", "G:\\programs\\testautomation\\src\\test\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			BrowserName = "Mozilla Firefox Browser: ";
			}
			else if (browser == 2) {

			System.setProperty("webdriver.chrome.driver", "G:\\programs\\testautomation\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			BrowserName = "Google Chrome Browser: ";
			}
			else if (browser == 3){
			System.setProperty("webdriver.ie.driver","G:\\programs\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			BrowserName = "Internet Explorer Browser: ";
			}

			driver.get("https://gsstech.titletransactiondealer.online/");

			Thread.sleep(2000);

			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("agami.test001@gmail.com");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("123456");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/button[1]")).click();

			String PageTitle = driver.getTitle();

			if (PageTitle.equals("Title Transaction Dealer")){
			System.out.println(BrowserName + "– Title Transaction Dealer Application Launched – Passed");
			}
			else {
			System.out.println(BrowserName + " – Title Transaction Dealer Application Not Launched – Failed");
			}
			driver.close();
			}

	}

}
