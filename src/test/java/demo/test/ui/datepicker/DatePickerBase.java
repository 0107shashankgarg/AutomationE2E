package demo.test.ui.datepicker;

import demo.config.inputforms.ConfigInputForms;
import demo.test.ui.UIBaseTest;
import org.aeonbits.owner.ConfigCache;


public class DatePickerBase extends UIBaseTest {

    protected ConfigInputForms cfg = ConfigCache.getOrCreate(ConfigInputForms.class, System.getProperties( ));
}
