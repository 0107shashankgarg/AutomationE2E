package demo.pageobjects.progressbarsandslider;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import demo.constants.CheckBoxAction;

import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

public class DragAndDropSlidersPage extends ProgressBarsAndSliderBasePage {


    //.is(Condition.checked)
    SelenideElement mainArea = $x(MAINPANEL);
    SelenideElement firstCheckBox = mainArea.$x(".//label[normalize-space() ='Click on this check box']");
    SelenideElement successMessage = mainArea.$x(".//div[@id = 'txtAge']");
    SelenideElement checkAllButton = mainArea.$x(".//input[@type='button']");
    ElementsCollection getAllCheckbox = mainArea.$$x(".//label[contains(.,'Option')]");
    SelenideElement allCheckBoxCheked = mainArea.$x(".//input[@id = 'isChkd']");


    public DragAndDropSlidersPage actionOnFirstCheckBox(CheckBoxAction action) {
        checkCheckBox(firstCheckBox, action);
        return this;
    }

    public DragAndDropSlidersPage actionOnACheckBox(String checkBoxname, CheckBoxAction action) {
        checkCheckBox(getAllCheckbox.stream( )
                .filter(ele -> ele.getText( ).equals(checkBoxname))
                .findFirst( )
                .get( ), action);
        return this;
    }

    public DragAndDropSlidersPage clikCheckAllButton() {
        checkAllButton.click( );
        return this;
    }

    public boolean verifyIfCheckBoxIsChecked(String checkBoxName) {
        return (getAllCheckbox.stream( ).anyMatch(ele -> ele.getText( ).equals(checkBoxName)));

    }

    public boolean verifyIfAllCheckBoxInGroupChecked() {
        return (allCheckBoxCheked.getValue( ).equals("true"));

    }

    public SelenideElement isSuccessMessageCorrect() {
        return successMessage;
    }
}
