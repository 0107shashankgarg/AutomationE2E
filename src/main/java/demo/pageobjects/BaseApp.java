package demo.pageobjects;


import demo.pageobjects.basic.page.AppMainPage;
import demo.pageobjects.inputforms.CheckBoxDemo;
import demo.pageobjects.inputforms.SimpleFromDemo;

import static com.codeborne.selenide.Selenide.page;

public class BaseApp {


    public static LandingPage landingPage() {
        return page(LandingPage.class);
    }

    public static AppMainPage appMainPage() {
        return page(AppMainPage.class);
    }

    public static SimpleFromDemo simpleFromDemo() {
        return page(SimpleFromDemo.class);
    }

    public static CheckBoxDemo checkBoxDemo() {
        return page(CheckBoxDemo.class);
    }

}

