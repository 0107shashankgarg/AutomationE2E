package demo.test.ui.inputForms;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import demo.constants.inputforms.MultiSelectList;
import demo.constants.inputforms.SelectList;
import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
class SelectDropdownListTest extends InputFormsBase {

    private static final Logger LOG = LogManager.getLogger(SelectDropdownListTest.class);


    @Test
    void verifySignleSelectionFromOptionLink() {
        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.SELECTDROPDOWNLIST);
        BaseApp.selectDropdownListPage( )
                .SelectSingleValueFromList(SelectList.FRIDAY)
                .shouldBe(Condition.selectedText(SelectList.FRIDAY.getDayOfWeek( )));
    }


    @Test
    void verifySignleSelectionFromMultiOptionLink() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.SELECTDROPDOWNLIST);
        BaseApp.selectDropdownListPage( )
                .SelectSingleValueFromMultiList(MultiSelectList.CALIFORNIA)
                .shouldBe(Condition.selectedText(MultiSelectList.CALIFORNIA.getUSCityName( )));
    }

    @Test
    void verifySignleSelectionFromMultiOptionLink1() {

        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.SELECTDROPDOWNLIST);
        BaseApp.selectDropdownListPage( )
                .SelectMultipleValueFromMultiList(MultiSelectList.CALIFORNIA, MultiSelectList.FLORIDA)
                .getSelectedOptions( )
                .shouldHave(CollectionCondition.containExactTextsCaseSensitive(MultiSelectList.CALIFORNIA.getUSCityName( )),
                        CollectionCondition.containExactTextsCaseSensitive(MultiSelectList.FLORIDA.getUSCityName( )));





    }
}


