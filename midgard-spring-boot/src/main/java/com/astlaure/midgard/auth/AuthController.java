package com.astlaure.midgard.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginView() {
        return "midgard-templates/auth/login";
    }

    @PostMapping("/login/success")
    public String loginSuccess() {
        return "redirect:/admin";
    }
}
