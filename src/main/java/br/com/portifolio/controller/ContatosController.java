package br.com.portifolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosController {

    @GetMapping("/") // Método para exibir a home
    public ModelAndView showHome() {
        ModelAndView mv = new ModelAndView("home/index");
        return mv;
    }
}
