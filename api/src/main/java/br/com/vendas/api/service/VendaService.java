package br.com.vendas.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vendas.api.model.Venda;
import br.com.vendas.api.repository.VendaRepository;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public Venda salvar(Venda venda){
        return vendaRepository.save(venda);

    }

    public List<Venda> listaVenda(){
        return vendaRepository.findAll();

    }

    public Optional<Venda> buscarPorId(Long id){
        return vendaRepository.findById(id);

    }

 
    
}
