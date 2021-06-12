package demo.test.ui.table;

import com.codeborne.selenide.CollectionCondition;
import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
class TablePaginationTest extends TableBase {

    private static final Logger LOG = LogManager.getLogger(TablePaginationTest.class);
    private static final Duration TIMEOUT = Duration.ofSeconds(5);


    @BeforeEach
    public void naviatgeToTablePaganation() {
        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.TABLEPAGINATION);
    }

    @Test
    void verifyNumberOfColumnsInTable() {


        BaseApp.tablePaginationPage( ).tableColumns.shouldHave(CollectionCondition.size(6), TIMEOUT);
    }

    @Test
    void verifyNumberOfDisplayedRowsInTable() {


        BaseApp.tablePaginationPage( ).tableRowsDisplayed.shouldHave(CollectionCondition.size(5), TIMEOUT);
    }

    @Test
    void previousButtonShouldBeDisabledAndNextEnabled() {
        BaseApp.tablePaginationPage( ).previousPage.shouldBe(visible.negate( ), TIMEOUT);
        BaseApp.tablePaginationPage( ).nextPage.shouldBe(visible, TIMEOUT);
    }

    @Test
    void previousAndNextButtonShouldBeEnabledSecondPageOnwards() {
        BaseApp.tablePaginationPage( ).navigateToNextPage( );
        BaseApp.tablePaginationPage( ).previousPage.shouldBe(visible, TIMEOUT);
        BaseApp.tablePaginationPage( ).nextPage.shouldBe(visible, TIMEOUT);

    }
}

