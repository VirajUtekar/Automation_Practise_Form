package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPageObject {

	public WebDriver driver;
	
	
	//-------- Firstname Elements ------>
	private By firstNameField = By.xpath("//input[@name=\"firstname\"]");
	
	//-------- Lastname Elements -------->
	private By lastNameField = By.xpath("//input[@name=\"lastname\"]");
	
	
	//------- Gender Elements -------->
	private By maleRadioOption = By.id("sex-0");
	
	private By femaleRadioOption = By.id("sex-1");
	
	//------- Experience Elements ------>
	private By oneYearExperienceRadioOption = By.id("exp-0");
	
	private By twoYearExperienceRadioOption = By.id("exp-1");
	
	private By threeYearExperienceRadioOption = By.id("exp-2");
	
	private By fourYearExperienceRadioOption = By.id("exp-3");
	
	private By fiveYearExperienceRadioOption = By.id("exp-4");
	
	private By sixYearExperienceRadioOption = By.id("exp-5");
	
	private By sevenYearExperienceRadioOption = By.id("exp-6");
	
	private By dateField = By.id("datepicker");
	
	
	//----------- Profession Element ----------------->
	private By manualProfessionCheckbox = By.id("profession-0");
	
	private By automationProfessionCheckbox = By.id("profession-1");
	
	//----------- Tools Element ------------------------->
	private By uftToolCheckbox = By.id("tool-0");
	
	private By protractorToolCheckbox = By.id("tool-1");
	
	private By seleniumToolCheckbox = By.id("tool-2");
	
	//----------- Continents Element --------------------->
	private By continentSelectOption = By.id("continents");
	
	//------------ Commands Elements --------------------->
	private By commandsSelectOption = By.id("selenium_commands");
	
	
	//------------ File Upload Elements ------------------->
	private By browseUploadFile = By.id("photo");
	
	//------------ Download File Link Element -------------->
	private By downloadFileLink = By.cssSelector("div.control-group > a");
	
	//------------- Form Submit Button Element --------------->
	private By submitButton = By.id("submit");
	
	
	
	public FormPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
	   this.driver = driver;
	}

	public WebElement getFirstNameField() {
		return driver.findElement(firstNameField);
	}
	
	public WebElement getLastNameField() {
		return driver.findElement(lastNameField);
	}
	
	public WebElement getMaleRadioOption() {
		return driver.findElement(maleRadioOption);
	}
	
	public WebElement getFemaleRadioOption() {
		return driver.findElement(femaleRadioOption);
	}
	
	public WebElement getYearOneExperienceRadioOption() {
		return driver.findElement(oneYearExperienceRadioOption);
	}
	
	public WebElement getYearTwoExperienceRadioOption() {
		return driver.findElement(twoYearExperienceRadioOption);
	}
	
	public WebElement getYearThreeExperienceRadioOption() {
		return driver.findElement(threeYearExperienceRadioOption);
	}
	
	public WebElement getYearFourExperienceRadioOption() {
		return driver.findElement(fourYearExperienceRadioOption);
	}
	
	
	public WebElement getYearFiveExperienceRadioOption() {
		return driver.findElement(fiveYearExperienceRadioOption);
	}
	
	public WebElement getYearSixRadioOption() {
		return driver.findElement(sixYearExperienceRadioOption);
	}
	
	public WebElement getYearSevenRadioOption() {
		return driver.findElement(sevenYearExperienceRadioOption);
	}
	
	public WebElement getDataPickerField() {
		return driver.findElement(dateField);
	}
	
	public WebElement getManualProfessionCheckbox() {
		return driver.findElement(manualProfessionCheckbox);
	}
	
	public WebElement getAutomationProfessionCheckbox() {
		return driver.findElement(automationProfessionCheckbox);
	}
	
	public WebElement getUftToolCheckbox() {
		return driver.findElement(uftToolCheckbox);
	}
	
	public WebElement getProtractorCheckbox() {
		return driver.findElement(protractorToolCheckbox);
	}
	
	public WebElement getSeleniumCheckbox() {
		return driver.findElement(seleniumToolCheckbox);
	}
	
	public WebElement getContinentSelectOption() {
		return driver.findElement(continentSelectOption);
	}
	
	public WebElement getCommandSelectOption() {
		return driver.findElement(commandsSelectOption);
	}
	
	public WebElement getFileUpload() {
		return driver.findElement(browseUploadFile);
	}
	
	public WebElement getDownloadFileLink() {
		return driver.findElement(downloadFileLink);
	}
	
	public WebElement getSubmitButton() {
		return driver.findElement(submitButton);
	}
}
