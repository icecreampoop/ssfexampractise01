package pck.selfprac1.exampractise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LandingPage {

    @GetMapping("/getcart")
    public String getCartDirectionHandler(Model model) {
        return "GetCart";
    }

    @GetMapping("/postcart")
    public String postCartDirectionHandler(Model model) {
        return "PostCart";
    }
}
