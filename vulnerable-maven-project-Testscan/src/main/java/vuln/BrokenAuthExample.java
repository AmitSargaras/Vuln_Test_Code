package vuln;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vuln")
public class BrokenAuthExample {
    @GetMapping("/admin")
    public String getAdmin(@RequestParam String role) {
        if ("admin".equals(role)) {
            return "Welcome Admin!";
        }
        return "Access Denied";
    }
}