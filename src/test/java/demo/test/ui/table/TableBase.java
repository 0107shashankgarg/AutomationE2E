package demo.test.ui.table;

import demo.config.inputforms.ConfigInputForms;
import demo.test.ui.UIBaseTest;
import org.aeonbits.owner.ConfigCache;


public class TableBase extends UIBaseTest {
    protected ConfigInputForms cfg = ConfigCache.getOrCreate(ConfigInputForms.class, System.getProperties( ));

}
