package vuln;

import org.springframework.web.bind.annotation.*;
import java.sql.*;

@RestController
@RequestMapping("/vuln")
public class SQLInjectionExample {
    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(query);
            return rs.next() ? "Login successful" : "Invalid credentials";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}