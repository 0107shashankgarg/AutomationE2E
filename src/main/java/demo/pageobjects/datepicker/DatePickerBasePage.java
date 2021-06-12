package demo.pageobjects.datepicker;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import demo.utils.PageUtils;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


public class DatePickerBasePage extends PageUtils {

    SelenideElement bootstrapDatePickerPopupDays = $x("//div[@class='datepicker-days']");
    SelenideElement bootstrapDatePickerPopupMonths = $x("//div[@class='datepicker-months']");
    SelenideElement bootstrapDatePickerPopupYears = $x("//div[@class='datepicker-years']");
    SelenideElement bootstrapDatePickerPopupCenturies = $x("//div[@class='datepicker-centuries']");


    ElementsCollection datePickerMonthAndYear = $$x(".//th[@class='datepicker-switch']");
    SelenideElement datePickerClear = $x("//th[@class='clear']");
    SelenideElement datePickerSelectToday = $x("//tr//th[@class='Today']");


    ElementsCollection datePickerDays = bootstrapDatePickerPopupDays.$$x(".//tr//td[@class ='day']");
    ElementsCollection datePickerFutureDays = bootstrapDatePickerPopupDays.$$x(".//tr//td[@class ='disabled day']");
    SelenideElement datePickerCurrentDay = bootstrapDatePickerPopupDays.$x(".//tr//td[@class ='today day']");


    ElementsCollection datePickerMonths = bootstrapDatePickerPopupMonths.$$x(".//span[@class='month']");
    ElementsCollection datePickerFutureMonths = bootstrapDatePickerPopupMonths.$$x(".//span[@class='month disabled']");
    SelenideElement datePickerCurrentMonth = bootstrapDatePickerPopupMonths.$x(".//span[@class='month focused']");


    ElementsCollection datePickerYear = bootstrapDatePickerPopupYears.$$x(".//span[@class='year']");
    ElementsCollection datePickerFutureYear = bootstrapDatePickerPopupMonths.$$x(".//span[@class='month disabled']");
    SelenideElement datePickerCurrentYear = bootstrapDatePickerPopupYears.$x(".//span[@class='year focused']");

    //th[@class='prev']


    //div[@class='datepicker-months']//span[@class='month']
    //div[@class='datepicker-days']//tbody//tr//td[@class ='day' and (text() = '1')]



}
