package selenium.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buy 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nobroker.in/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath("//div[@id='app']/div/div/div[1]/div[3]/div[1]")).click();
	driver.findElement(By.xpath("//div[@id='searchCity']")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    driver.findElement(By.xpath("//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--has-value\"]")).click();
    
    Actions city=new Actions(driver);
    for(int i=0;i<3;i++)
    {
    	city.sendKeys(Keys.DOWN).perform();
    }
    city.sendKeys(Keys.ENTER).perform();
    
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

    
	
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).click();
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("Hinjewadi");
	driver.findElement(By.xpath("//div[@class='autocomplete-dropdown-container']")).click();
	Actions loc=new Actions(driver);
	for(int i=0;i<3;i++)
	{
		loc.sendKeys(Keys.DOWN).perform();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath("//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi\"]")).click();
	loc.sendKeys(Keys.ENTER).perform();
	
	}

}
