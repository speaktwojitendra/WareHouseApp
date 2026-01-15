package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome1")
    public String showWelcomePage(Model model) {
        model.addAttribute("username", "Jitendra");
        return "welcome"; // NOT "welcome.jsp"
    }
}