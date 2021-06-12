package demo.constants.tables;

public enum TableFilterTextBox {

    SERIALNUMBER("#"),
    USERNAME("Username"),
    FIRSTNAME("First Name"),
    LASTNAME("Last Name");

    private final String filterColumnName;


    TableFilterTextBox(String filterColumnName) {
        this.filterColumnName = filterColumnName;
    }

    public String getFilterColumnName() {
        return filterColumnName;
    }
}


