package demo.test.ui.inputForms;

import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
class Allure {


    @Test
    public void Test1() {
        boolean a = true;
        assertThat(a).isTrue( );
    }

    @Test
    public void Test2() {
        boolean a = true;
        assertThat(a).isFalse( ).withFailMessage("this will fail");
    }
}


