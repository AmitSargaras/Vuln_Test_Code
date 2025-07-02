package vuln;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vuln")
public class WeakSSLConfigExample {
    @GetMapping("/ssl")
    public String weakSSL() {
        return "SSLv3 enabled"; // Placeholder message
    }
}