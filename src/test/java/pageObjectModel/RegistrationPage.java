package pageObjectModel;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.Selenide;
import model.User;
import io.qameta.allure.Step;


public class RegistrationPage {

    public SelenideElement nameInput = $(byXpath("//label[text()='Имя']/following-sibling::input"));
    public SelenideElement emailInput = $(byXpath("//label[text()='Email']/following-sibling::input"));
    public SelenideElement passwordInput = $(byXpath("//label[text()='Пароль']/following-sibling::input"));
    public SelenideElement buttonRegistration = $(byXpath("//button[text()='Зарегистрироваться']"));
    public SelenideElement invalidPasswordMessage = $(byXpath("//p[text()='Некорректный пароль']"));
    public SelenideElement loginButton = $(byXpath("//a[@href='/login']"));

    @Step("Click login link")
    public void open(){
        Selenide.open("https://stellarburgers.nomoreparties.site/register");
        loginButton.shouldBe(exist);
    }

    @Step("Fill registration form")
    public void fillRegistrationForm(User user){
        nameInput.shouldBe(exist).setValue(user.name);
        emailInput.shouldBe(exist).setValue(user.email);
        passwordInput.shouldBe(exist).setValue(user.password);
        buttonRegistration.shouldBe(exist).click();
    }

    @Step("Click login button")
    public void clickLoginButton(){
        loginButton.shouldBe(exist).shouldBe(visible).click();
        loginButton.shouldBe(disappear);
    }
}
