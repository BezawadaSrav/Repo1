package Maven_Project.Maven_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Maven_Project.Locators1.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parent {
	WebDriver w;

	public Login gotourl() {
		w.get("https://rahulshettyacademy.com/client/");
		Login l = new Login(w);
		return l;
	}

	@BeforeMethod
	public void main1() throws FileNotFoundException, IOException {

		Properties p = new Properties();
		p.load(new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Maven_Project\\AbstractComp\\Commonfol.properties"));
		String p1 = p.getProperty("browser");

		if (p1.equalsIgnoreCase("edge")) {
			EdgeOptions op = new EdgeOptions();
			op.addArguments("--remote-allow-origins=*");
			w = new EdgeDriver(op);
		}

		else if (p1.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			w = new ChromeDriver(op);
		}
		w.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		w.manage().window().maximize();

	}
	
	@AfterMethod
	public void closeBrowser() {
		w.quit();
	}
}
