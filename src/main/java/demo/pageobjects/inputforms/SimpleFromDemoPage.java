package demo.pageobjects.inputforms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import demo.config.inputforms.ConfigInputForms;
import org.aeonbits.owner.ConfigCache;

import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

public class SimpleFromDemoPage extends InputFormsBasePage {

    SelenideElement mainArea = $x(MAINPANEL);
    SelenideElement enterMessage = mainArea.$x(".//input[@id ='user-message']");
    SelenideElement showmessageButton = mainArea.$x(".//button[normalize-space() ='Show Message']");
    SelenideElement displayEnterText = mainArea.$x(".//span[@id ='display']");
    SelenideElement entera = mainArea.$x(".//input[@id ='sum1']");
    SelenideElement enterb = mainArea.$x(".//input[@id ='sum2']");
    SelenideElement getTotalButton = mainArea.$x(".//button[normalize-space() ='Get Total']");
    SelenideElement getTotalReult = mainArea.$x(".//span[@id='displayvalue']");
    protected ConfigInputForms cfg = ConfigCache.getOrCreate(ConfigInputForms.class, System.getProperties( ));

    public SimpleFromDemoPage enterMessage(String message) {
        enterMessage.shouldBe(Condition.visible);
        enterText(enterMessage, message);
        return this;
    }

    public SimpleFromDemoPage enterValueForA(int number) {
        enterText(entera, number);
        return this;
    }

    public SimpleFromDemoPage enterValueForB(int number) {
        enterText(enterb, number);
        return this;
    }

    public SimpleFromDemoPage clickShowMessage() {
        showmessageButton.click( );
        return this;
    }

    public SimpleFromDemoPage clickgetTotalButton() {
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
