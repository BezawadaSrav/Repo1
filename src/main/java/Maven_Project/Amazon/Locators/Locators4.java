package Maven_Project.Amazon.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Locators4 {
	WebDriver w;
	public Locators4(WebDriver w)
	{
		this.w=w;
		PageFactory.initElements(w, this);
	}
	@FindBy(xpath="//div[@data-name='Active Items']//div[@class='sc-item-content-group']")
	List<WebElement> ll;
	By e1=By.tagName("a");
	@FindBy(css="#gutterCartViewForm")
	WebElement cartview;
	public Locators5 selectProduct(String product) {
		ll.stream().filter(i -> i.findElement(e1).getText().equalsIgnoreCase(product))
				.forEach(i -> (new Select(i.findElement(By.tagName("select")))).selectByValue("1"));
		ll.stream().filter(i -> !(i.findElement(e1).getText().equalsIgnoreCase(product)))
				.forEach(i -> (new Select(i.findElement(By.tagName("select")))).selectByValue("0"));
		cartview.submit();
		
//		Locators5 l5=new Locators5(w);
		return new Locators5(w);

	}
}
