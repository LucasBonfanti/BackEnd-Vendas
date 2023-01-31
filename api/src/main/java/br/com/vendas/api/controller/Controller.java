package br.com.vendas.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.vendas.api.model.Venda;
import br.com.vendas.api.service.VendaService;

@RestController
@RequestMapping("/vendas")
public class Controller {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Venda salvar(Venda venda){
        return vendaService.salvar(venda);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Venda> listaVendas(){
        return vendaService.listaVenda();
    }


    




    @GetMapping("/boasvindas/")
    public String mensagem(){
        return "Bem Vindo a plataforma de vendas";
    }
    
}
