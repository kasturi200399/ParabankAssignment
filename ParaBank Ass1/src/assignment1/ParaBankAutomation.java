package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Load chromeDriver
		System.setProperty("WebDriver.chrome.driver","D:\\ParaBank Assignment\\ParaBank Ass1\\chromedriver.exe");
		//Opening the Chrome Browser
		WebDriver driver=new ChromeDriver();  // Create an object of the Webdriver
		driver.manage().window().maximize();
			
		driver.get("https://parabank.parasoft.com/parabank/index.htm"); //Open the website
		
		Thread.sleep(3000);  // Sleep for 3 sec
		
		//Finding xath for Register link
		
		WebElement registerlink=driver.findElement(By.xpath("//a[text()='Register']"));
		
		registerlink.click();   // Click on Register link
		
		Thread.sleep(3000);  // Sleep for 3 sec
		
		// Fill the Signup/Registration Form
		
		//First Name
		WebElement Fname=driver.findElement(By.xpath("//input[@id='customer.firstName']"));
		Fname.sendKeys("Kasturi");     // input first name
		
		Thread.sleep(1000);  // Sleep for 1 sec
		
		// Last Name
		WebElement Lname=driver.findElement(By.xpath("//input[@id='customer.lastName']"));
		Lname.sendKeys("Aher");      // Input the Last Name
		Thread.sleep(1000);  // Sleep for 1 sec
		
		// Address
		
		WebElement Address=driver.findElement(By.xpath("//input[@id='customer.address.street']"));
		Address.sendKeys("Warje");    //Input the Address
		Thread.sleep(1000);  // Sleep for 1 sec
		
		// City
		
		WebElement City=driver.findElement(By.xpath("//input[@id='customer.address.city']"));
		City.sendKeys("Pune");       // Input the City
		Thread.sleep(1000);  // Sleep for 1 sec
		
		// State
		
		WebElement State=driver.findElement(By.xpath("//input[@id='customer.address.state']"));
		State.sendKeys("Maharashtra");   // Input the State Name
		Thread.sleep(1000);  // Sleep for 1 sec
		
		//Zip Code  
		
		WebElement ZipCode=driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
		ZipCode.sendKeys("411058");    // Input the Zip code
		Thread.sleep(1000);  // Sleep for 1 sec
		
		//Phone No   
		
		WebElement PhoneNo=driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
		PhoneNo.sendKeys("9238472383");   // Input the Phone Number
		Thread.sleep(1000);  // Sleep for 1 sec
		
		//SNN    
		
		WebElement SNN=driver.findElement(By.xpath("//input[@id='customer.ssn']"));
		SNN.sendKeys("982344");
		Thread.sleep(1000);  // Sleep for 1 sec
		
		//Username
		
		WebElement Username=driver.findElement(By.xpath("//input[@id='customer.username']"));
		Username.sendKeys("kasturiaher");     // Input the username
		Thread.sleep(1000);  // Sleep for 1 sec
		
		// Password
		
		WebElement Password=driver.findElement(By.xpath("//input[@id='customer.password']"));
		Password.sendKeys("password1");    // Input the Password
		Thread.sleep(1000);  // Sleep for 1 sec
		
		// Confirm Password
		
		WebElement CnfPassword=driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
		CnfPassword.sendKeys("password1");    // Input the Confirm Password
		Thread.sleep(1000);  // Sleep for 1 sec
		
		
		// Submit Button
		
		WebElement SubmitBtn=driver.findElement(By.xpath("//input[@value='Register']"));
		SubmitBtn.click();     // Click on Submit Button
		Thread.sleep(4000);  // Sleep for 4 sec
		
		driver.close();     // Close the chrome
	}

}
