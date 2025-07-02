package vuln;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vuln")
public class XSSExample {
    @GetMapping("/welcome")
    public String welcome(@RequestParam String input) {
        return "Welcome " + input; // Reflected XSS
    }
}