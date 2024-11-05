package br.com.portifolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.portifolio.dao.ContatoDao;
import br.com.portifolio.model.Contatos;

@Controller
public class contatosController {

	@Autowired
	private ContatoDao contatoRepositorio;
	
	@GetMapping("/") // Método para exibir a home
    public ModelAndView showHome() {
        ModelAndView mv = new ModelAndView("home/index"); 
        mv.addObject("contato", new Contatos());
        return mv;
    }

	@PostMapping("/InsertContato") // cria um post
	public ModelAndView showForm(Contatos contato) {
		contatoRepositorio.save(contato);
		ModelAndView mv = new ModelAndView("redirect:/");
		return mv;
	}
}
