package demo.pageobjects.datepicker;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.LocalDate;
import java.time.Month;

import static com.codeborne.selenide.Selenide.$x;
import static demo.constants.CommonXPaths.MAINPANEL;

public class BootstrapDatePickerPage extends DatePickerBasePage {



    SelenideElement mainArea = $x(MAINPANEL);
    public SelenideElement selectedDateValue = $x("//div[@class='input-group date']//input");
    SelenideElement bootStrapDatePickerIcon = mainArea.$x(".//i[@class='glyphicon glyphicon-th']");
    SelenideElement startDateSelector = $x("//input[@placeholder ='Start date']");
    SelenideElement endDateSelector = $x("//input[@placeholder ='End date']");

    private void openBoostrapDatePicker() {
        bootStrapDatePickerIcon.click( );

    }

    public BootstrapDatePickerPage enterStartEndDate(LocalDate startDate, LocalDate endDate) {
        startDateSelector.click( );
        selectADate(startDate);
        endDateSelector.click( );

        return this;
    }

    public BootstrapDatePickerPage selectTodaysdate() {

        openBoostrapDatePicker( );
        datePickerCurrentDay.click( );

        return this;
    }

    public BootstrapDatePickerPage selectDate(LocalDate date) {
        openBoostrapDatePicker( );
        selectADate(date);
        return this;
    }

    private void selectADate(LocalDate date) {


        selectYear(date.getYear( ));
        selectMonth(date.getMonth( ));
        selectDay(date.getDayOfMonth( ));

    }


    private void selectYear(int year) {
        datePickerMonthAndYear.filter(Condition.visible).first( ).click( );
        datePickerMonthAndYear.filter(Condition.visible).first( ).click( );
        bootstrapDatePickerPopupYears.$x(".//th[@class='prev']").click( );
        datePickerYear.filter(Condition.text(String.valueOf(year))).first( ).click( );

    }

    private void selectMonth(Month month) {
        datePickerMonths.filter(Condition.text(month.toString( ).substring(0, 3))).first( ).click( );


    }

    private void selectDay(int day) {
        datePickerDays.filter(Condition.text(String.valueOf(day))).first( ).click( );


    }


}
