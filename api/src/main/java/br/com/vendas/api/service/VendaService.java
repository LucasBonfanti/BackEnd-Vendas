package br.com.vendas.api.service;

import java.time.LocalDate;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.vendas.api.model.Mensagem;
import br.com.vendas.api.model.Venda;
import br.com.vendas.api.repository.VendaRepository;

@Service
public class VendaService {

    @Autowired
    private Mensagem mensagem;

    @Autowired
    private VendaRepository acao;

    //CRIAR VENDAS

    public ResponseEntity<?> criarVenda(Venda obj){

            obj.setDataDaVenda(LocalDate.now());

        if(obj.getNomeDoVendedor().equals("")){
            mensagem.setMensagem("O nome precisa ser preenchido");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if(obj.getIdDoVendedor() < 0){
            mensagem.setMensagem("Informe um ID válido");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(acao.save(obj), HttpStatus.CREATED);
        }

    }

    //LISTAR VENDAS

    public ResponseEntity<?> listarVendas(){
        return new ResponseEntity<>(acao.findAll(), HttpStatus.OK);
    }

    //SELECIONAR PELO ID DA VENDA

    public ResponseEntity<?> selecionarVenda(int codigo){
        return new ResponseEntity<>(acao.findByCodigo(codigo), HttpStatus.OK);
    }

    //SELECIONAR PELO ID DO VENDEDOR
    public ResponseEntity<?> selecionarPeloId(int idVendedor){
        if(acao.countByIdDoVendedor(idVendedor) == 0){
            mensagem.setMensagem("Nao foi encontrada nenhuma pessoa");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(acao.findByCodigo(idVendedor), HttpStatus.OK);
        }
    }
    
        //CONTAR VENDAS POR VENDEDOR

        public ResponseEntity<?> vendasPorVendedor(String nomeDoVendedor){
            return new ResponseEntity<>(acao.countByNomeDoVendedor(nomeDoVendedor), HttpStatus.OK);
      
        
        
    }

    //REMOVER VENDA
    public ResponseEntity<?> remover(int codigo){

            Venda obj = acao.findByCodigo(codigo);
            acao.delete(obj);

            mensagem.setMensagem("Venda removida com sucesso!");
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        }
    }
 
    

