package demo.pageobjects.inputforms;

import com.codeborne.selenide.SelenideElement;
import demo.constants.inputforms.InputFormSubmit;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

public class InputFormSubmitPage extends InputFormsBasePage {


    //.is(Condition.checked)
    SelenideElement mainArea = $x(MAINPANEL);
    public SelenideElement sendButton = mainArea.$x(".//button");
    SelenideElement formPanel = mainArea.$x(".//fieldset");
    SelenideElement checkAllButton = mainArea.$x(".//input[@type='button']");

    public InputFormSubmitPage enterValeInForm(InputFormSubmit name, String value) {
        fillForm(name, value);
        return this;
    }

    public InputFormSubmitPage clickSendButton() {
        sendButton.click( );
        return this;
    }


    private void fillForm(InputFormSubmit name, String value) {
        switch (name.getControlType( )) {

            case SIMPLE_DROPDOWN:
                formPanel.$(By.name(name.getName( ))).selectOption(value);
                break;
            case DROPDOWN_WITH_SEARCH:
                break;
            case INPUT:
                enterText(formPanel.$(By.name(name.getName( ))), value);
                break;
            case TEXT_AREA:
                break;
            case FILE_SELECTOR:
                break;
            case RADIO_BUTTON_GROUP:
                formPanel.$(By.name(name.getName( ))).selectRadio(value);
                break;
            case CHECKBOX:
                break;
            case DATE_TIME_SELECTOR:
                break;
            case DATE_TIME_RANGE_SELECTOR:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name.getControlType( ));
    }

    }

}
