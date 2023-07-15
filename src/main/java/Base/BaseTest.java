package Base;

import Pages.HomePage;
import Pages.RegisterTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@Feature("Amazon test senaryoları")
public class BaseTest extends BaseLib{

    public WebDriver driver;

    @Before
    public void setUp() {
        String tarayici = System.getProperty("browser");
        String osName = System.getProperty("os.name");

        if (tarayici== null) {tarayici="Chrome";}

        System.out.println(tarayici);
        if (tarayici.equals("Chrome")) {
            if (osName.equals("Mac OS X")) {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            } else {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            }
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(co);
        }
        else {
            if (osName.equals("Mac OS X")) {
                System.setProperty("webdriver.chrome.driver", "driver/geckodriver");
            } else {
                System.setProperty("webdriver.chrome.driver", "driver/geckodriver.exe");
            }
            driver = new FirefoxDriver();
        }
    }

    @Given("Browser da url aç")
    public void openBrowser(){
        driver.get("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=119366379979&hvpone=&hvptwo=&hvadid=542862704348&hvpos=&hvnetw=g&hvrand=8768304280307715648&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012795&hvtargid=kwd-10573980&hydadcr=12932_2246093&language=tr_TR");
        driver.manage().window().maximize();
        HomePage.setDriver(driver);
        RegisterTest.setDriver(driver);
    }

    @Then("Browser Kapat")
    @AfterMethod
    public void afterDown() {
        driver.quit();
    }
}


/*
    @Given("Browser da url aç")
    public void openBrowser(){
        driver.get("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=119366379979&hvpone=&hvptwo=&hvadid=542862704348&hvpos=&hvnetw=g&hvrand=8768304280307715648&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012795&hvtargid=kwd-10573980&hydadcr=12932_2246093&language=tr_TR");
        driver.manage().window().maximize();
        HomePage.setDriver(driver);
        RegisterTest.setDriver(driver);
    }
    @Then("Browser Kapat")
    @AfterMethod
    public void afterDown() {
        driver.quit();
    }
}

 */