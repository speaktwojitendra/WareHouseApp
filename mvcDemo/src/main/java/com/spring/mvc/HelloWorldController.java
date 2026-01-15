package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping("/world")
    @ResponseBody
    public String printHelloWrold() {
        return "hello";
    }

    @GetMapping("/demo")
    public ModelAndView demo() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Demo"); // maps to Demo.jsp
        modelAndView.addObject("message", "Hii Jitendra");
        return modelAndView;
    }
    
    @PostMapping("/submitForm")
    public ModelAndView handleForm(@RequestParam("name") String name,
                                   @RequestParam("email") String email) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Result"); // maps to Result.jsp
        mv.addObject("name", name);
        mv.addObject("email", email);
        return mv;
    }
}