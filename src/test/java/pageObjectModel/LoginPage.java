package pageObjectModel;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import model.User;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement h2Enter = $(byXpath("//h2[text()='Вход']"));
    public SelenideElement emailInput = $(byXpath("//label[text()='Email']/following-sibling::input"));
    public SelenideElement passwordInput = $(byXpath("//label[text()='Пароль']/following-sibling::input"));
    public SelenideElement buttonEnter = $(byXpath("//button[text()='Войти']"));

    @Step("Open login page")
    public void open(){
        Selenide.open("https://stellarburgers.nomoreparties.site/login");
    }

    @Step("Fill login form")
    public void fillLoginForm(User user){
        emailInput.shouldBe(exist).setValue(user.email);
        passwordInput.shouldBe(exist).setValue(user.password);
        buttonEnter.shouldBe(exist).click();

    }
}