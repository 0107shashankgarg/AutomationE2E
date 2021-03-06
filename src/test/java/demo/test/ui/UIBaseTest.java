package demo.test.ui;

import demo.config.ConfigMapping;
import demo.jupiter.extension.TestResultPublisherExtension;
import demo.jupiter.extension.UserParameterResolver;
import demo.jupiter.extension.WebDriverExtension;
import demo.pageobjects.BaseApp;
import org.aeonbits.owner.ConfigCache;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({TestResultPublisherExtension.class, UserParameterResolver.class, WebDriverExtension.class})

abstract public class UIBaseTest {

    public ConfigMapping cfg = ConfigCache.getOrCreate(ConfigMapping.class, System.getProperties( ));

    @BeforeEach
    public void openBaseUrl() {
        BaseApp.landingPage( ).open( ).ClosePopUp( );
    }


}