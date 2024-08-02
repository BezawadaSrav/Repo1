package parentjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Maven_Project.Amazon.Locators.Locators1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parent {
	static Logger logger;
	 ThreadLocal<WebDriver> l=new ThreadLocal<WebDriver>();
	static WebDriver w;
//	Locators1 lo;
//	public void Parent(We)
	@BeforeMethod
//	@Test
	public void initializeDriver() throws FileNotFoundException, IOException {
		
		logger = LogManager.getLogger(this.getClass());
		Properties p = new Properties();
		p.load(new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\Maven_Project\\AbstractComp\\Commonfol.properties"));

		if (p.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.edge.driver", "C:\\Users\\1945952\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
//			ChromeOptions op=new ChromeOptions();
//			op.addArguments("--remote-allow-origins=*");
//			op.addArguments("disable-infobars");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			op.addExtensions(new File("C:\\Users\\1945952\\Downloads\\HUB selector.crx"));
			
			
			w= new ChromeDriver(op);
			l.set(w);
			
			l.get().manage().window().maximize();

		}

	}
//	@BeforeMethod
	public Locators1  goTo() throws FileNotFoundException, IOException {
//		initializeDriver();
		
		
		l.get().get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		return w;
		Locators1 lo=new Locators1(l.get());
//		l.get().quit();
		return lo;
	}
	@AfterMethod
	public void terminate() {
		l.get().quit();
	}
	
	

}
