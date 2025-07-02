package vuln;

import org.springframework.web.bind.annotation.*;
import java.security.*;

@RestController
@RequestMapping("/vuln")
public class InsecureHashExample {
    @GetMapping("/hash")
    public String getHash(@RequestParam String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(input.getBytes());
        return new String(digest);
    }
}