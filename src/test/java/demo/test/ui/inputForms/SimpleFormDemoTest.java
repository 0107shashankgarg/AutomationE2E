package demo.test.ui.inputForms;

import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.annotation.TestCaseId;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

@Execution(CONCURRENT)
@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)

        /**
         *     Extensions registered declaratively via @ExtendWith will be executed in the order in which they are declared in the source code.
         *
         *  Programmatic Extension Registration using will be executed in the order in which they are declared in the source code.
         *
         *  Automatic Extension Registration
         *  Enabling Automatic Extension Detection :junit.jupiter.extensions.autodetection.enabled or -Djunit.jupiter.extensions.autodetection.enabled=true
         */


class SimpleFormDemoTest extends InputFormsBase {

    private static final Logger LOG = LogManager.getLogger(SimpleFormDemoTest.class);


    @TestCaseId(101)
    @Test
    void singleInputField() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.SIMPLEFORMDEMO);
        assertThat(BaseApp.simpleFromDemo( )
                .enterMessage(cfg.enterMessageText( ))
                .clickShowMessage( )
                .verifyEnteredMessage(cfg.enterMessageText( ))).withFailMessage("Input Text is not matching").isTrue( );
    }

    @TestCaseId(102)
    @Test
    void twoInputField() {
        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.SIMPLEFORMDEMO);
        assertThat(BaseApp.simpleFromDemo( )
                .enterValueForA(cfg.valueForA( ))
                .enterValueForB(cfg.valueForB( ))
                .clickgetTotalButton( )
                .verifytotalSum(cfg.valueForB( ) + cfg.valueForA( )))
                .withFailMessage("Input Sum is not matching").isTrue( );
    }
}


