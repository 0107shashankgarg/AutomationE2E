package demo.constants.inputforms;

public enum RadioButtonsGroup {

    GENDER("gender"),
    AGEGROUP("ageGroup");

    private final String radioButtonGroup;


    RadioButtonsGroup(String radioButtonGroup) {
        this.radioButtonGroup = radioButtonGroup;
    }

    public String getRadioButtonGroup() {
        return radioButtonGroup;
    }
}
