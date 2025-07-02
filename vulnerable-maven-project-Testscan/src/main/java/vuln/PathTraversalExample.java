package vuln;

import org.springframework.web.bind.annotation.*;
import java.nio.file.*;
import java.io.*;

@RestController
@RequestMapping("/vuln")
public class PathTraversalExample {
    @GetMapping("/read")
    public String readFile(@RequestParam String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
}