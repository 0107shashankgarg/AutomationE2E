package demo.jupiter.extension;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import demo.config.ConfigMapping;
import org.aeonbits.owner.ConfigCache;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class WebDriverExtension implements BeforeEachCallback, AfterEachCallback {

    protected static final int TIMEOUT = 25000;
    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(WebDriverExtension.class);
    private static final String RESOLUTION_FULL_HD = "1920x1080x24";
    private static final Dimension DIMENSION_FULL_HD = new Dimension(1920, 1080);
    private ConfigMapping cfg = ConfigCache.getOrCreate(ConfigMapping.class, System.getProperties( ));
    private WebDriver webDriver;

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        Optional<Method> testMethod = extensionContext.getTestMethod( );
        initDriver(cfg.selenideBrowser( ),
                testMethod.isPresent( ) ? testMethod.get( ).getName( ) : null);
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        Selenide.closeWebDriver( );
    }

/*
    @Override
    public void handleTestExecutionException(ExtensionContext extensionContext, Throwable throwable) throws Throwable {
       // sendScreenshotOnFailure(throwable);
        throw throwable;
    }
*/

    private void initDriver(String browser, String testName) {
        Configuration.screenshots = false;
        Configuration.timeout = TIMEOUT;

        if ( cfg.isRemote( ) ) {
            webDriver = initRemoteDriver(browser, testName, true);
        } else {

            localDriverSetup(browser);



/*            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            WebDriverManager.chromedriver().setup();
            webDriver= new ChromeDriver(options);
           webDriver.manage().window().maximize();*//*

            Configuration.browser = browser;
            Configuration.startMaximized = true;
            //Configuration.timeout= Long.parseLong(System.getProperty("selenide.openBrowserTimeout", "600000"));
            System.setProperty("chromeoptions.args", "--no-proxy-server");
            //Stage
            // System.setProperty("webdriver.chrome.driver", workingDir);
Selenide.open();*/

        }
        // WebDriverRunner.setWebDriver(getWebDriver());
    }

    private void localDriverSetup(String requiredBrowserName) {
        Configuration.browser = requiredBrowserName;
        Configuration.startMaximized = true;
        // Selenide.open();
        //  WebDriverRunner.setWebDriver(getWebDriver());

    }


    private RemoteWebDriver initRemoteDriver(String browser, String testName, boolean retryIfError) {
        DesiredCapabilities capability = new DesiredCapabilities( );
        capability.setBrowserName(browser);
        capability.setCapability("name", testName);
        capability.setCapability("screenResolution", RESOLUTION_FULL_HD);
        capability.setCapability("enableVideo", true);
        try {
            RemoteWebDriver driver = new RemoteWebDriver(new URL(cfg.remoteDriverUrl( )), capability);
            driver.setFileDetector(new LocalFileDetector( ));
            driver.manage( ).window( ).setSize(DIMENSION_FULL_HD);
            if ( isAlive(driver) ) {
                return driver;
            } else {
                if ( retryIfError ) {
                    LOG.warn("Session not found, try to re-init");
                    return initRemoteDriver(browser, testName, false);
                } else {
                    throw new IllegalStateException("Remote session is die");
                }
            }
        } catch (MalformedURLException e) {
            throw new IllegalStateException("Error while configuring url for remote web driver");
        }
    }

    private boolean isAlive(WebDriver driver) {
        try {
            driver.getCurrentUrl( );
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
/*
    private void sendScreenshotOnFailure(Throwable exception) {
    String screenshotFileName = Long.toString(System.currentTimeMillis());
    LOG.error("RP_MESSAGE#FILE#{}#{}", new File(takeScreenShot(screenshotFileName)), exception.getMessage());
}*/
}