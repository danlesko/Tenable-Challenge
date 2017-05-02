package tenable.interview.Hosts;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dan Lesko on 4/29/2017.
 */
@Service
public class HostsService {

    @Autowired
    private HostsDao hostsDao;

    @Transactional
    public Configurations getHosts(Integer host) {
        return hostsDao.getHosts(host);
    }
}
