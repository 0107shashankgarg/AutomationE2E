package demo.test.ui.inputForms;

import com.codeborne.selenide.Condition;
import demo.config.inputforms.ConfigInputForms;
import demo.constants.CheckBoxAction;
import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.aeonbits.owner.ConfigCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
class RadioButtonsDemoTest extends InputFormsBase {

    private static final Logger LOG = LogManager.getLogger(RadioButtonsDemoTest.class);
    private ConfigInputForms cfg = ConfigCache.getOrCreate(ConfigInputForms.class, System.getProperties( ));


    @Test
    void singleCheckBoxShouldBeCondition() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.CHECKBOXDEMO);

        BaseApp.checkBoxDemo( )
                .actionOnFirstCheckBox(CheckBoxAction.CHECK)
                .isSuccessMessageCorrect( ).shouldBe(Condition.value("to fail"), Duration.ofSeconds(5));
    }

    @Test
    void singleCheckBoxAssert() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.CHECKBOXDEMO);

        assertThat(BaseApp.checkBoxDemo( )
                .actionOnFirstCheckBox(CheckBoxAction.CHECK)
                .isSuccessMessageCorrect( )
                .getText( )
                .equals("to fial")).withFailMessage("Expected Message was:Success - Check box is checked but its " + BaseApp
                .checkBoxDemo( )
                .isSuccessMessageCorrect( )
                .getText( )).isTrue( );

    }


    @Test
    void twoMultipleCheckBox() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.CHECKBOXDEMO);
        assertThat(BaseApp.checkBoxDemo( )
                .clikCheckAllButton( )
                .verifyIfAllCheckBoxInGroupChecked( )).withFailMessage("Not all check box are chekded")
                .isTrue( );
    }
}


