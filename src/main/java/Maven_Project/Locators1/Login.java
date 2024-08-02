package Maven_Project.Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	WebDriver w;
	public Login(WebDriver w)
	{
		this.w=w;
	}
	
	By email=By.xpath("//input[@type='email']");
	By pwd=By.xpath("//input[@type='password']");
	By button=By.xpath("//input[@type='submit']");
	public Productpage Login(String mail, String Pwd)
	{

	Actions a=new Actions(w);	
	a.moveToElement(w.findElement(email)).click().sendKeys(mail).build().perform();
	a.moveToElement(w.findElement(pwd)).click().sendKeys(Pwd).build().perform();
	a.moveToElement(w.findElement(button)).click().build().perform();

	Productpage ppl=new Productpage(w);
	
	return ppl;
}

}
