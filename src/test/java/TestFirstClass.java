import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFirstClass {


    RemoteWebDriver driver;// = new ChromeDriver();

    @Test
    public void launchBrowser(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Skhomo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");

        Assert.assertEquals(driver.getTitle(), "Google");

        driver.quit();
    }
}
