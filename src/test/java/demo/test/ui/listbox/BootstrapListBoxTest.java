package demo.test.ui.listbox;

import com.codeborne.selenide.Condition;
import demo.constants.CheckBoxAction;
import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
class BootstrapListBoxTest extends ListBoxBase {

    private static final Logger LOG = LogManager.getLogger(BootstrapListBoxTest.class);


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


