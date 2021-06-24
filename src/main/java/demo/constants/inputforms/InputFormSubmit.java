package demo.constants.inputforms;

import static demo.constants.inputforms.ControlType.*;

public enum InputFormSubmit {

    FIRSTNAME("first_name", "First Name", INPUT),
    LASTNAME("last_name", "Last Name", INPUT),
    EMAILADDRESS("email", "E-Mail Address", INPUT),
    PHONE("phone", "(845)555-1212", INPUT),
    ADDRESS("address", "Address", INPUT),
    CITY("city", "city", INPUT),
    STATE("state", "", SIMPLE_DROPDOWN),
    ZIPCODE("zip", "Zip Code", INPUT),
    WEBSITE("website", "Website or domain name", INPUT),
    PROJECTDESCRIPTION("comment", "Project Description", INPUT),
    HOSTING("hosting", "yes", RADIO_BUTTON_GROUP);


    private final String name;
    private final String placeHolder;
    private final ControlType controlType;

    InputFormSubmit(String name, String placeHolder, ControlType controlType) {
        this.name = name;
        this.placeHolder = placeHolder;
        this.controlType = controlType;
    }

    public String getName() {
        return name;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public ControlType getControlType() {
        return controlType;
    }
}
