package com.thymeleaf.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PessoasController {
    @GetMapping("/home")
    String getPessoas(Model model){
        model.addAttribute("texto","Texto do Controller");
        model.addAttribute("pessoa", Arrays.asList(
                new Pessoa("Thaís",26),
                new Pessoa("Caio",31),
                new Pessoa("Isadora",23),
                new Pessoa("Silmara",26),
                new Pessoa("Susana",36),
                new Pessoa("JVC",20)));
        return "pessoas";
    }
}
