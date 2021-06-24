package demo.pageobjects.basic.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import demo.constants.menuItems.LeftMenuOptions;
import demo.constants.menuItems.LeftMenuSubOptions;
import demo.utils.PageUtils;

import static com.codeborne.selenide.Selenide.$x;

public class AppMainPage extends PageUtils {

    SelenideElement leftPanel = $x("//div[@class='panel-body']");
    SelenideElement leftPanelOptionsBox = leftPanel.$x("./ul/li");
    SelenideElement allExamples = leftPanelOptionsBox.$x("/a");
    ElementsCollection leftPanelOptions = leftPanelOptionsBox.$$x("./ul/li");
    //ElementsCollection leftPanelOptions = $$x("") ;


    public void clickMenuOption(LeftMenuSubOptions leftMenuSubOption) {
        SelenideElement menu = leftPanelOptions.stream( )
                .filter(ele -> ele.getText( ).equals(leftMenuSubOption.getparentMenuOptions( ).getMenuOption( )))
                .findFirst( ).get( );

        menu.click( );

        menu.$$x("./ul/li/a")
                .stream( )
                .filter(ele -> ele.getText( ).equals(leftMenuSubOption.getMenuOption( )))
                .peek(ele -> System.out.println(ele.getText( )))
                .findFirst( )
                .get( )
                .click( );


    }

    public void clickMenuOption(LeftMenuOptions leftMenuOption) {
        leftPanelOptions.stream( )
                .filter(ele -> ele.getText( ).equals(leftMenuOption.getMenuOption( )))
                .peek(ele -> System.out.println(ele.getText( )))
                .findFirst( )
                .get( )
                .click( );
/*      for (SelenideElement ele: leftPanelOptions)

        {
            if(ele.getText().equals(leftMenuOption.getMenuOption()));

            {
                ele.click();
                break;
            }
        }

        leftPanelOptions.forEach(ele ->
                {
                    if ( ele.getText().equals(leftMenuOption.getMenuOption()))
                    {
                        ele.click();
                    }



                }
        );

        leftPanelOptions.stream().filter(ele -> ele.getText().equals(leftMenuOption.getMenuOption())).forEach(ele -> {
            ele.click();

        });*/

    }


}
