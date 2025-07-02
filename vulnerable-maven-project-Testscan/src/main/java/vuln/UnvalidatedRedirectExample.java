package vuln;

import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/vuln")
public class UnvalidatedRedirectExample {
    @GetMapping("/goto")
    public void gotoUrl(@RequestParam String url, HttpServletResponse res) throws IOException {
        res.sendRedirect(url);
    }
}