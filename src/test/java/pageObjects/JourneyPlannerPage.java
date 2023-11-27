package pageObjects;

import Hooks.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JourneyPlannerPage extends BaseTest{

    public WebDriver driver;
    public JourneyPlannerPage(WebDriver driver)
    {//PageFactory.initElements(driver, this);
        this.driver = driver;
        //driver = new ChromeDriver();
       // driver = new FirefoxDriver();


    }
//    public void Navigate(String url){
//        driver.navigate().to(url);
//    }


//    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
//    private WebElement cookiesButton;
//    public  void ClickCookiesButton()
   // {

  public  void  Navigate(String url){
        driver.navigate().to(url);
  }



}
