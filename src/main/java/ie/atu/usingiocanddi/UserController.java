package ie.atu.usingiocanddi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService us;
    public UserController() { us = new UserService();}
    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email) {
        us.registerUser(name, email);
        return "Without IoC";
    }
}
