package GenericScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Test12 {
    public WebDriver driver ;


    @BeforeSuite
    public void PreC() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\All Extracted Files\\ChromeDriverLatest\\chromedriver.exe");
//        System.setProperty("Webdriver.gecko.driver","C:\\Users\\user\\Documents\\Automation\\Driver\\GeckoDriver\\geckodriver.exe");
// Initialize browser
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        options.addArguments ( "--headless" );
        options.addArguments ( "--window-size=1366,784" );
        driver = new ChromeDriver( options );

// Open Google
        driver.get("http://demo.guru99.com/v4/");
//        driver.get("www.google.com");
        


//        wait(2000);

// Close browser
//        driver.close();
    }
    @Test
    public void assertTest(){
        Assert.assertEquals("Google","Google");
        System.out.println("executed google found");

    }

}
