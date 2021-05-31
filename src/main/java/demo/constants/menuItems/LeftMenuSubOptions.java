package demo.constants.menuItems;


import static demo.constants.menuItems.LeftMenuOptions.*;

public enum LeftMenuSubOptions {

    // ("" ,PROGRESSBARSANDSLIDERS),

    SIMPLEFORMDEMO("Simple Form Demo", INPUTFORMS),
    CHECKBOXDEMO("Checkbox Demo", INPUTFORMS),
    RADIOBUTTONSDEMO("Radio Buttons Demo", INPUTFORMS),
    SELECTDROPDOWNLIST("Select Dropdown List", INPUTFORMS),
    INPUTFORMSUBMIT("Input Form Submit", INPUTFORMS),
    AJAXFORMSUBMIT("Ajax Form Submit", INPUTFORMS),
    JQUERYSELECTDROPDOWN("JQuery Select dropdown", INPUTFORMS),


    BOOTSTRAPDATEPICKER("Bootstrap Date Picker", DATEPICKERS),
    JQUERYDATEPICKER("JQuery Date Picker", DATEPICKERS),


    TABLEPAGINATION("Table Pagination", TABLE),
    TABLEDATASEARCH("Table Data Search", TABLE),
    TABLEFILTER("Table Filter", TABLE),
    TABLESORTSEARCH("Table Sort & Search", TABLE),
    TABLEDATADOWNLOAD("Table Data Download", TABLE),

    JQUERYDOWNLOADPROGRESSBARS("JQuery Download Progress bars", PROGRESSBARSANDSLIDERS),
    BOOTSTRAPPROGRESSBAR("Bootstrap Progress bar", PROGRESSBARSANDSLIDERS),
    DRAGDROPSLIDERS("Drag & Drop Sliders", PROGRESSBARSANDSLIDERS),
    BOOTSTRAPALERTS("Bootstrap Alerts", ALERTSANDMODALS),
    BOOTSTRAPMODALS("Bootstrap Modals", ALERTSANDMODALS),
    WINDOWPOPUPMODAL("Window Popup Modal", ALERTSANDMODALS),
    PROGRESSBARMODAL("Progress Bar Modal", ALERTSANDMODALS),
    JAVASCRIPTALERTS("Javascript Alerts", ALERTSANDMODALS),


    BOOTSTRAPLISTBOX("Bootstrap List Box", LISTBOX),
    JQUERYLISTBOX("JQuery List Box", LISTBOX),
    DATALISTFILTER("Data List Filter", LISTBOX),
    DRAGANDDROP("Drag and Drop", OTHERS),
    DYNAMICDATALOADING("Dynamic Data Loading", PROGRESSBARSANDSLIDERS),
    CHARTSDEMO("Charts Demo", PROGRESSBARSANDSLIDERS);


    private final String menuOption;
    private final LeftMenuOptions parentMenuOptions;

    LeftMenuSubOptions(String menuOption, LeftMenuOptions parentMenuOptions) {
        this.menuOption = menuOption;
        this.parentMenuOptions = parentMenuOptions;

    }

    public String getMenuOption() {
        return menuOption;
    }

    public LeftMenuOptions getparentMenuOptions() {
        return parentMenuOptions;
    }
}
