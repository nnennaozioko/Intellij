package Hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.JourneyPlannerPage;

public class BaseTest {

   public WebDriver driver;
    public JourneyPlannerPage journeyPlannerPage;

    //private File logLocation;



    @Before
    public void BrowserSetup()
  {


      //System.setProperty("webdriver.chrome.driver","C://Users//Nelly//IdeaProjects//SeleniumCucumber2023//src//test//resources//drivers/chromedriver.exe");
      //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
     //System.setProperty("webdriver.chrome.driver",)
      //ChromeOptions options = new ChromeOptions();
      //options. setBinary("C:\\Users\\Nelly\\IdeaProjects\\SeleniumCucumber2023\\src\\test\\resources\\drivers\\chrome-win64\\chrome.exe");
      //options.addArguments("--remote-allow-origins=*");
     // WebDriver driver = new ChromeDriver(options);
     //WebDriver driver = new ChromeDriver(options);
      journeyPlannerPage = new JourneyPlannerPage(driver);

     // driver.get("https://tfl.gov.uk");
     // driver.manage().window().maximize();

//     System.setProperty("webdriver.gecko.driver","C://Users//Nelly//IdeaProjects//SeleniumCucumber2023//src//test//resources//drivers/geckodriver.exe");
      //driver = new FirefoxDriver();
      driver = new FirefoxDriver();
     // FirefoxDriverService service = new GeckoDriverService.Builder().withLogFile(logLocation).build();
      driver.get("https://tfl.gov.uk");
     // lp = new  journeyPlannerPage(driver);
    driver.manage().window().maximize();

      //driver.close();




  }
  @After
    public void TearDown(){
     driver.close();
  }

}
