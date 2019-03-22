package zp.mydemo.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("name","Levi");
        model.addAttribute("age",182);
        return "index";
    }
}
