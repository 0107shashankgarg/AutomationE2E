package demo.pageobjects.inputforms;

import com.codeborne.selenide.SelenideElement;
import demo.constants.inputforms.MultiSelectList;
import demo.constants.inputforms.SelectList;

public class SelectDropdownListPage extends InputFormsBasePage {


    //.is(Condition.checked)
    SelenideElement selectList = pannel1.$x(".//select");
    SelenideElement selectMultiList = pannel2.$x(".//select");


    public SelenideElement SelectSingleValueFromList(SelectList selectListValue) {
        selectList.selectOptionByValue(selectListValue.getDayOfWeek( ));
        return selectList;


    }

    public SelenideElement SelectSingleValueFromMultiList(MultiSelectList multiSelectListValue) {
        selectMultiList.selectOptionByValue(multiSelectListValue.getUSCityName( ));
        return selectMultiList;

    }


    public String isCorrectSingleListValueSelected() {
        return selectList.getSelectedValue( );


    }

    public String isCorrectMultiListValueSelected() {
        return selectList.getSelectedValue( );


    }

    public SelenideElement SelectMultipleValueFromMultiList(MultiSelectList... multiSelectListValue) {

        for (MultiSelectList selOption : multiSelectListValue) {
            selectMultiList.selectOptionByValue(selOption.getUSCityName( ));
        }

        return selectMultiList;
    }


    public SelectDropdownListPage SelectAllValueFromMultiList(Enum allVlues) {

        selectList.selectOptionByValue("bb", "c");
        return this;

    }

}
