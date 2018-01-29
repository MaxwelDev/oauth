package oauth.edu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Recepting {

    @GetMapping("/login/espnwatch")
    public void receive(@RequestParam String state) {
        System.err.println(state);
    }

}
