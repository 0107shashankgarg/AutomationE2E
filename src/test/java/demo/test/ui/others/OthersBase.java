package demo.test.ui.others;

import demo.config.inputforms.ConfigInputForms;
import demo.test.ui.UIBaseTest;
import org.aeonbits.owner.ConfigCache;


public class OthersBase extends UIBaseTest {
    protected ConfigInputForms cfg = ConfigCache.getOrCreate(ConfigInputForms.class, System.getProperties( ));


}
