package br.com.vendas.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name="Vendedor", nullable = false)
    private String nomeDoVendedor;

    @Column(name="Data")
    private LocalDate dataDaVenda;

    public Venda(LocalDate dataDaVenda) {
        this.dataDaVenda = LocalDate.now();
    }

    @Column(name="Valor", nullable = false, precision = 5, scale = 2)
    private BigDecimal valor;

    @Column(name="IdVendedor", nullable = false)
    private int idDoVendedor;

    

    
}
