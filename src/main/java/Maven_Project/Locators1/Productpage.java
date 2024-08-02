package Maven_Project.Locators1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Maven_Project.AbstractComp.Abstractclass1;

public class Productpage extends Abstractclass1 {
WebDriver w;
	
	

	public Productpage(WebDriver ww) {
		super(ww);
		this.w = ww;
		PageFactory.initElements(w, this);

		// TODO Auto-generated constructor stub
	}

    By TEFL = By.cssSelector("#toast-container div");
	By productlist = By.xpath("//h5[@style='text-transform: uppercase;']");
	By selectproduct = By.xpath("following-sibling::button[2]");
	By GW1 = By.cssSelector("#toast-container div");
	public By GW2 = By.xpath("//ngx-spinner/div");
	
	By cart = By.cssSelector("button[class='btn btn-custom'] i[class='fa fa-shopping-cart']");

	public By Actions1() {
		GenericWait1(GW1);
		
		return TEFL;
		
//		Assert.assertEquals(w.findElement(TEFL).getText(), "Login Successfully");
	}

	public List<String> Actions2(String a2[]) {
		List<WebElement> l = w.findElements(productlist);
//		System.out.println("Enter products to be added : ");

		 List<String> asList = Arrays.asList(a2);

		for (String j : asList) {
			l.stream().filter(i -> i.getText().equalsIgnoreCase(j)).forEach(i -> i.findElement(selectproduct).click());

			
			GenericWait1(TEFL);
//			
//			Assert.assertEquals(w.findElement(TEFL).getText(), "Product Added To Cart");
//			
//			GenericWait2(GW2);
//			return asList;
		}
		
		return asList;
		

	}

}
