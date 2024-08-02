package Maven_Project.Amazon.Abstract;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abs1 {
	WebDriver w;
	public Abs1(WebDriver w)
	{
		this.w=w;
	}
	public void webWait(By waitw)
	{
		WebDriverWait ww = new WebDriverWait(w, Duration.ofMillis(10000));
		ww.until(ExpectedConditions
				.visibilityOfElementLocated(waitw));
	}
	
	public void fluentWait(WebElement cod)
	{

		Wait<WebDriver> fw = new FluentWait<WebDriver>(w).withTimeout(Duration.ofMillis(8000))
				.pollingEvery(Duration.ofMillis(4000)).ignoring(org.openqa.selenium.NoSuchElementException.class);
		WebElement ww1 = fw.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver w) {
				return cod;
			}
		});

	}
}
