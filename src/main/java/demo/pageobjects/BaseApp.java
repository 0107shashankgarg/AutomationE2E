package demo.pageobjects;


import demo.pageobjects.basic.page.AppMainPage;
import demo.pageobjects.inputforms.CheckBoxDemoPage;
import demo.pageobjects.inputforms.SimpleFromDemoPage;

import static com.codeborne.selenide.Selenide.page;

public class BaseApp {


    public static LandingPage landingPage() {
        return page(LandingPage.class);
    }

    public static AppMainPage appMainPage() {
        return page(AppMainPage.class);
    }

    public static SimpleFromDemoPage simpleFromDemo() {
        return page(SimpleFromDemoPage.class);
    }

    public static CheckBoxDemoPage checkBoxDemo() {
        return page(CheckBoxDemoPage.class);
    }

}

