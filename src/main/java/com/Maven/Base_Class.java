package com.Maven;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;

	// 1.Browser Launch
	public static WebDriver launchBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	// 2.URL Launch
	public static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;
	}

	// 3.Click
	public static void clickButton(WebElement element) {
		element.click();
	}

	// 4.Send Keys
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
	}

	// 5.ScreenShot
	public static void screenShot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(location);
		FileUtils.copyFile(src, des);
	}

	// 6.Quit
	public static void terminateBrowser() {
		driver.quit();
	}

	// 7.JS Executor
	public static WebDriver jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("argument[0].click();", element);
		return driver;

	}

	// 8.implicit wait

	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// 9 scrollby
	public static void up() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
	}

	// 10 scrolldown
	public static void down() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");
	}

	// 11Actions obj
	private static Actions actionsObj() {
		Actions a = new Actions(driver);
		return a;

	}

	// 12 Actions click
	public static void actionsclick(WebElement element) {
		actionsObj().click(element).build().perform();

	}

	// 13 context click
	public static void contextClick(WebElement element) {
		actionsObj().contextClick(element).build().perform();
	}

	// 14 move to element
	public static void moveToelement(WebElement element) {
		actionsObj().moveToElement(element).build().perform();
	}

	// 15 Drag and Drop
	public static void dragAnddrop(WebElement src, WebElement des) {
		actionsObj().dragAndDrop(src, des).build().perform();

	}

	// 16 Frame
	public static void frameIdOrName(String IdOrName) {
		driver.switchTo().frame(IdOrName);
	}

	// 17 dropdown selectbyIndex
	public static void dropdownIndex() {
		WebElement w = driver.findElement(By.xpath("//select[@class='_2YxCDZ']"));
		Select s = new Select(w);
		s.selectByIndex(2);
	}

	// 18 select by value
	public static void dropdownValue() {
		WebElement l = driver.findElement(By.xpath("//select[@class='_2YxCDZ']"));
		Select a = new Select(l);
		a.selectByValue("30000");
	}

	// 19 Multiples Window handling
	public static void getMultipleWindows() {
		Set<String> windowsHandles = driver.getWindowHandles();
		Iterator<String> iteraror = windowsHandles.iterator();
		while (iteraror.hasNext()) {
			String next = iteraror.next();
			driver.switchTo().window(next);
		}
	}

	// 20 Frame index
	public static void frameIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	
		

}
