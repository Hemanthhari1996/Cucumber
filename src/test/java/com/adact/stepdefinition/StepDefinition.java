package com.adact.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.adact.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	
	public static WebDriver driver = RunnerClass.driver;
	
	@SuppressWarnings("deprecation")
	@Given("user Launch The Browser And Hit URL")
	public void user_Launch_The_Browser_And_Hit_URL() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/index.php");
	}

	@When("user Enter The User Name Into The UserName Field")
	public void user_Enter_The_User_Name_Into_The_UserName_Field() {

		WebElement Login = driver.findElement(By.xpath("//input[@id='username']"));
		Login.sendKeys("Hemanthhari");

	}

	@When("user Enter The Password Into The Password Field")
	public void user_Enter_The_Password_Into_The_Password_Field() {
		WebElement Pass = driver.findElement(By.xpath("//input[@id='password']"));
		Pass.sendKeys("Hemanthhari1");

	}

	@Then("user Click The Login Button")
	public void user_Click_The_Login_Button() {
		WebElement Button = driver.findElement(By.xpath("//input[@id='login']"));
		Button.click();
	}

	@When("user Select The Hotel Location")
	public void user_Select_The_Hotel_Location() {
		Select Loc = new Select(driver.findElement(By.xpath("//select[@name='location']")));

		Loc.selectByValue("London");
	}

	@When("user Select The Hotel Name")
	public void user_Select_The_Hotel_Name() {
		Select Hot = new Select(driver.findElement(By.xpath("//select[@name='hotels']")));

		Hot.selectByValue("Hotel Sunshine");
	}

	@When("user Select Room Type")
	public void user_Select_Room_Type() {
		Select Room = new Select(driver.findElement(By.xpath("//select[@name='room_type']")));

		Room.selectByValue("Super Deluxe");
	}

	@Then("user Click The Search Button")
	public void user_Click_The_Search_Button() {
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
	}

	@When("user Select The Hotel")
	public void user_Select_The_Hotel() {
		WebElement HotelSelect = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));

		boolean Check = HotelSelect.isSelected();
		if (!Check) {
			HotelSelect.click();

		}
	}

	@Then("user Click Continue Button")
	public void user_Click_Continue_Button() {
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();
	}

	@When("user Enter The Name In First Name Field")
	public void user_Enter_The_Name_In_First_Name_Field() {
		String FirstName = "Hari";
		WebElement FName = driver.findElement(By.xpath("//input[@id='first_name']"));
		FName.sendKeys(FirstName);

	}

	@When("user Enter Last Name In Last Name Field")
	public void user_Enter_Last_Name_In_Last_Name_Field() {
		String LastName = "Hemanth";
		WebElement LName = driver.findElement(By.xpath("//input[@id='last_name']"));
		LName.sendKeys(LastName);
	}

	@When("user Enter Billing Address In Address Field")
	public void user_Enter_Billing_Address_In_Address_Field() {
		String Add = "Chennai";

		WebElement AName = driver.findElement(By.xpath("//textarea[@id='address']"));
		AName.sendKeys(Add);
	}

	@When("user Enter Cc Number In Cc Field")
	public void user_Enter_Cc_Number_In_Cc_Field() {
		String CC = "1234567898765432";

		WebElement Cc = driver.findElement(By.xpath("//input[@id='cc_num']"));
		Cc.sendKeys(CC);
	}

	@When("user Enter Card Type In Card Type Field")
	public void user_Enter_Card_Type_In_Card_Type_Field() {

		Select ccType = new Select(driver.findElement(By.xpath("//select[@id='cc_type']")));

		ccType.selectByValue("AMEX");

	}

	@When("user Enter Expiry Date In Expiry Date Field")
	public void user_Enter_Expiry_Date_In_Expiry_Date_Field() {
		Select Vmont = new Select(driver.findElement(By.xpath("//select[@id='cc_exp_month']")));

		Vmont.selectByValue("12");
	}

	@When("user Enter Expiry Year Ib Expiry Year Field")
	public void user_Enter_Expiry_Year_Ib_Expiry_Year_Field() {

		Select Vyr = new Select(driver.findElement(By.xpath("//select[@id='cc_exp_year']")));

		Vyr.selectByValue("2022");
	}

	@When("user Enter Cvv In Cvv Field")
	public void user_Enter_Cvv_In_Cvv_Field() {

		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));

		cvv.sendKeys("123");
	}

	@Then("user Click Book Now Button")
	public void user_Click_Book_Now_Button() {

		WebElement now = driver.findElement(By.xpath("//input[@id='book_now']"));

		now.click();

	}

	@When("user Take Screen Shot")
	public void user_Take_Screen_Shot() throws InterruptedException, IOException {

		Thread.sleep(10000);
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File file = new File("C:\\Users\\Ram kumar\\eclipse-workspace\\Cucumber\\Screenshot\\Hotel.png");

		FileHandler.copy(SrcFile, file);
	}

	@Then("user Logout The Page")
	public void user_Logout_The_Page() {

		WebElement logout = driver.findElement(By.xpath("//*[@id='logout']"));

		logout.click();
	}

}
