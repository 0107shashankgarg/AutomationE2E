package demo.test.ui.inputForms;

import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
class AjaxFormSubmitTest extends InputFormsBase {

    private static final Logger LOG = LogManager.getLogger(AjaxFormSubmitTest.class);


    @Test
    void isAjaxFromSubmitWorking() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.AJAXFORMSUBMIT);

        BaseApp.ajaxFormSubmitPage( )
                .enterName("Selenide Test")
                .enterComments("Selenide Test Comments")
                .clikSubmitButton( )
                .checkIfFormIsSummitted( );

    }


}


