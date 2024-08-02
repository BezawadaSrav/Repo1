package Maven_Project.Locators1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Maven_Project.Locators1.Paydetails;

public class checkout {
	WebDriver w;
	public checkout(WebDriver w)
	{
	this.w=w;	
	}
	
	By cart=By.xpath("//div[@class='cartSection']/h3");
	By checkoutbutton=By.cssSelector("div[class='subtotal cf ng-star-inserted'] ul li:nth-child(3) button");
	public List<WebElement> Getitemlist() throws InterruptedException
	{
	Thread.sleep(4000);
	List<WebElement> s4=w.findElements(cart);
//	Assert.assertEquals(s4.stream().map(i->i.getText()).collect(Collectors.toList()).containsAll(asList),true);
	
	return s4;
	}
	public Paydetails Gotopayment() throws InterruptedException
	{
	JavascriptExecutor js=(JavascriptExecutor)w;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	w.findElement(checkoutbutton).click();
	
	Paydetails pd=new Paydetails(w);
	
	return pd;

}
}
