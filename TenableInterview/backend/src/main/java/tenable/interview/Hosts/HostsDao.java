package tenable.interview.Hosts;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 * Created by Dan Lesko on 4/29/2017.
 */
@Repository
public class HostsDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Configurations getHosts(Integer host) {
        List<Hosts> hosts;

        hosts = entityManager.createNativeQuery(
                "SELECT * FROM hosts LIMIT " + host, Hosts.class).getResultList();

        hosts.removeIf(Objects::isNull);

        Configurations configurations = new Configurations(hosts);

        return configurations;
    }

}
