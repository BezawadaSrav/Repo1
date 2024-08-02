package Maven_Project.Amazon.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators5 {
	WebDriver w;
	
	public Locators5(WebDriver w)
	{
		this.w=w;
		PageFactory.initElements(w,this);
	}
	@FindBy(xpath="//div[@class='a-radio']//span[@class='a-text-bold']")
	List<WebElement> ls;
	By addres=By.xpath("parent::span/parent::label/input");
	@FindBy(css="#address-list")
	WebElement al;
	public Locators6 selectAddress(String add) {
//		List<WebElement> ls = w.findElements(By.xpath("//div[@class='a-radio']//span[@class='a-text-bold']"));
		ls.stream().filter(i -> i.getText().equalsIgnoreCase(add))
				.map(i -> i.findElement(addres)).forEach(i -> i.click());
		al.submit();
		
		return new Locators6(w);

	}
}
