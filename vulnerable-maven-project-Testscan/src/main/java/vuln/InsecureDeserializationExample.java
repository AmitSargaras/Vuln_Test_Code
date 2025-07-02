package vuln;

import org.springframework.web.bind.annotation.*;
import java.io.*;

@RestController
@RequestMapping("/vuln")
public class InsecureDeserializationExample {
    @PostMapping("/deserialize")
    public String deserialize(@RequestBody byte[] data) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
        Object obj = ois.readObject();
        return "Deserialized object: " + obj.toString();
    }
}