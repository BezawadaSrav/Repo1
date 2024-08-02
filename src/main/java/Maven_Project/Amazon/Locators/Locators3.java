package Maven_Project.Amazon.Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Maven_Project.Amazon.Abstract.Abs1;

public class Locators3 extends Abs1 {
	WebDriver w;

	public Locators3(WebDriver w) {
		super(w);
		this.w = w;
		PageFactory.initElements(w, this);
	}

	@FindBy(xpath = "//div[@id='availability']/span")
	public WebElement stock;

	By stock1 = By.xpath("//div[@id='availability']/span");
	@FindBy(css = "#add-to-cart-button")
	WebElement addtocartbtn;
//	@FindBy(xpath = "//span[@class='nav-cart-icon nav-sprite']/parent::div")
	@FindBy(css = "#nav-cart-count-container")
	WebElement cartbtn;

	public void addToCart() {
		Set<String> t = w.getWindowHandles();
		java.util.Iterator<String> z = t.iterator();
		String d1 = z.next();
		String d2 = z.next();
		w.switchTo().window(d2);
//		Assert.assertEquals(stock.getText(), "In stock");
		addtocartbtn.submit();
	}

	public Locators4 goToCart() throws InterruptedException {

		cartbtn.click();
		
		Locators4 l4=new Locators4(w);
		return l4;
	}

}
