package vuln;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vuln")
public class SensitiveDataExposureExample {
    @GetMapping("/creditcard")
    public String exposeData() {
        return "Card number: 4111 1111 1111 1111";
    }
}