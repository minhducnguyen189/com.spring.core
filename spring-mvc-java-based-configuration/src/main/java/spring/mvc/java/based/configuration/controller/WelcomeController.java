package spring.mvc.java.based.configuration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(ModelMap modelMap) {
        modelMap.addAttribute("name", "Duc");
        return "welcome";
    }

}
