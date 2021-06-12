package demo.test.ui.datepicker;


import demo.constants.menuItems.LeftMenuSubOptions;
import demo.jupiter.displayname.HumanizeNameWithTestCaseId;
import demo.pageobjects.BaseApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.value;


@DisplayNameGeneration(HumanizeNameWithTestCaseId.class)
class BootstrapDatePickerTest extends DatePickerBase {

    private static final Logger LOG = LogManager.getLogger(BootstrapDatePickerTest.class);


    @Test
    void selectTodaysDateForBootStrapDatePicker() {


        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.BOOTSTRAPDATEPICKER);
        BaseApp.bootstrapDatePickerPage( )
                .selectTodaysdate( ).selectedDateValue
                .shouldHave(value(ZonedDateTime.now( ).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                        .because("Current time and date is not selected"));

    }

    /* Still need to improve this as we need more generic way to handel years*/
    // TODO: 6/10/21
    @Test
    void selectDateForBootStrapDatePicker() {

        LocalDate date = LocalDate.of(2015, 7, 15);
        String expectedDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.BOOTSTRAPDATEPICKER);
        BaseApp.bootstrapDatePickerPage( )
                .selectDate(date).selectedDateValue.shouldHave(value(expectedDate));

    }

    @Test
    void selectDateRange() {
        LocalDate stratDate = LocalDate.of(2015, 7, 15);
        LocalDate endDate = LocalDate.of(2016, 7, 15);
        BaseApp.appMainPage( ).clickMenuOption(LeftMenuSubOptions.BOOTSTRAPDATEPICKER);
        BaseApp.bootstrapDatePickerPage( ).enterStartEndDate(stratDate, endDate);

    }

}


