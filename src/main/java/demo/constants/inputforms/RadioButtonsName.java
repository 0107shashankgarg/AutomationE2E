package demo.constants.inputforms;

import static demo.constants.inputforms.RadioButtonsGroup.AGEGROUP;
import static demo.constants.inputforms.RadioButtonsGroup.GENDER;

public enum RadioButtonsName {

    MALE("Male", GENDER),
    FEMALE("Female", GENDER),
    AGE0TO5("0 - 5", AGEGROUP),
    AGE5TO15("5 - 15", AGEGROUP),
    AGE15TO50("15 - 50", AGEGROUP);

    private final String value;

    private final RadioButtonsGroup group;

    RadioButtonsName(String value, RadioButtonsGroup broup) {
        this.value = value;
        this.group = broup;
    }

    public String getValue() {
        return value;
    }

    public RadioButtonsGroup getGroup() {
        return group;
    }
}
