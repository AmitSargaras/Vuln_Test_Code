package vuln;

import org.springframework.web.bind.annotation.*;
import java.net.*;
import java.io.*;

@RestController
@RequestMapping("/vuln")
public class SSRFExample {
    @GetMapping("/fetch")
    public String fetch(@RequestParam String url) throws IOException {
        URL u = new URL(url);
        BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
        return br.readLine();
    }
}