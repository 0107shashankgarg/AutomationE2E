package demo.pageobjects.basic.page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import demo.config.ConfigMapping;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static demo.constants.CommonXPaths.MAINPANEL;

public abstract class BasePage {

    private static final Integer TIME_OUT_IN_SECONDS = 30;
    protected ConfigMapping cfg = ConfigCache.getOrCreate(ConfigMapping.class, System.getProperties( ));

    protected SelenideElement mainArea = $x(MAINPANEL);
    protected SelenideElement pannel1 = mainArea.$x(".//div[@class ='panel panel-default'][1]");
    protected SelenideElement pannel2 = mainArea.$x(".//div[@class ='panel panel-default'][2]");

    protected static boolean waitForJStoLoad() {

        WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver( ), TIME_OUT_IN_SECONDS);

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = driver -> {
            try {
                return ((Long) executeJavaScript("return jQuery.active") == 0);
            } catch (Exception e) {
                return true;
            }
        };

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = driver -> executeJavaScript("return document.readyState")
                .toString( ).equals("complete");

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }
}
