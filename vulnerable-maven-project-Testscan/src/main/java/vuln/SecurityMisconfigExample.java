package vuln;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vuln")
public class SecurityMisconfigExample {
    @GetMapping("/debug")
    public String showDebug() {
        return "Debug mode enabled. Stack trace: ...";
    }
}