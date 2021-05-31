package demo.pageobjects.table;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import demo.constants.CheckBoxAction;
import demo.utils.PageUtils;

import static com.codeborne.selenide.Condition.checked;

public class TableBasePage extends PageUtils {

    public void enterText(SelenideElement ele, String text) {
        ele.shouldBe(Condition.visible).clear( );
        ele.sendKeys(text);
    }

    public void enterText(SelenideElement ele, int number) {
        ele.shouldBe(Condition.visible).clear( );
        ele.setValue(String.valueOf(number));
    }

    public void checkCheckBox(SelenideElement ele, CheckBoxAction action) {
        switch (action) {
            case CHECK:
                ele.shouldNotBe(checked).click( );
                break;

            case TOGGLE:
                ele.click( );
                break;

            case UNCHECK:
                ele.shouldBe(checked).click( );
                break;


        }

    }
}
