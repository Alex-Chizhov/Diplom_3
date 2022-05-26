package pageObjectModel;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class MainPage {

    public SelenideElement loginButton = $(byXpath("//button[text()='Войти в аккаунт']"));
    public SelenideElement makeOrderButton = $(byXpath("//button[text()='Оформить заказ']"));

    @Step("Open main page")
    public void open(){
        Selenide.open("https://stellarburgers.nomoreparties.site");
        loginButton.shouldBe(visible);
    }
    @Step("Click login button")
    public void clickLoginButton(){
        loginButton.shouldBe(visible).click();
    }

}
