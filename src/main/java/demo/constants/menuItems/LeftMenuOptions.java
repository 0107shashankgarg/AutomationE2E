package demo.constants.menuItems;

public enum LeftMenuOptions {


    INPUTFORMS("Input Forms"),
    DATEPICKERS("Date pickers"),
    TABLE("Table"),
    PROGRESSBARSANDSLIDERS("Progress Bars & Sliders"),
    ALERTSANDMODALS("Alerts & Modals"),
    LISTBOX("List Box"),
    OTHERS("Others");


    private final String menuOption;

    LeftMenuOptions(String menuOption) {
        this.menuOption = menuOption;

    }

    public String getMenuOption() {
        return menuOption;
    }
}
