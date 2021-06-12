package demo.test.ui.table;

import com.codeborne.selenide.Condition;
import demo.constants.menuItems.LeftMenuSubOptions;
import demo.constants.tables.SearchTable;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
class TableDataSearchTest extends TableBase {

    private static final Logger LOG = LogManager.getLogger(TableDataSearchTest.class);
    private static final Duration TIMEOUT = Duration.ofSeconds(5);

    @BeforeEach
    public void naviatgeToTablePaganation() {
        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.TABLEDATASEARCH);
    }

    @Test
    public void checkOnlyOneTableIsReturned() {
        BaseApp.tableDataSearchPage( ).enterSearchTerm("Wireframes").displayedResults.filter(Condition.visible)
                .shouldHave(size(1));
    }

    @Test
    public void checkCorrectResultIsReturned() {
        String searchedTerm = "Wireframes";
        BaseApp.tableDataSearchPage( )
                .enterSearchTerm(searchedTerm)
                .verifySearch(SearchTable.ASSIGNEE)
                .shouldHave(text("John Smith"));
    }

    @Test
    void tableFiltersShouldBeDisabledByDefault() {
        BaseApp.tableDataSearchPage( )
                .filterText.filter(Condition.enabled)
                .shouldHave(size(0));
    }


}



