package br.com.vendas.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/boasvindas/")
    public String mensagem(){
        return "Bem Vindo a plataforma de vendas";
    }
    
}
