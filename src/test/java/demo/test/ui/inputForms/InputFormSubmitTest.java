package demo.test.ui.inputForms;


import com.codeborne.selenide.junit5.SoftAssertsExtension;
import demo.config.inputforms.ConfigInputSubmitForms;
import demo.constants.inputforms.InputFormSubmit;
import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.aeonbits.owner.ConfigCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Condition.enabled;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
@ExtendWith({SoftAssertsExtension.class})

class InputFormSubmitTest extends InputFormsBase {

    private static final Logger LOG = LogManager.getLogger(InputFormSubmitTest.class);
    protected ConfigInputSubmitForms cfgForm = ConfigCache.getOrCreate(ConfigInputSubmitForms.class, System.getProperties( ));

    @Test
    void submitFormSuccessfully() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.INPUTFORMSUBMIT);

        BaseApp.inputFormSubmitPage( )
                .enterValeInForm(InputFormSubmit.FIRSTNAME, cfgForm.getFirstName( ))
                .enterValeInForm(InputFormSubmit.LASTNAME, cfgForm.getLastName( ))
                .enterValeInForm(InputFormSubmit.EMAILADDRESS, cfgForm.getEmail( ))
                .enterValeInForm(InputFormSubmit.PHONE, cfgForm.getPhone( ))
                .enterValeInForm(InputFormSubmit.ADDRESS, cfgForm.getAddress( ))
                .enterValeInForm(InputFormSubmit.CITY, cfgForm.getCity( ))
                .enterValeInForm(InputFormSubmit.STATE, cfgForm.getState( ))
                .enterValeInForm(InputFormSubmit.ZIPCODE, cfgForm.getZipcode( ))
                .enterValeInForm(InputFormSubmit.WEBSITE, cfgForm.getwebsiteDomain( ))
                .enterValeInForm(InputFormSubmit.HOSTING, "yes")
                .enterValeInForm(InputFormSubmit.PROJECTDESCRIPTION, cfgForm.getProjectDescription( ))
                .sendButton.shouldBe(enabled);

    }

}


