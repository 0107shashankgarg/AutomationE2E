package demo.test.ui.inputForms;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.AssertionMode.SOFT;



@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
@ExtendWith({SoftAssertsExtension.class})
class JQuerySelectDropdownTest extends InputFormsBase {

    private static final Logger LOG = LogManager.getLogger(JQuerySelectDropdownTest.class);


    @Test
    void selectJQueryDropDown() {
        Configuration.assertionMode = SOFT;
        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.JQUERYSELECTDROPDOWN);

        BaseApp.jQuerySelectDropdownPage( )
                .selectCountry("Denmark")
                .selectState("Arizona", "California")
                .selectTerritories("Northern Mariana Islands", "Guam")
                .selectCategory("PHP");

    }
}


