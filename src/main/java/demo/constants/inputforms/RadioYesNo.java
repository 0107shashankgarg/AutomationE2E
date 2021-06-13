package demo.constants.inputforms;

public enum RadioYesNo {
    YES("Yes"),
    NO("no");

    private final String value;

    RadioYesNo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
