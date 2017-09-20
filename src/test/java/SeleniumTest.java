import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.epam.com");

        Assert.assertEquals(driver.getTitle(), "EPAM | Software Product Development Services");
        driver.close();
    }
}