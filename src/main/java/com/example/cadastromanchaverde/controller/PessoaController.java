package com.example.cadastromanchaverde.controller;

import com.example.cadastromanchaverde.model.Pessoa;
import com.example.cadastromanchaverde.repository.PessoaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping("/")
    public String inicio() {
        return "redirect:/cadastro";
    }

    @GetMapping("/cadastro")
    public String cadastro(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "cadastro";
    }

    @PostMapping("/salvar")
    public String salvar(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return "redirect:/lista";
    }

    @GetMapping("/lista")
    public String lista(Model model) {
        model.addAttribute("pessoas", pessoaRepository.findAll());
        return "lista";
    }
}
