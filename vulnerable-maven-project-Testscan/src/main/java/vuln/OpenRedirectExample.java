package vuln;

import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/vuln")
public class OpenRedirectExample {
    @GetMapping("/redirect")
    public void redirect(@RequestParam String target, HttpServletResponse response) throws IOException {
        response.sendRedirect(target);
    }
}