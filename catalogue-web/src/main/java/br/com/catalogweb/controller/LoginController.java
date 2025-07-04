package br.com.catalogweb.controller;

import br.com.catalogweb.domain.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String mostrarLogin(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    @GetMapping("/home")
    public String mostrarHome() {
        return "home";
    }

    @PostMapping("/logar")
    public String realizarLogin() {
        return "redirect:/artists";
    }



}
