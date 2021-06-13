
package demo.config.inputforms;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(LoadType.MERGE)
@Sources({

        "file:${user.dir}/configs/inputforms/inputformsubmit"
})
public interface ConfigInputSubmitForms extends Config {


    @Key("first.name")
    String getFirstName();


    @Key("last.name")
    String getLastName();

    @Key("email")
    String getEmail();

    @Key("address")
    String getAddress();

    @Key("city")
    String getCity();

    @Key("state")
    String getState();

    @Key("zipcode")
    String getZipcode();

    @Key("phone")
    String getPhone();


    @Key("website.domain")
    String getwebsiteDomain();

    @Key("project.description")
    String getProjectDescription();


}

