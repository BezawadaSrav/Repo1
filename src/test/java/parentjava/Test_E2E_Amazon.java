package parentjava;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;

import Maven_Project.Amazon.Locators.Locators1;
import Maven_Project.Amazon.Locators.Locators2;
import Maven_Project.Amazon.Locators.Locators3;


public class Test_E2E_Amazon extends Parent{
	
	
//	public static void main(String args[]) throws AWTException, FileNotFoundException, IOException, InterruptedException {
		
	
	@Test
	public void m1() throws FileNotFoundException, IOException, AWTException, InterruptedException
	{
//	WebDriverManager.chromedriver().setup();
//	ChromeOptions op = new ChromeOptions();
//	op.addArguments("--remote-allow-origins=*");
//	op.addExtensions(new File("C:\\Users\\1945952\\Downloads\\HUB selector.crx"));
//	WebDriver w = new ChromeDriver(op);
//	w.manage().window().maximize();
//	w.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		initializeDriver();
		
		Locators1 lo=goTo();
//		logger.debug("LANDING PAGE");
		logger.info("Landing Page");
		Thread.sleep(5000);
	
//	JavascriptExecutor js = (JavascriptExecutor) w;
//	js.executeScript("arguments[0].value=arguments[1]", w.findElement(By.cssSelector("#ap_email")), "8121353123");
//	w.findElement(By.xpath("//h1[@class='a-spacing-small']")).submit();
//	Properties p = new Properties();
//	p.load(new FileInputStream("C:\\Users\\1945952\\Eclipse-Workspace-New\\Java_Topic\\src\\proper.properties"));
//	WebElement w1 = w.findElement(By.xpath("//div[contains(@class,'a-row')]/span"));
//	String s = p.getProperty(w1.getText());
//	w.findElement(By.cssSelector("#ap_password")).sendKeys(s);
//	w.findElement(By.cssSelector("#signInSubmit")).sendKeys(Keys.ENTER);
	String s="8121353123";
//	Locators1 lo=new Locators1(w);
	
	String pro="iphone";
	String product = "Apple iPhone 13 (128GB) - Midnight";
	Locators2 lo2=lo.login(s);
	Thread.sleep(5000);
	logger.info("Login Page");
	lo2.search(pro);
	Locators3 l3=lo2.selection(product);
	logger.info("Product selection");
//	l3.addToCart();
//	Locators4 l4=l3.goToCart();
	
	
//	Thread.sleep(4000);
//
//	List<WebElement> ll = w
//			.findElements(By.xpath("//div[@data-name='Active Items']//div[@class='sc-item-content-group']"));
//	ll.stream().filter(i -> i.findElement(By.tagName("a")).getText().equalsIgnoreCase(product))
//			.forEach(i -> (new Select(i.findElement(By.tagName("select")))).selectByValue("1"));
//	ll.stream().filter(i -> !(i.findElement(By.tagName("a")).getText().equalsIgnoreCase(product)))
//			.forEach(i -> (new Select(i.findElement(By.tagName("select")))).selectByValue("0"));
//	w.findElement(By.cssSelector("#gutterCartViewForm")).submit();
	
	
//	Locators5 l5=l4.selectProduct(product);
//	String as="Sravani Bezawada";
//	Locators6 l6=l5.selectAddress(as);
	
//	Wait<WebDriver> fw = new FluentWait<WebDriver>(w).withTimeout(Duration.ofMillis(8000))
//			.pollingEvery(Duration.ofMillis(4000)).ignoring(org.openqa.selenium.NoSuchElementException.class);
//	WebElement ww1 = fw.until(new Function<WebDriver, WebElement>() {
//		public WebElement apply(WebDriver w) {
//			return w.findElement(By.xpath("//span[text()='Cash on Delivery/Pay on Delivery']"));
//		}
//	});
//	Actions a = new Actions(w);
//	a.moveToElement(w.findElement(By.xpath("//span[text()='Cash on Delivery/Pay on Delivery']"))).click().build()
//			.perform();
//	w.findElement(By.xpath("//input[@class='a-button-input a-button-text']")).click();
//	l6.selectDelivery();
	
}
	
//	@Test
	public void m3()
	{
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\1945952\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
////		ChromeOptions op=new ChromeOptions();
//		EdgeOptions op=new EdgeOptions();
//		op.addArguments("--remote-allow-origins=*");
////		op.addExtensions(new File("C:\\Users\\1945952\\Downloads\\ndgimibanhlabgdgjcpbbndiehljcpfh-3.0.3-Crx4Chrome.com.crx"));
////		WebDriver w=new ChromeDriver(op);
//		WebDriver w=new EdgeDriver(op);
		l.get().get("https://rahulshettyacademy.com/client/");
		l.get().manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		l.get().manage().window().maximize();
		Actions a=new Actions(l.get());
//		w.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		Wait ww=new WebDriverWait(w,Duration.ofMillis(5000));
		
		a.moveToElement(l.get().findElement(By.xpath("//input[@type='email']"))).click().sendKeys("bsrav567@gmail.com").build().perform();
		a.moveToElement(l.get().findElement(By.xpath("//input[@type='password']"))).click().sendKeys("Sravani@123").build().perform();
		a.moveToElement(l.get().findElement(By.xpath("//input[@type='submit']"))).click().build().perform();
	}
//	ChromeOptions op = new ChromeOptions();
//	op.addArguments("--remote-allow-origins=*");
//	op.addExtensions(new File("C:\\Users\\1945952\\Downloads\\HUB selector.crx"));
//	WebDriver w = new ChromeDriver(op);
//	w.manage().window().maximize();
//	w.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		initializeDriver();
		
	
//	@Test
	
	public void m2() throws FileNotFoundException, IOException, AWTException, InterruptedException
	{
//	WebDriverManager.chromedriver().setup();
//	ChromeOptions op = new ChromeOptions();
//	op.addArguments("--remote-allow-origins=*");
//	op.addExtensions(new File("C:\\Users\\1945952\\Downloads\\HUB selector.crx"));
//	WebDriver w = new ChromeDriver(op);
//	w.manage().window().maximize();
//	w.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		initializeDriver();
		
		Locators1 lo=goTo();
//		logger.debug("LANDING PAGE");
		logger.info("Landing Page");
		Thread.sleep(5000);
	
//	JavascriptExecutor js = (JavascriptExecutor) w;
//	js.executeScript("arguments[0].value=arguments[1]", w.findElement(By.cssSelector("#ap_email")), "8121353123");
//	w.findElement(By.xpath("//h1[@class='a-spacing-small']")).submit();
//	Properties p = new Properties();
//	p.load(new FileInputStream("C:\\Users\\1945952\\Eclipse-Workspace-New\\Java_Topic\\src\\proper.properties"));
//	WebElement w1 = w.findElement(By.xpath("//div[contains(@class,'a-row')]/span"));
//	String s = p.getProperty(w1.getText());
//	w.findElement(By.cssSelector("#ap_password")).sendKeys(s);
//	w.findElement(By.cssSelector("#signInSubmit")).sendKeys(Keys.ENTER);
	String s="8121353123";
//	Locators1 lo=new Locators1(w);
	
	String pro="iphone";
	String product = "Apple iPhone 13 (128GB) - Midnight";
	Locators2 lo2=lo.login(s);
	Thread.sleep(5000);
	logger.info("Login Page");
	lo2.search(pro);
	Locators3 l3=lo2.selection(product);
	logger.info("Product selection");
//	l3.addToCart();
//	Locators4 l4=l3.goToCart();
	
	
//	Thread.sleep(4000);
//
//	List<WebElement> ll = w
//			.findElements(By.xpath("//div[@data-name='Active Items']//div[@class='sc-item-content-group']"));
//	ll.stream().filter(i -> i.findElement(By.tagName("a")).getText().equalsIgnoreCase(product))
//			.forEach(i -> (new Select(i.findElement(By.tagName("select")))).selectByValue("1"));
//	ll.stream().filter(i -> !(i.findElement(By.tagName("a")).getText().equalsIgnoreCase(product)))
//			.forEach(i -> (new Select(i.findElement(By.tagName("select")))).selectByValue("0"));
//	w.findElement(By.cssSelector("#gutterCartViewForm")).submit();
	
	
//	Locators5 l5=l4.selectProduct(product);
//	String as="Sravani Bezawada";
//	Locators6 l6=l5.selectAddress(as);
	
//	Wait<WebDriver> fw = new FluentWait<WebDriver>(w).withTimeout(Duration.ofMillis(8000))
//			.pollingEvery(Duration.ofMillis(4000)).ignoring(org.openqa.selenium.NoSuchElementException.class);
//	WebElement ww1 = fw.until(new Function<WebDriver, WebElement>() {
//		public WebElement apply(WebDriver w) {
//			return w.findElement(By.xpath("//span[text()='Cash on Delivery/Pay on Delivery']"));
//		}
//	});
//	Actions a = new Actions(w);
//	a.moveToElement(w.findElement(By.xpath("//span[text()='Cash on Delivery/Pay on Delivery']"))).click().build()
//			.perform();
//	w.findElement(By.xpath("//input[@class='a-button-input a-button-text']")).click();
//	l6.selectDelivery();
	
}
	
}
