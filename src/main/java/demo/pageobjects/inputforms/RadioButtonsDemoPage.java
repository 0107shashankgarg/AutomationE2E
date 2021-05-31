package demo.pageobjects.inputforms;

import com.codeborne.selenide.SelenideElement;
import demo.config.inputforms.ConfigInputForms;
import org.aeonbits.owner.ConfigCache;

import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

public class RadioButtonsDemoPage extends InputFormsBasePage {

    protected ConfigInputForms cfg = ConfigCache.getOrCreate(ConfigInputForms.class, System.getProperties( ));
    SelenideElement mainArea = $x(MAINPANEL);
    SelenideElement enterMessage = mainArea.$x(".//input[@id ='user-message']");
    SelenideElement showmessageButton = mainArea.$x(".//button[normalize-space() ='Show Message']");
    SelenideElement displayEnterText = mainArea.$x(".//span[@id ='display']");
    SelenideElement entera = mainArea.$x(".//input[@id ='sum1']");
    SelenideElement enterb = mainArea.$x(".//input[@id ='sum2']");
    SelenideElement getTotalButton = mainArea.$x(".//button[normalize-space() ='Get Total']");
    SelenideElement getTotalReult = mainArea.$x(".//span[@id='displayvalue']");

    public RadioButtonsDemoPage enterMessage(String message) {
        enterText(enterMessage, message);
        return this;
    }

    public RadioButtonsDemoPage enterValueForA(int number) {
        enterText(entera, number);
        return this;
    }

    public RadioButtonsDemoPage enterValueForB(int number) {
        enterText(enterb, number);
        return this;
    }

    public RadioButtonsDemoPage clickShowMessage() {
        showmessageButton.click( );
        return this;
    }

    public RadioButtonsDemoPage clickgetTotalButton() {
        getTotalButton.click( );
        return this;
    }

    public boolean verifyEnteredMessage(String Enteredmessage) {
        return displayEnterText.getText( ).equals(Enteredmessage);
    }

    public boolean verifytotalSum(int sum) {
        return getTotalReult.getText( ).equals(String.valueOf(sum));
    }
}
