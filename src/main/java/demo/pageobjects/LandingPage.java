package demo.pageobjects;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import demo.pageobjects.basic.page.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class LandingPage extends BasePage {


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

