package Maven_Project.Amazon.Locators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Maven_Project.Amazon.Abstract.Abs1;

public class Locators6 extends Abs1{
WebDriver w;

public Locators6(WebDriver w)
{
	super(w);
	this.w=w;
	PageFactory.initElements(w, this);
}
@FindBy(xpath="//div[@data-pmts-component-id='pp-GeKGBT-17']/div[6]//div/label/input")
WebElement cod;
@FindBy(xpath="//input[@class='a-button-input a-button-text']")
WebElement clk;
	public void selectDelivery() {

		fluentWait(cod);
		Actions a = new Actions(w);
		a.moveToElement(cod).sendKeys(Keys.ENTER).build().perform();
		clk.click();

	}
}
