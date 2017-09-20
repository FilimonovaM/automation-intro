import com.codeborne.selenide.Configuration;
import io.qameta.allure.testng.AllureTestNg;

public abstract class SelenideExtension extends AllureTestNg {

    public SelenideExtension() {
        Configuration.browser = "CHROME";
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }
}
