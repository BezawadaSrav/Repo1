package Maven_Project.Amazon.Locators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators1 {
	WebDriver w;
	
	public Locators1(WebDriver w)
	{
		this.w=w;
		PageFactory.initElements(w,this);
	}
//	By email=By.cssSelector("#ap_email");
	
	
	
	@FindBy(css="#ap_email")
	WebElement email;
	@FindBy(xpath="//h1[@class='a-spacing-small']")
	WebElement submitbt;
	@FindBy(xpath="//div[contains(@class,'a-row')]/span")
	WebElement txt;
	@FindBy(css="#ap_password")
	WebElement pwd;
	@FindBy(css="#signInSubmit")
	WebElement signsubmit;
	public Locators2 login(String nbr) throws FileNotFoundException, IOException
	{
		
		JavascriptExecutor js = (JavascriptExecutor) w;
		js.executeScript("arguments[0].value=arguments[1]", email, nbr);
		submitbt.submit();
		Properties p = new Properties();
		p.load(new FileInputStream("C:\\Users\\1945952\\Eclipse-Workspace-New\\Java_Topic\\src\\proper.properties"));
		String s = p.getProperty(txt.getText());
		pwd.sendKeys(s);
		signsubmit.sendKeys(Keys.ENTER);
		
	
	Locators2 l2=new Locators2(w);
	return l2;
	}

}
