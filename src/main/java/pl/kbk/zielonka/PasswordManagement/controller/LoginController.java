package pl.kbk.zielonka.PasswordManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/test")
    public String login() {
        return "frontend/Login_form";
    }
}