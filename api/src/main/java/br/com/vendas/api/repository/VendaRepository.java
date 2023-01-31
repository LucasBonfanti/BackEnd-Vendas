package br.com.vendas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vendas.api.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {


    
}
