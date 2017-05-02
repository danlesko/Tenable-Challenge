package tenable.interview.Hosts;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Dan Lesko on 4/29/2017.
 */
public class Configurations {

    Configurations(List<Hosts> theconfig){
        configurations = theconfig;
    }


    private List<Hosts> configurations;

    public List<Hosts> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<Hosts> hosts) {
        this.configurations = configurations;
    }
}
