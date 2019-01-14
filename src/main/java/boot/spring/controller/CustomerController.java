package boot.spring.controller;

import boot.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    @ResponseBody
    public String list(Model model) {
        model.addAttribute("test"  ,customerService.selectAll());
        return "index";
    }

    @RequestMapping("/test")
    public String pages (){
       return "test";
    }
}
