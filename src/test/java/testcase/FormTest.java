package testcase;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.FormPageObject;
import resources.Base;

public class FormTest extends Base {

	public FormPageObject fpo;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void navigatToUrl() throws IOException {
		
		driver = initializeDriver();
		log.info("driver is been initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("site url is been navigated");
		
		driver.manage().window().maximize();
		log.info("browser window is been maximized");
		
	}
	
	@Test(dataProvider="formDetails")
	public void verifyFormIsSubmitted(String firstname, String lastname, String gender, int experience, String date, String profession, String tool, String continent, String command) throws InterruptedException {
	
		fpo = new FormPageObject(driver);
		
		//----- -------First name field -------------------------------> 
		fpo.getFirstNameField().clear();
		fpo.getFirstNameField().sendKeys(firstname);
		log.info("first name entered into firstname field");
		
		//------------Last name field --------------------------------->
		fpo.getLastNameField().clear();
		fpo.getLastNameField().sendKeys(lastname);
		log.info("last name entered into lastname field");
		
	   //------------- Gender Radio Option ---------------------------->
			switch(gender) {
			
			case "Male" :				
				         boolean maleRadioOpt = fpo.getMaleRadioOption().isDisplayed();
				         if(maleRadioOpt) {
				        	 WebElement maleRadio = fpo.getMaleRadioOption();
					         WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
					         w.until(ExpectedConditions.elementToBeClickable(maleRadio));
					         fpo.getMaleRadioOption().click();
					         log.info("male radio is enabled");
					         break; 
				         }
			case "Female" :
				        boolean femaleRadioOpt = fpo.getFemaleRadioOption().isDisplayed();
				        if(femaleRadioOpt) {
				        	 WebElement femaleRadio = fpo.getFemaleRadioOption();
				        	 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
				        	 w.until(ExpectedConditions.elementToBeClickable(femaleRadio)); 
				        	 fpo.getFemaleRadioOption().click();
				        	 log.info("female radio is enabled");
				        	 break;
				        }
				    
			default :
				       System.out.println("No Other Radio Option");
				       log.info("no other radio option");  
				       break;
			}
			
			Thread.sleep(3000);
			
		  //---------------- Experience Radio Option ------------------->
			
			switch(experience) {
			
			case 1:
				    boolean oneYearExpRadio = fpo.getYearOneExperienceRadioOption().isDisplayed();
				    if(oneYearExpRadio) {
				    	WebElement year1Exp = fpo.getYearOneExperienceRadioOption();
				    	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
				    	w.until(ExpectedConditions.elementToBeClickable(year1Exp));
				    	fpo.getYearOneExperienceRadioOption().click();
				    	log.info("one year experience radio is enabled");
				    	break;
				    }
				
			case 2:
				   boolean twoYearExperience = fpo.getYearTwoExperienceRadioOption().isDisplayed();
				   if(twoYearExperience) {
					   WebElement year2Exp = fpo.getYearTwoExperienceRadioOption();
					   WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
					   w.until(ExpectedConditions.elementToBeClickable(year2Exp));
					   fpo.getYearTwoExperienceRadioOption().click();
					   log.info("two year experience radio is enabled");
					   break;
				   }
				
			case 3:
				   boolean threeYearExperience = fpo.getYearThreeExperienceRadioOption().isDisplayed();
				   if(threeYearExperience) {
					  WebElement year3Exp = fpo.getYearThreeExperienceRadioOption();
					  WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
					  w.until(ExpectedConditions.elementToBeClickable(year3Exp));
					  fpo.getYearThreeExperienceRadioOption().click();
					  log.info("three year experience radio is enabled");
					  break;
				   }
			
			case 4:
				  boolean fourYearExperience = fpo.getYearFourExperienceRadioOption().isDisplayed();
				  if(fourYearExperience) {
					  WebElement year4Exp = fpo.getYearFourExperienceRadioOption();
					  WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
					  w.until(ExpectedConditions.elementToBeClickable(year4Exp));
					  fpo.getYearFourExperienceRadioOption().click();
					  log.info("four year experience radio is enabled");
					  break;
				  }
			case 5:
				  boolean fiveYearExperience = fpo.getYearFiveExperienceRadioOption().isDisplayed();
				   if(fiveYearExperience) {
					  WebElement year5Exp = fpo.getYearFiveExperienceRadioOption();
					  WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
					  w.until(ExpectedConditions.elementToBeClickable(year5Exp));
					  fpo.getYearFiveExperienceRadioOption().click();
					  log.info("five year experience radio is enabled");
					  break;
				  }
				
			case 6:
				   boolean sixYearExperience = fpo.getYearSixRadioOption().isDisplayed();
				   if(sixYearExperience) {
					  WebElement year6Exp = fpo.getYearSixRadioOption();
					  WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
					  w.until(ExpectedConditions.elementToBeClickable(year6Exp));
					  fpo.getYearSixRadioOption().click();
					  log.info("six year experience radio is enabled");
					  break;
				   }
			case 7:
				   boolean sevenYearExperience = fpo.getYearSevenRadioOption().isDisplayed();
				   if(sevenYearExperience) {
					  WebElement year7Exp = fpo.getYearSevenRadioOption();
					  WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
					  w.until(ExpectedConditions.elementToBeClickable(year7Exp));
					  fpo.getYearSevenRadioOption().click();
					  log.info("seven year experience radio is enabled");
					  break;
				   }
				
			default:
				    System.out.println("No other experience option found");
				    log.info("no other experience radio option is available");
				    break;
			}

			Thread.sleep(3000);
			
			
		// --------------------- Date Field ---------------------------------->
			
			fpo.getDataPickerField().sendKeys(date);
			log.info("date is been entered into date field");
			
			
	   // ----------------------- Profession --------------------------------->
		  
			switch(profession) {
			   
			case "Manual":
                         boolean manualOptionCheck = fpo.getManualProfessionCheckbox().isDisplayed();
                         if(manualOptionCheck) {
                            	 WebElement manualOpt = fpo.getManualProfessionCheckbox();
                            	 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
                            	 w.until(ExpectedConditions.elementToBeClickable(manualOpt));
                            	 fpo.getManualProfessionCheckbox().click();
                            	 log.info("Manual checkbox is enabled as profession");
                            	 break;
                         }
                         
			case "Automation":
				     boolean automationOptionCheck = fpo.getAutomationProfessionCheckbox().isDisplayed();
				     if(automationOptionCheck) {
				    	 WebElement automationOpt = fpo.getAutomationProfessionCheckbox();
				    	 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
				    	 w.until(ExpectedConditions.elementToBeClickable(automationOpt));
				    	 fpo.getAutomationProfessionCheckbox().click();
				    	 log.info("Automation checkbox is enabled as profession");
				    	 break;
				     }
			default:
				
				System.out.println("no other profession option available");
				log.info("no other profession option is available");
				break;
			}
			
			Thread.sleep(3000);
			
			// ----------------- Tool Checkbox ------------------------------->
			
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)","");
			
			switch(tool) {
			
			case "uft":
				       boolean uftCheckbox = fpo.getUftToolCheckbox().isDisplayed();
				       if(uftCheckbox) {
				    	   WebElement uftToolOption = fpo.getUftToolCheckbox();
				    	   WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
				    	   w.until(ExpectedConditions.elementToBeClickable(uftToolOption));
				    	   fpo.getUftToolCheckbox().click();
				    	   log.info("uft check box is enabled as tool");
				    	   break;
				       }
			case "protractor":
				             boolean protractorCheckbox = fpo.getProtractorCheckbox().isDisplayed();
				             if(protractorCheckbox) {
				            	 WebElement protractorToolCheckbox = fpo.getProtractorCheckbox();
				            	 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
				            	 w.until(ExpectedConditions.elementToBeClickable(protractorToolCheckbox));
				            	 fpo.getProtractorCheckbox().click();
				            	 log.info("protractor check box is enabled as tool");
				            	 break;
				             }
			case "selenium":
				           boolean seleniumCheckbox = fpo.getSeleniumCheckbox().isDisplayed();
				           if(seleniumCheckbox) {
				        	   WebElement seleniumToolCheckbox = fpo.getSeleniumCheckbox();
				        	   WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
				        	   w.until(ExpectedConditions.elementToBeClickable(seleniumToolCheckbox));
				        	   fpo.getSeleniumCheckbox().click();
				        	   log.info("selenium check box is enabled as tool");
				        	   break;
				           }
			default:
				   System.out.println("no tool option found");
			       log.info("no other tool option is found");
				   break;    
			}
			
			Thread.sleep(3000);
			
			//------------------------ Continent Select Options ------------------------->
			
			switch(continent) {
			
			case "Asia":
				        fpo.getContinentSelectOption().sendKeys(continent);
				        log.info("asia option is selected as continent");
				        break;		        
			case "Europe":
				          fpo.getContinentSelectOption().sendKeys(continent);
				          log.info("europe option is selected as continent");
				          break;
			case "Africa":
				          fpo.getContinentSelectOption().sendKeys(continent);
				          log.info("africa option is selected as continent");
				          break;
			case "Australia":
				             fpo.getContinentSelectOption().sendKeys(continent);
				             log.info("australia option is selected as continent");
				             break;
			case "South America":
				                fpo.getContinentSelectOption().sendKeys(continent);
                                log.info("south america option is selected as continent"); 
				                break;
			case "North America":
				                fpo.getContinentSelectOption().sendKeys(continent);
				                log.info("north america option is selected as continent");
				                break;
			case "Antartica":
				            fpo.getContinentSelectOption().sendKeys(continent);
				            log.info("antartica option is selected as continent");
				            break;
			default:
				System.out.println("no other continents options available");
				log.info("no other continents option are available");
				break;
			}
			
			Thread.sleep(3000);
			
			//---------------------- Commands Select Options ------------------------->
			
			switch(command) {
			
			case "Browser Commands":
				                   fpo.getCommandSelectOption().sendKeys(command);
				                   boolean selectCommandSelected = fpo.getCommandSelectOption().isSelected();
				                   if(selectCommandSelected) {
				                	   Assert.assertTrue(true);
				                	   log.info("browser command is selected as command");
				                   }
			                       break; 
			case "Navigation Commands":
                                      fpo.getCommandSelectOption().sendKeys(command);
                                      boolean navigationCommandSelected = fpo.getCommandSelectOption().isSelected();
                                      if(navigationCommandSelected) {
             	                               Assert.assertTrue(true);
             	                               log.info("navigation command is selected as command");
                                       }
                                         break; 
			case "Switch Commands":
                                  fpo.getCommandSelectOption().sendKeys(command);
                                  boolean switchCommandSelected = fpo.getCommandSelectOption().isSelected();
                                  if(switchCommandSelected) {
                                      Assert.assertTrue(true);
                                      log.info("switch command is selected as command");
                                   }
                                    break; 
			case "Wait Commands":
                                fpo.getCommandSelectOption().sendKeys(command);
                                boolean waitCommandSelected = fpo.getCommandSelectOption().isSelected();
                                if(waitCommandSelected) {
                                    Assert.assertTrue(true);
                                    log.info("wait command is selected as command");
                                 }
                                     break;
                                     
			case "WebElement Commands":
                                      fpo.getCommandSelectOption().sendKeys(command);
                                      boolean webElementCommandSelected = fpo.getCommandSelectOption().isSelected();
                                      if(webElementCommandSelected) {
                                           Assert.assertTrue(true);
                                           log.info("webelement command is selected as command");
                                       }
                                        break; 
			default:
				   System.out.println("no other command option available"); 
				   log.info("no other command option is available");
				   break;
			}
			
			Thread.sleep(3000);
			
			// ------------------------ File Upload ---------------------------->
			String file = System.getProperty("user.dir")+"/utils/Test.txt";
			fpo.getFileUpload().sendKeys(file);
			log.info("file is been uploaded");
			
			//------------------------- File Download -------------------------->
			fpo.getDownloadFileLink().click();
			log.info("file is been downloaded");
			
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,300)","");
			
			//-------------------------- Form Submit ---------------------------->
			fpo.getSubmitButton().click();
			log.info("form submit button is been clicked");
		}
	

	@AfterTest
	public void terminate() {
		driver.quit();
	}
	
	@DataProvider(name="formDetails")
	public Object[][] getData(){
		Object[][] data = new Object[1][9];
		data[0][0] = "Viraj";
		data[0][1] = "Utekar";
		data[0][2] = "Male";
		data[0][3] = 1;
		data[0][4] = "13/04/1997";
		data[0][5] = "Automation";
		data[0][6] = "selenium";
		data[0][7] = "Asia";
		data[0][8] = "Browser Commands";
		return data;
	}

}
