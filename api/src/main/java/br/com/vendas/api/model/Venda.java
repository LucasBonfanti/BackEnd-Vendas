package br.com.vendas.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="Vendedor", nullable = false)
    private String nomeDoVendedor;

    @Column(name="Data", nullable = false)
    private LocalDate dataDaVenda;

    @Column(name="Valor", nullable = false, precision = 5, scale = 2)
    private BigDecimal valor;

    @Column(name="IdVendedor", nullable = false)
    private int idDoVendedor;

    

    
}
