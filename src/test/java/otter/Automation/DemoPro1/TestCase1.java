package otter.Automation.DemoPro1;

import org.testng.annotations.Test;
import org.testng.internal.TestResult;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Field;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;


public class TestCase1 {
	
	public static WebDriver driver;
	
		
	@BeforeMethod
	public void openBrowser() throws InterruptedException{
		
				//Launching Browser
		
			//For Selenium Grid only
			/*	DesiredCapabilities dr = null;
				dr = DesiredCapabilities.chrome();
				dr.setBrowserName("chrome");
				dr.setPlatform(Platform.WIN10);
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak Sharma\\Downloads\\chromedriver.exe");
				
				driver = new RemoteWebDriver(new URL("http://192.168.0.126:4444/wd/hub"), dr);
			*/
		
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				//Launching URL
				
				driver.get("https://cunning-shark-aqbmcl-dev-ed.my.salesforce.com/");
				driver.manage().window().fullscreen();
	}
	
	@Test
	public void testflow() throws InterruptedException {
		
				//Login
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.findElement(By.id("username")).sendKeys("deepaksharma1@cunning-shark-aqbmcl.com");
				driver.findElement(By.id("password")).sendKeys("Deep@Sales123");
				driver.findElement(By.id("Login")).click();
				Thread.sleep(5000);
	//}

	//@AfterMethod
	//public void openSalesApp() throws InterruptedException {
		
				//Open Sales Apps
				
				
				 Thread.sleep(5000);		
				// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		         driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-icon-waffle_container slds-context-bar__button slds-button forceHeaderButton salesforceIdentityAppLauncherHeader')]")).click();
		
		         Thread.sleep(5000);
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		         driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Sales");
		
		         Thread.sleep(5000);
		         driver.findElement(By.xpath("//*[@id=\"07p5g000000ySPfAAM\"]/div/lightning-formatted-rich-text/span/p")).click();
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		         Thread.sleep(5000);
	//}

	//@AfterMethod
	//public void openLead() throws InterruptedException {
		
		         //Open Lead tab
		
		         	System.out.print("***********************Entry**********************************");
					WebElement element = driver.findElement(By.xpath("//a[@title='Leads']"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", element);
					System.out.print("***********************Exit**********************************");
					
				
				 //Open Latest Lead
					
					Thread.sleep(5000);
				//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					driver.findElement(By.xpath("//button[@title='Select a List View']")).click();
			
					Thread.sleep(5000);
				//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.findElement(By.xpath("//span[text()='All Open Leads']")).click();
				
					Thread.sleep(5000);
				//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					driver.findElement(By.xpath("//a[@data-Refid='recordId']")).click();
				
	//}
	
	//@AfterMethod
	//public void editLead() throws InterruptedException {
		
					// Edit Lead
					Thread.sleep(5000);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
					driver.findElement(By.xpath("//button[text()='Edit']")).click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
					driver.findElement(By.xpath("//input[@name='NumberofLocations__c']")).clear();
					driver.findElement(By.xpath("//input[@name='NumberofLocations__c']")).sendKeys("20");
		
					driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
					Thread.sleep(5000);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//}
	
	//@AfterMethod
//	public void convertLead() throws InterruptedException {
		
					//Convert Lead
		
					System.out.print("***********************Entry**********************************");
					WebElement element1= driver.findElement(By.xpath("//span[text()='Converted']"));
					//	JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", element1);
				
					WebElement element2= driver.findElement(By.xpath("//span[text()='Select Converted Status']"));
					executor.executeScript("arguments[0].click();", element2);
				
					System.out.print("***********************Exit**********************************");
				
					Thread.sleep(5000);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div/div[3]/span/button")).click();
				
	/*}
	
	@AfterMethod
	public void openOpportunity() throws InterruptedException {
		
		*/			//Open the Opportunity
					Thread.sleep(5000);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					driver.findElement(By.xpath("//div/div[2]/div/div[3]/div/div/div/div[2]/div[2]/a")).click();
	/*}
	
	@AfterMethod
	public void addProducts() throws InterruptedException {
		
		*/			//Add Products
					Thread.sleep(5000);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
					driver.findElement(By.xpath("//span[@title='Products']")).click();
				
					Thread.sleep(5000);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.findElement(By.xpath("//a[@title='Add Products']")).click();
				
				
					Thread.sleep(5000);
					driver.findElement(By.xpath("//div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/td[2]/span/span/label/span[1]")).click();
				
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[2]/td[2]/span/span/label/span[1]")).click();
				
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[3]/td[2]/span/span/label/span[1]")).click();
				
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='Next']")).click();
				
					Thread.sleep(4000);
					driver.findElement(By.xpath("//tr[1]/td[2]/span/span[2]/button")).click();
				
					Thread.sleep(5000);
					driver.findElement(By.xpath("//input[@class='slds-grow input uiInputSmartNumber']")).sendKeys("10");
				
					Thread.sleep(2000);
					driver.findElement(By.xpath("//tr[3]/td[2]/span/span[2]/button")).click();
				
					Thread.sleep(5000);
					driver.findElement(By.xpath("//input[@class='slds-grow input uiInputSmartNumber']")).sendKeys("3");
				
					Thread.sleep(2000);
					driver.findElement(By.xpath("//tr[2]/td[2]/span/span[2]/button")).click();
				
					Thread.sleep(5000);
					driver.findElement(By.xpath("//input[@class='slds-grow input uiInputSmartNumber']")).sendKeys("5");
				

				
				
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@title='Save']")).click();
	/*}
	
	@AfterMethod
	public void backToOpportunity() throws InterruptedException {
		
		*/			// Back to the Opportunity
		
					Thread.sleep(5000);
					driver.findElement(By.xpath("//lst-breadcrumbs/nav/ol/li[2]")).click();
				
					Thread.sleep(3000);
				
					WebElement element3= driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']"));
					//JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", element3);
				
				
					Thread.sleep(10000);
					WebElement element4= driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']"));
					executor.executeScript("arguments[0].click();", element4);
					
					Thread.sleep(10000);
					WebElement element5= driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']"));
					executor.executeScript("arguments[0].click();", element5);
					
					Thread.sleep(10000);
					WebElement element6= driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']"));
					executor.executeScript("arguments[0].click();", element6);
				
	/*}
	
	@AfterMethod
	public void wonOpportunity() throws InterruptedException {
		
			*/		//Close-Won Opportunity
			
					Thread.sleep(10000);
					WebElement element7= driver.findElement(By.xpath("//a[@data-tab-name='Closed']"));
				//	JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", element7);
					
					Thread.sleep(3000);
					WebElement element8= driver.findElement(By.xpath("//span[text()='Select Closed Stage']"));
					executor.executeScript("arguments[0].click();", element8);
					
					Thread.sleep(3000);
					driver.findElement(By.xpath("//select[@class='stepAction required-field select']")).click();
					
					Thread.sleep(3000);
					driver.findElement(By.xpath("//option[text()='Closed Won']")).click();
					
	
					Thread.sleep(3000);
					driver.findElement(By.xpath("//button[@title='Save']")).click();
					Thread.sleep(4000);
					
									
	}
	
	@AfterMethod
	public void quit(TestResult result) throws JiraException  {
		
					//Close the browser
	
					driver.quit();
					
				/*	//If test case fails then log the defect in Jira
				 * 
					if(result.getStatus() == TestResult.FAILURE) {
						
					BasicCredentials creds = new BasicCredentials("admin","admin");
					JiraClient jira = new JiraClient("JiraserverURL", creds);
					Issue issueName = jira.createIssue("ProjectName","Bug").field("Field.SUMMARY", result.getMethod() +"is Failed Due to: "+ result.getThrowable().toString()).execute();
					System.out.println("Issue is created in Jira with Issue Key"+issueName.getKey());
						
					}
					*/
						
					
				
	}
		

}
