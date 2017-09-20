import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest2 extends SelenideExtension {

    @Test
    public void loginTest() {
        open("https://jdi-framework.github.io/tests/index.htm");
        login();

        $(".profile-photo span").shouldHave(text(TestNames.PITER_CHAILOVSKII.name));
    }

    @Step
    public void login() {
        $(".fa-user").click();
        $("#Login").sendKeys("epam");
        $("#Password").sendKeys("1234");

        $(".fa-sign-in").shouldBe(visible);
        $(".fa-sign-in").click();
    }
}
