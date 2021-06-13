package demo.pageobjects.table;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

public class TablePaginationPage extends TableBasePage {

    private static final Logger LOG = LogManager.getLogger(TablePaginationPage.class);
    //.is(Condition.checked)
    SelenideElement mainArea = $x(MAINPANEL);
    SelenideElement mainTableSection = mainArea.$x(".//section[@class='content']");
    public ElementsCollection tableColumns = mainTableSection.$$x(".//th[contains(text(),'Table heading')]");
    SelenideElement paganationSection = mainArea.$x(".//div[@class='col-md-6 text-center']");
    public SelenideElement previousPage = paganationSection.$x(".//a[@class='prev_link']");
    public SelenideElement nextPage = paganationSection.$x(".//a[@class='next_link']");
    SelenideElement tableBody = mainTableSection.$x(".//tbody[@id = 'myTable']");
    public ElementsCollection tableRowsDisplayed = tableBody.$$x(".//tr[not(contains(@style, 'none'))]");
    SelenideElement selectedPage = paganationSection.$x(".//a[@class='page_link active']");


    ////div[@class='col-md-6 text-center']//a[@class='page_link']


    public TablePaginationPage test() {
        System.out.println("yyr");
        return this;
    }

    public TablePaginationPage navigateToNextPage() {

        int page = Integer.valueOf(selectedPage.getText( )) + 1;
        if ( paganationSection.$$x(".//a[contains(@class,'page_link')]").size( ) > page )
            paganationSection.$$x(".//a[@class='page_link']")
                    .filter(Condition.text(String.valueOf(page)))
                    .first( )
                    .click( );
        else
            LOG.info("You are already on the last page");
        return this;
    }
}

