package demo.pageobjects;


import demo.pageobjects.basic.page.AppMainPage;
import demo.pageobjects.datepicker.BootstrapDatePickerPage;
import demo.pageobjects.datepicker.DatePickerBasePage;
import demo.pageobjects.datepicker.JQueryDatePickerPage;
import demo.pageobjects.inputforms.*;
import demo.pageobjects.listbox.BootstrapListBoxPage;
import demo.pageobjects.listbox.DataListFilterPage;
import demo.pageobjects.listbox.JQueryListBoxPage;
import demo.pageobjects.others.ChartsDemoPage;
import demo.pageobjects.others.DragAndDropPage;
import demo.pageobjects.others.DynamicDataLoadingPage;
import demo.pageobjects.progressbarsandslider.BootstrapProgressBarsPage;
import demo.pageobjects.progressbarsandslider.DragAndDropSlidersPage;
import demo.pageobjects.progressbarsandslider.JQueryDownloadProgressBarsPage;
import demo.pageobjects.table.*;

import static com.codeborne.selenide.Selenide.page;

public class BaseApp {


    public static LandingPage landingPage() {
        return page(LandingPage.class);
    }

    public static AppMainPage appMainPage() {
        return page(AppMainPage.class);
    }

    public static SimpleFromDemoPage simpleFromDemo() {
        return page(SimpleFromDemoPage.class);
    }

    public static CheckBoxDemoPage checkBoxDemo() {
        return page(CheckBoxDemoPage.class);
    }

    public static AjaxFormSubmitPage ajaxFormSubmitPage() {
        return page(AjaxFormSubmitPage.class);
    }

    public static InputFormSubmitPage inputFormSubmitPage() {
        return page(InputFormSubmitPage.class);
    }

    public static JQuerySelectDropdownPage jQuerySelectDropdownPage() {
        return page(JQuerySelectDropdownPage.class);
    }

    public static RadioButtonsDemoPage radioButtonsDemoPage() {
        return page(RadioButtonsDemoPage.class);
    }

    public static SelectDropdownListPage selectDropdownListPage() {
        return page(SelectDropdownListPage.class);
    }

    public static BootstrapDatePickerPage bootstrapDatePickerPage() {
        return page(BootstrapDatePickerPage.class);
    }
    public static DatePickerBasePage datePickerBasePage() {
        return page(DatePickerBasePage.class);
    }

    public static JQueryDatePickerPage jQueryDatePickerPage() {
        return page(JQueryDatePickerPage.class);
    }

    public static BootstrapListBoxPage bootstrapListBoxPage() {
        return page(BootstrapListBoxPage.class);
    }

    public static DataListFilterPage dataListFilterPage() {
        return page(DataListFilterPage.class);
    }

    public static JQueryListBoxPage jQueryListBoxPage() {
        return page(JQueryListBoxPage.class);
    }

    public static ChartsDemoPage chartsDemoPage() {
        return page(ChartsDemoPage.class);
    }

    public static DragAndDropPage dragAndDropPage() {
        return page(DragAndDropPage.class);
    }

    public static DynamicDataLoadingPage dynamicDataLoadingPage() {
        return page(DynamicDataLoadingPage.class);
    }

    public static BootstrapProgressBarsPage bootstrapProgressBarsPage() {
        return page(BootstrapProgressBarsPage.class);
    }

    public static DragAndDropSlidersPage dragAndDropSlidersPage() {
        return page(DragAndDropSlidersPage.class);
    }

    public static JQueryDownloadProgressBarsPage JQueryDownloadProgressBarsPage() {
        return page(JQueryDownloadProgressBarsPage.class);
    }

    public static TableDataDownloadPage tableDataDownloadPage() {
        return page(TableDataDownloadPage.class);
    }

    public static TableDataSearchPage tableDataSearchPage() {
        return page(TableDataSearchPage.class);
    }

    public static TableFilterPage tableFilterPage() {
        return page(TableFilterPage.class);
    }

    public static TablePaginationPage tablePaginationPage() {
        return page(TablePaginationPage.class);
    }

    public static TableSortAndSearchPage tableSortAndSearchPage() {
        return page(TableSortAndSearchPage.class);
    }


}

