package demo.pageobjects.table;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import demo.constants.tables.SearchTable;
import demo.constants.tables.TableFilterTextBox;

import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

public class TableDataSearchPage extends TableBasePage {


    //.is(Condition.checked)
    SelenideElement mainArea = $x(MAINPANEL);
    SelenideElement taskPanel = mainArea.$x(".//div[@class='panel panel-primary']");
    SelenideElement taskSearchBox = taskPanel.$x(".//input[@id='task-table-filter']");
    SelenideElement resultTaskTable = taskPanel.$x(".//table[@id= 'task-table']");
    public ElementsCollection displayedResults = resultTaskTable.$$x(".//tbody//tr");
    ElementsCollection tableColumns = taskPanel.$$x(".//thead//th");
    ElementsCollection diaplyedRowsValue = resultTaskTable.$$x(".//tbody//tr//td");

    SelenideElement filterTablePanel = mainArea.$x(".//div[@class ='panel panel-primary filterable']");
    public ElementsCollection filterText = filterTablePanel.$$x(".//thead//input");
    SelenideElement filterTable = filterTablePanel.$x(".//table");
    SelenideElement filterButton = filterTablePanel.$x("./button");

    public TableDataSearchPage enterSearchTerm(String searchTerm) {
        enterText(taskSearchBox, searchTerm);
        return this;
    }


    public SelenideElement verifySearch(SearchTable columnName) {
        for (int i = 0; i < tableColumns.size( ); i++) {

            if ( tableColumns.get(i).getText( ).equals(columnName.getColumnName( )) )
                return findRowForAColumn(i);
        }
        return null;
    }


    private SelenideElement findRowForAColumn(int rowColumn) {
        return (diaplyedRowsValue.get(rowColumn));

    }

    public TableDataSearchPage enterSearchTerm(TableFilterTextBox filter, String searchTerm) {
        filterButton.click( );
        enterText(filterText
                .filter(Condition.attribute("placeholder", filter.getFilterColumnName( )))
                .first( ), searchTerm);
        return this;
    }


}
