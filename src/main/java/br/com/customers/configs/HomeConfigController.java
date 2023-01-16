package br.com.customers.configs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home redirection to swagger api documentation
 */
@Controller
public class HomeConfigController {
    @RequestMapping(value = "/")
    public String index() {
        return "redirect:/swagger-ui/";
    }
}
