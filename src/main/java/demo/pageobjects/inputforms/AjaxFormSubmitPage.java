package demo.pageobjects.inputforms;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

public class AjaxFormSubmitPage extends InputFormsBasePage {


    //.is(Condition.checked)
    SelenideElement mainArea = $x(MAINPANEL);
    public SelenideElement submitButton = mainArea.$(By.name("btn-submit"));
    public SelenideElement successMessage = mainArea.$(By.id("submit-control"));
    SelenideElement name = mainArea.$(By.name("title"));
    SelenideElement description = mainArea.$(By.name("description"));

    //mainArea.$(By.name("title")).sendKeys("test")
//mainArea.$(By.name("description")).sendKeys("tetwet")
//mainArea.$(By.name("btn-submit")).click();
//mainArea.$(By.id("submit-control")).shouldBe(Condition.text("Form submited Successfully!"))
    public AjaxFormSubmitPage enterName(String nameValue) {
        enterText(name, nameValue);
        return this;
    }

    public AjaxFormSubmitPage enterComments(String comments) {
        enterText(description, comments);
        return this;
    }

    public AjaxFormSubmitPage clikSubmitButton() {
        submitButton.click( );
        return this;
    }

    public void checkIfFormIsSummitted() {
        submitButton.shouldNotBe(visible);
        successMessage.shouldBe(text("Form submited Successfully!"));

    }

}
