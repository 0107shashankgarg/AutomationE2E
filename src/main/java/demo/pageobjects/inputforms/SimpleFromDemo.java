package demo.pageobjects.inputforms;

import com.codeborne.selenide.SelenideElement;
import demo.config.inputforms.ConfigInputForms;
import org.aeonbits.owner.ConfigCache;

import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

public class SimpleFromDemo extends InputFormsBase {

    SelenideElement mainArea = $x(MAINPANEL);
    SelenideElement enterMessage = mainArea.$x(".//input[@id ='user-message']");
    SelenideElement showmessageButton = mainArea.$x(".//button[normalize-space() ='Show Message']");
    SelenideElement displayEnterText = mainArea.$x(".//span[@id ='display']");
    SelenideElement entera = mainArea.$x(".//input[@id ='sum1']");
    SelenideElement enterb = mainArea.$x(".//input[@id ='sum2']");
    SelenideElement getTotalButton = mainArea.$x(".//button[normalize-space() ='Get Total']");
    SelenideElement getTotalReult = mainArea.$x(".//span[@id='displayvalue']");
    private ConfigInputForms cfg = ConfigCache.getOrCreate(ConfigInputForms.class, System.getProperties( ));

    public SimpleFromDemo enterMessage(String message) {
        enterText(enterMessage, message);
        return this;
    }

    public SimpleFromDemo enterValueForA(int number) {
        enterText(entera, number);
        return this;
    }

    public SimpleFromDemo enterValueForB(int number) {
        enterText(enterb, number);
        return this;
    }

    public SimpleFromDemo clickShowMessage() {
        showmessageButton.click( );
        return this;
    }

    public SimpleFromDemo clickgetTotalButton() {
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
