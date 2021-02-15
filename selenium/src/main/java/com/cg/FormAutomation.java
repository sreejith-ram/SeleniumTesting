package com.cg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormAutomation {
	WebDriver driver;
	
	public FormAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println("Title is : " + driver.getTitle());
		driver.manage().window().maximize();
	}
	
	public void formfilling()
	{
		//First Name
		WebElement frstName=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		frstName.sendKeys("Sreejith");
		
		//Second Name
		WebElement lstName=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		lstName.sendKeys("TR");
		
		//Address
		WebElement address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		address.sendKeys("3/478, South Pavady, Kollengode, Palakkad - 678506");
		
		//Email ID
		WebElement email=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		email.sendKeys("abc@gmail.com");
		
		//Phone Number
		WebElement phoneNumber=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		phoneNumber.sendKeys("9747785393");
		
		//Radio Male or Female
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		WebElement radio2=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		radio1.click();
		
		//CheckBox Hobbies
		WebElement checkBox1=driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		checkBox1.click();
		WebElement checkBox2=driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		checkBox2.click();
		
		//Multiple Drop Down List Languages
		WebElement selectList = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
        Select select = new Select(selectList);
        select.selectByVisibleText("English");
//        select.selectByVisibleText("Saab");
//		Select languages = new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
//		if(languages.isMultiple()){
//		languages.selectByIndex(1);
        
        //Drop Down List Skills
        
	}
}
