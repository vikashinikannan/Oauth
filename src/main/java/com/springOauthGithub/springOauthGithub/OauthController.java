package com.springOauthGithub.springOauthGithub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthController {
    @GetMapping("/")
    public String welcome(){
        return ("WELCOME TO SECUROSPHERE");

    }

}
