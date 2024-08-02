package Maven_Project.Maven_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Maven_Project.AbstractComp.Abstractclass1;
import Maven_Project.Locators1.Login;
import Maven_Project.Locators1.Paydetails;
import Maven_Project.Locators1.Productpage;
import Maven_Project.Locators1.checkout;

public class E2E_TC extends Parent{
	
	@Test
	public void M1() throws InterruptedException, FileNotFoundException, IOException {
//		main1();
		Login l = gotourl();
		
		Actions a = new Actions(w);
		String mail = "bsrav567@gmail.com";
		String pass = "Sravani@123";
//		Login_Page l = new Login_Page(w);
		Productpage ppl = l.Login(mail, pass);

//				-----------------------------------Products Page-----------------------------------
//				Product_Page_Locators ppl=new Product_Page_Locators(w);
		Abstractclass1 ab = new Abstractclass1(w);
		By TEFL = ppl.Actions1();
		Assert.assertEquals(w.findElement(TEFL).getText(), "Login Successfully");
		System.out.println("Enter products to be added : ");
		Scanner s1 = new Scanner(System.in);
		String p = s1.nextLine();
		String[] a2 = p.split(",");
		List<String> asList = ppl.Actions2(a2);
		Assert.assertEquals(w.findElement(TEFL).getText(), "Product Added To Cart");
		ab.GenericWait2(ppl.GW2);
		checkout gc = ppl.gotocart();

//				-----------------------------------------------------Product page End-------------------------------//

//				--------------------------------------------------Checkout_Page--------------------------
		List<WebElement> s4 = gc.Getitemlist();

		Assert.assertEquals(s4.stream().map(i -> i.getText()).collect(Collectors.toList()).containsAll(asList), true);

		Paydetails gp = gc.Gotopayment();
//			---------------------------------------------------------END----------
		System.out.println("Enter date :");
		String i1 = s1.next();
		String p1 = i1.split(",")[0];
		String p2 = i1.split(",")[1];
		String cvv = "567";
		gp.Carddetails(p1, p2, cvv);
		System.out.println("Enter country name: ");
		String q = s1.next();
		gp.Selectcountry(q);
		gp.placeorder();
		Assert.assertEquals(w.findElement(By.cssSelector("#toast-container div")).getText(),
				"Order Placed Successfully");
		

	}

}

//	----------------------
