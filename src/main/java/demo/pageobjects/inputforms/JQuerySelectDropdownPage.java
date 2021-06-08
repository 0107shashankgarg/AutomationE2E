package demo.pageobjects.inputforms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

@ExtendWith({SoftAssertsExtension.class})
public class JQuerySelectDropdownPage extends InputFormsBasePage {


    //.is(Condition.checked)
    SelenideElement mainArea = $x(MAINPANEL);
    SelenideElement countrySelectBox = mainArea.$x(".//span[@id='select2-country-container']").parent( );
    SelenideElement countryValues = $x(".//ul[@id='select2-country-results']");
    SelenideElement statesSelectBox = mainArea.$x(".//input[@class='select2-search__field']");
    SelenideElement stateValue = $x("//ul[@class='select2-results__options']");
    SelenideElement territoriesSelectBox = mainArea.$$x(".//span[@class='select2-selection__rendered']").get(1);
    SelenideElement territories = stateValue;
    SelenideElement selectAFile = mainArea.$x(".//select[@name='files']");


    public JQuerySelectDropdownPage selectCountry(String Country) {
        selectValuesByliInDropDown(countrySelectBox, countryValues, Country);

        return this;
    }

    public JQuerySelectDropdownPage selectState(String... territoriesvalues) {
        selectValuesByliInDropDown(statesSelectBox, stateValue, territoriesvalues);
        return this;
    }

    public JQuerySelectDropdownPage selectTerritories(String... territoriesvalues) {
        selectValuesByliInDropDown(territoriesSelectBox, territories, territoriesvalues);
        return this;
    }

    public JQuerySelectDropdownPage selectCategory(String catergory) {
        selectAFile.selectOption(catergory);
        return this;
    }


    private void selectValuesByliInDropDown(SelenideElement selectBox, SelenideElement values, String... valuesToSelect) {
        for (String str : valuesToSelect) {
            selectBox.click( );
            String countryXPATH = ".//li[normalize-space(.) = '" + str + "']";
            values.$x(countryXPATH).shouldNotHave(Condition.attribute("aria-disabled")
                    .because("The option u wish to select is disabled"), Duration.ofSeconds(2)).click( );


        }
    }

}
