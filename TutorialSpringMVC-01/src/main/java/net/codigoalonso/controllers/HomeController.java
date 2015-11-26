package net.codigoalonso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author codigoalonso.net
 */

@Controller
public class HomeController {
    
    @RequestMapping(value="/", method =RequestMethod.GET)
    public String home() {
        return "home";
    }
}
