package demo.test.ui.progressbarandslider;

import demo.config.inputforms.ConfigInputForms;
import demo.test.ui.UIBaseTest;
import org.aeonbits.owner.ConfigCache;


public class ProgressBarAndSliderBase extends UIBaseTest {

    protected ConfigInputForms cfg = ConfigCache.getOrCreate(ConfigInputForms.class, System.getProperties( ));
}
