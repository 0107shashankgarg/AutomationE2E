package demo.pageobjects.inputforms;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import demo.constants.inputforms.RadioButtonsName;
import org.openqa.selenium.By;

public class RadioButtonsDemoPage extends InputFormsBasePage {


    public SelenideElement getWhichNonGroupRadioButtonIsChecked = pannel1.$x(".//p[@class='radiobutton']");
    public SelenideElement getSelectedRadioGroupValues = pannel2.$x(".//p[@class='groupradiobutton']");
    ElementsCollection pannel1RadioButtons = pannel1.$$x(".//input");
    SelenideElement getCheckedValueButton = pannel1.$x(".//button");
    SelenideElement getValueButton = pannel2.$x(".//button");

    public RadioButtonsDemoPage selectNonGroupRadioButton(RadioButtonsName radioButton) {
        pannel1RadioButtons.stream( )
                .filter(ele -> ele.getValue( ).equals(radioButton.getValue( )))
                .findFirst( )
                .get( )
                .click( );
        return this;
    }

    public SelenideElement isCorrectNonGroupRadioChecked() {
        return getWhichNonGroupRadioButtonIsChecked;
    }

    public RadioButtonsDemoPage clickGetCheckedValueButton() {
        getCheckedValueButton.click( );
        return this;
    }


    public RadioButtonsDemoPage selectGroupRadioButton(RadioButtonsName radioButton) {

        pannel2.$(By.name(radioButton.getGroup( ).getRadioButtonGroup( ))).selectRadio(radioButton.getValue( ));
        return this;
    }

    public RadioButtonsDemoPage clickGetValueButton() {
        getValueButton.click( );
        return this;
    }

    public SelenideElement isCorrectgetSelectedRadioGroupValues() {
        return getSelectedRadioGroupValues;
    }
}
