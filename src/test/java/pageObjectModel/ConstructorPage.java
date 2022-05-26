package pageObjectModel;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class ConstructorPage {

    public SelenideElement spanBun = $(byXpath("//span[text()='Булки']"));
    public SelenideElement spanSauce = $(byXpath("//span[text()='Соусы']"));
    public SelenideElement spanFilling = $(byXpath("//span[text()='Начинки']"));
    public ElementsCollection Buns = $$(byXpath("//h2[text()='Булки']/following::ul[1]/a"));
    public ElementsCollection Sauces = $$(byXpath("//h2[text()='Соусы']/following::ul[1]/a"));
    public ElementsCollection Fillings = $$(byXpath("//h2[text()='Начинки']/following::ul[1]/a"));
    public SelenideElement modalCardText = $(byXpath("//div[contains(@class, 'Modal_modal__container__Wo2l_')]//p"));
    public SelenideElement modalCloseButton = $(byXpath("//div[contains(@class, 'Modal_modal__container__Wo2l_')]//button"));

    @Step("Click bun link")
    public void clickSpanBun(){
        spanBun.shouldBe(visible).click();
    }

    @Step("Click sauce link")
    public void clickSpanSauce(){
        spanSauce.shouldBe(exist).click();
    }

    @Step("Click filling link")
    public void clickSpanFilling(){
        spanFilling.shouldBe(exist).click();
    }

    @Step("Click first bun card")
    public void clickFirstBunCard(){
        Buns.get(0).shouldBe(visible).click();
    }

    @Step("Click first sauce card")
    public void clickFirstSauceCard(){
        Sauces.get(0).shouldBe(visible).click();
    }

    @Step("Click first filling card")
    public void clickFirstFillingCard(){
        Fillings.get(0).shouldBe(visible).click();
    }

    @Step("Close modal window")
    public void closeModal(){
        modalCloseButton.shouldBe(visible).click();
        modalCloseButton.shouldBe(disappear);
    }
}
