package Maven_Project.AbstractComp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Maven_Project.Locators1.checkout;
//import Maven_Project.Locators1.checkout;

public class Abstractclass1 {
WebDriver w;
	
	public Abstractclass1(WebDriver ww)
	{
		this.w=ww;
//		PageFactory.initElements(w, this);
		
	}
		
	
	public void GenericWait1(By TEFL)
	{
	WebDriverWait ww1 = new WebDriverWait(w, Duration.ofSeconds(4));
	ww1.until(ExpectedConditions.visibilityOfElementLocated(TEFL));

}
	public void GenericWait2(By locator) {
		WebDriverWait ww1 = new WebDriverWait(w, Duration.ofSeconds(4));
		ww1.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	
	@FindBy(css = "button[class='btn btn-custom'] i[class='fa fa-shopping-cart']")
	WebElement css1;

	public checkout gotocart() {
//		GenericWait2(GW2);
		css1.click();
		
		checkout cp=new checkout(w);
		
		return cp;

}
}
