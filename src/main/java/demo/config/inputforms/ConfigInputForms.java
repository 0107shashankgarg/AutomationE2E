
package demo.config.inputforms;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(LoadType.MERGE)
@Sources({

        "file:${user.dir}/configs/inputforms/inputforms.config"
})
public interface ConfigInputForms extends Config {


    @Key("enter.message")
    String enterMessageText();

    @Key("entera")
    int valueForA();

    @Key("enterb")
    int valueForB();


}

