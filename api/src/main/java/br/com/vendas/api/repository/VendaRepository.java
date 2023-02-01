package br.com.vendas.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.vendas.api.model.Venda;

public interface VendaRepository extends CrudRepository<Venda, Integer> {

    List<Venda> findAll();

    Venda findByCodigo(int codigo);

    Long countByIdDoVendedor(int idDoVendedor);

    Long countByNomeDoVendedor(String nomeDoVendedor);

    List<Venda> findByIdDoVendedor(int idDoVendedor);

    
}
