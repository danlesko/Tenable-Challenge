package tenable.interview.Hosts;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by Dan Lesko on 4/9/2017.
 */
@Entity
@IdClass(Hosts.class)
@Table(name = "hosts")
public class Hosts implements Serializable {

    @Id
    @Column
    private String name;

    @Column
    private String hostname;

    @Column
    private Integer port;

    @Column
    private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
