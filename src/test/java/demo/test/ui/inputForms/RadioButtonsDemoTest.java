package demo.test.ui.inputForms;

import com.codeborne.selenide.Condition;
import demo.constants.inputforms.RadioButtonsName;
import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
class RadioButtonsDemoTest extends InputFormsBase {

    private static final Logger LOG = LogManager.getLogger(RadioButtonsDemoTest.class);


    @Test
    void vefiryisMaleInNonGroupRadioButtonChecked() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.RADIOBUTTONSDEMO);

        BaseApp.radioButtonsDemoPage( )
                .selectNonGroupRadioButton(RadioButtonsName.MALE)
                .clickGetCheckedValueButton( )
                .getWhichNonGroupRadioButtonIsChecked.shouldBe(Condition.matchText(RadioButtonsName.MALE.getValue( )));

    }

    @Test
    void vefiryIsFemaleInNonGroupRadioButtonChecked() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.RADIOBUTTONSDEMO);

        BaseApp.radioButtonsDemoPage( )
                .selectNonGroupRadioButton(RadioButtonsName.FEMALE)
                .clickGetCheckedValueButton( )
                .getWhichNonGroupRadioButtonIsChecked.shouldBe(Condition.matchText(RadioButtonsName.FEMALE.getValue( )));

    }

    @Test
    void vefiryIsMaleGroupRadioButtonChecked() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.RADIOBUTTONSDEMO);

        BaseApp.radioButtonsDemoPage( )
                .selectGroupRadioButton(RadioButtonsName.MALE)
                .clickGetValueButton( )
                .getSelectedRadioGroupValues.shouldBe(Condition.matchText(RadioButtonsName.MALE.getValue( )));

    }

    @Test
    void vefiryIsFemaleBetween0To5GroupRadioButtonChecked() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.RADIOBUTTONSDEMO);

        BaseApp.radioButtonsDemoPage( )
                .selectGroupRadioButton(RadioButtonsName.FEMALE)
                .selectGroupRadioButton(RadioButtonsName.AGE0TO5)
                .clickGetValueButton( )
                .getSelectedRadioGroupValues.should(Condition.and("All expected check box are checked ", Condition.matchText(RadioButtonsName.FEMALE
                .getValue( )), Condition.matchText(RadioButtonsName.AGE0TO5.getValue( ))));


    }


}


