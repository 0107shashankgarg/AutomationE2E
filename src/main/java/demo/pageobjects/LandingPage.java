package demo.pageobjects;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import demo.utils.PageUtils;

import static com.codeborne.selenide.Selenide.$x;

public class LandingPage extends PageUtils {


    private SelenideElement closePopup = $x("//a[@title='Close']");
    //div[@class='panel-body']

    public LandingPage open() {
        Selenide.open(cfg.appBaseUrl( ));
        return this;
    }

    public void ClosePopUp() {
        if ( closePopup.exists( ) )
            closePopup.click( );
    }

}

