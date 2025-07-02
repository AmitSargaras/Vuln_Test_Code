package vuln;

import org.springframework.web.bind.annotation.*;
import java.io.*;

@RestController
@RequestMapping("/vuln")
public class CommandInjectionExample {
    @GetMapping("/run")
    public String runCommand(@RequestParam String cmd) throws IOException {
        Process p = Runtime.getRuntime().exec(cmd);
        return "Executed command: " + cmd;
    }
}