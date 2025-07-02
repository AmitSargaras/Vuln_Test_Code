package vuln;

import org.springframework.web.bind.annotation.*;
import java.io.File;

@RestController
@RequestMapping("/vuln")
public class DirectoryListingExample {
    @GetMapping("/list")
    public String listFiles() {
        File dir = new File(".");
        StringBuilder sb = new StringBuilder();
        for (File file : dir.listFiles()) {
            sb.append(file.getName()).append("\n");
        }
        return sb.toString();
    }
}