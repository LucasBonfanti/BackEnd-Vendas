package br.com.vendas.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.vendas.api.model.Venda;
import br.com.vendas.api.repository.VendaRepository;
import br.com.vendas.api.service.VendaService;

@RestController
public class Controller {

    @Autowired
    private VendaService vendaService;

    @Autowired
    private VendaRepository acao;

    @PostMapping("/vendas")
    public ResponseEntity<?> criarVenda(@RequestBody Venda obj){
        return vendaService.criarVenda(obj);
    }

    @GetMapping("/vendas")
    public ResponseEntity<?> listarVendas(){
        return vendaService.listarVendas();
    }

    @GetMapping("/vendas/{codigo}")
    public ResponseEntity<?> selecionarVenda(@PathVariable int codigo){
        return vendaService.selecionarVenda(codigo);
    }

    @GetMapping("/vendas/contador")
    public int contadorVendedor(int idDoVendedor){
        return acao.countByIdDoVendedor(idDoVendedor);
    }

    @DeleteMapping("/vendas/{codigo}")
    public ResponseEntity<?> remove(@PathVariable int codigo){
        return vendaService.remover(codigo);
    }

    @GetMapping("/boasvindas")
    public String saudacao(){
        return "Bem Vindo(a) à plataforma de vendas";
    }
    
}
