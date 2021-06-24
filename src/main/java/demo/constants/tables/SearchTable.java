package demo.constants.tables;

public enum SearchTable {

    SERIALNUMBER("#"),
    TASK("Task"),
    ASSIGNEE("Assignee"),
    STATUS("Status");

    private final String columnName;


    SearchTable(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnName() {
        return columnName;
    }
}


