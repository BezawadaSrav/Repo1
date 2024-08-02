package Maven_Project.Locators1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paydetails {
WebDriver w;
	
	public Paydetails(WebDriver w)
	{
		this.w=w;
	}
	
	By day=By.xpath("(//select[@class='input ddl'])[1]");
	By year=By.xpath("(//select[@class='input ddl'])[2]");
	By cvv=By.xpath("//div[text()='CVV Code ']/following-sibling::input");
	By country=By.xpath("//div[@class='form-group']/input");
	
	By cl=By.xpath("//button[@class='ta-item list-group-item ng-star-inserted']");
	
	By po=By.xpath("//a[text()='Place Order ']");
	public void Carddetails(String p1,String p2,String key)
	{
		Select ss=new Select(w.findElement(day));
		ss.selectByVisibleText(p1);
		Select ss2=new Select(w.findElement(year));
		ss2.selectByVisibleText(p2);
		w.findElement(cvv).sendKeys(key);
		
	}
	public void Selectcountry(String q)
	{
		
		
		w.findElement(country).sendKeys(q);
		WebDriverWait w5=new WebDriverWait(w,Duration.ofMillis(3000));
		w5.until(ExpectedConditions.visibilityOfElementLocated(country));
		List<WebElement> w7=w.findElements(cl);
		w7.stream().filter(i->i.getText().equalsIgnoreCase(q)).forEach(i->i.click());
	}
	public void placeorder()
	{
		w.findElement(po).click();
	}


}
