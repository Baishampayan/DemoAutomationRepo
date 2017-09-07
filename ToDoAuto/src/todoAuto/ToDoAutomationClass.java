package todoAuto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToDoAutomationClass {

	@Test
	public  void mainTest() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver wb;
//System.setProperty("webdriver.chrome.driver", "C");

		
		// Checking the Git Commit to do something in a got Repo
wb = new ChromeDriver();

wb.get("http://todomvc.com/examples/react/#/");

wb.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement e1 = wb.findElement(By.xpath("html/body/section/div/header/input[@class='new-todo']"));
		
		e1.sendKeys("abc");
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		wb.close();
		
		System.out.println("CCC");


	}

}
