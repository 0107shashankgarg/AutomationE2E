package demo.test.ui.listbox;

import demo.config.inputforms.ConfigInputForms;
import demo.test.ui.UIBaseTest;
import org.aeonbits.owner.ConfigCache;


public class ListBoxBase extends UIBaseTest {

    protected ConfigInputForms cfg = ConfigCache.getOrCreate(ConfigInputForms.class, System.getProperties( ));
}
