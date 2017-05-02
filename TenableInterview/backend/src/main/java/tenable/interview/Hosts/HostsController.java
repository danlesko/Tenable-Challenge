package tenable.interview.Hosts;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Dan Lesko on 4/29/2017.
 */
@Controller
@RequestMapping("/download")
public class HostsController {

    @Autowired
    private HostsService hostsService;

    @RequestMapping(value="/request", produces = "application/json")
    @ResponseBody
    public Configurations getHosts(@RequestParam("host") Integer host) {
        return hostsService.getHosts(host);
    }
}
