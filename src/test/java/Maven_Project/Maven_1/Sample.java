package Maven_Project.Maven_1;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Maven_Project.AbstractComp.Abstractclass1;
import Maven_Project.Locators1.Productpage;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1945952\\Downloads\\chromedriver_win32 _R\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\1945952\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
//		ChromeOptions op=new ChromeOptions();
		EdgeOptions op=new EdgeOptions();
		op.addArguments("--remote-allow-origins=*");
//		op.addExtensions(new File("C:\\Users\\1945952\\Downloads\\ndgimibanhlabgdgjcpbbndiehljcpfh-3.0.3-Crx4Chrome.com.crx"));
//		WebDriver w=new ChromeDriver(op);
		WebDriver w=new EdgeDriver(op);
		w.get("https://rahulshettyacademy.com/client/");
		w.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		w.manage().window().maximize();
		Actions a=new Actions(w);
//		w.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		Wait ww=new WebDriverWait(w,Duration.ofMillis(5000));
		
		a.moveToElement(w.findElement(By.xpath("//input[@type='email']"))).click().sendKeys("bsrav567@gmail.com").build().perform();
		a.moveToElement(w.findElement(By.xpath("//input[@type='password']"))).click().sendKeys("Sravani@123").build().perform();
		a.moveToElement(w.findElement(By.xpath("//input[@type='submit']"))).click().build().perform();
//		Assert.assertEquals(w.findElement(By.cssSelector("#toast-container div")).getText(), "Login Successfully");
		
		
		
		
//		-----------------------------------Products Page-----------------------------------
		Productpage ppl=new Productpage(w);
		Abstractclass1 ab=new Abstractclass1(w);
		By TEFL=ppl.Actions1();
		Assert.assertEquals(w.findElement(TEFL).getText(), "Login Successfully");
		System.out.println("Enter products to be added : ");
		Scanner s1=new Scanner(System.in);
		String p=s1.nextLine();
		String[] a2 = p.split(",");
		List<String> asList=ppl.Actions2(a2);
		
//		
//		ab.GenericWait1(TEFL);
		
		Assert.assertEquals(w.findElement(TEFL).getText(), "Product Added To Cart");
		
		ab.GenericWait2(ppl.GW2);
		ppl.gotocart();
		
		
		
//		-----------------------------------------------------Product page End-------------------------------//
		Thread.sleep(4000);
		List<WebElement> s4=w.findElements(By.xpath("//div[@class='cartSection']/h3"));
		Assert.assertEquals(s4.stream().map(i->i.getText()).collect(Collectors.toList()).containsAll(asList),true);
		JavascriptExecutor js=(JavascriptExecutor)w;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		Actions aa=new Actions(w);
//		ww.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("div[class='subtotal cf ng-star-inserted'] ul li:nth-child(3) button"))));
//		ww.until(ExpectedConditions.elementToBeClickable(w.findElement(By.cssSelector("div[class='subtotal cf ng-star-inserted'] ul li:nth-child(3) button"))));
		Thread.sleep(3000);
		w.findElement(By.cssSelector("div[class='subtotal cf ng-star-inserted'] ul li:nth-child(3) button")).click();
		System.out.println("Enter date :");
		
		String i1=s1.next();
		String p1=i1.split(",")[0];
		String p2=i1.split(",")[1];
//		String s8=i.toString();
//		String[] str1=s8.split(",");
//		List<String> l2=Arrays.asList(str1);
		
		Select ss=new Select(w.findElement(By.xpath("(//select[@class='input ddl'])[1]")));
		ss.selectByVisibleText(p1);
		Select ss2=new Select(w.findElement(By.xpath("(//select[@class='input ddl'])[2]")));
		ss2.selectByVisibleText(p2);
		
//		w.findElement(with(By.tagName("input")).below(w.findElement(By.xpath("//div[text()='Credit Card Number '][0]")))).sendKeys("567");         
		w.findElement(By.xpath("//div[text()='CVV Code ']/following-sibling::input")).sendKeys("567");
		
//		WebElement w6=w.findElement(By.xpath("//div[@class='form-group']/input")).sendKeys(a2)
				
		String q=s1.next();
		w.findElement(By.xpath("//div[@class='form-group']/input")).sendKeys(q);
		WebDriverWait w5=new WebDriverWait(w,Duration.ofMillis(3000));
		w5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-group']/input")));
		List<WebElement> w7=w.findElements(By.xpath("//button[@class='ta-item list-group-item ng-star-inserted']"));
		w7.stream().filter(i->i.getText().equalsIgnoreCase(q)).forEach(i->i.click());
		w.findElement(By.xpath("//a[text()='Place Order ']")).click();
//		System.out.println(w.findElement(By.cssSelector("#toast-container div")).getText());
		Assert.assertEquals(w.findElement(By.cssSelector("#toast-container div")).getText(),"Order Placed Successfully");
		
		

		
		
//		w.findElement(By.xpath("//ngx-spinner/div")
		
		
//		System.out.println("Enter products to be added : ");
//		Scanner s1=new Scanner(System.in);
//		String p=s1.next();
//		Assert.assertEquals(w.findElement(By.cssSelector("#toast-container div")).getText(), "Login Successfully");
//		 l.stream().filter(i->i.getText().contains(p)).map(i->l1.get(l.indexOf(i))).forEach(i->i.click());
		
		
		
		 
		 
		
		
		
//		if(w.findElement(By.cssSelector("#toast-container div ")).getText().equalsIgnoreCase("Login Successfully"))
//		{
//		l.stream().filter(i->i.getText().equalsIgnoreCase(p)).forEach(i->w.findElement(By.cssSelector("//button[@class='btn w-10 rounded']")).click());	
//	}
	

	}

}
