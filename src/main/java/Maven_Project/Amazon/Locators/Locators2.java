
package Maven_Project.Amazon.Locators;

import java.awt.AWTException;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Maven_Project.Amazon.Abstract.Abs1;

public class Locators2 extends Abs1{
	WebDriver w;
	public Locators2(WebDriver w) {
		super(w);
		this.w = w;
		PageFactory.initElements(w, this);
	}
//	@FindBy(how=How.CSS,using="#twotabsearchtextbox")
//	WebElement s;

	@FindBy(css = "#twotabsearchtextbox")
	WebElement enter;
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nxtbtn;
	@FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']/parent::a")
	List<WebElement> po;

	By wait = By.xpath("//a[contains(@class,'s-pagination-next')]");
	By wait2 = By.xpath("//*[text()='Next']");

	public void search(String pro) throws AWTException {
		enter.sendKeys(pro, Keys.ENTER);

	}

	public Locators3 selection(String product) throws AWTException {

		for (int j = 0; !(nxtbtn.getAttribute("class").contains("s-pagination-disabled")); j++)

		{
			webWait(wait);
			po.stream().filter(i -> i.getText().equalsIgnoreCase(product)).limit(1)
					.forEach(i -> i.sendKeys(Keys.ENTER));
			List<WebElement> e = po.stream().filter(i -> i.getText().equalsIgnoreCase(product)).limit(1)
					.collect(Collectors.toList());
			if (e.size() > 0) {
				break;
			}
			w.findElement(wait).sendKeys(Keys.ENTER);
			webWait(wait2);

		}
		
		Locators3 l3=new Locators3(w);
		return l3;
	}

}
