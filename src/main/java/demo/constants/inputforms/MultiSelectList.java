package demo.constants.inputforms;

public enum MultiSelectList {


    CALIFORNIA("California"),
    FLORIDA("Florida"),
    NEWJERSEY("New Jersey"),
    NEWYORK("New York"),
    OHIO("Ohio"),
    TEXAS("Texas"),
    PENNSYLVANIA("Pennsylvania"),
    WASHINGTON("Washington");


    private final String USCityName;

    MultiSelectList(String USCityName) {
        this.USCityName = USCityName;
    }

    public String getUSCityName() {
        return USCityName;
    }
}

