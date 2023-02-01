// public package br.com.vendas.api.test;

// import org.springframework.boot.web.client.RestTemplateBuilder;
// import org.springframework.web.client.RestTemplate;

// import br.com.vendas.api.model.Venda;

// public class VendedorTest {
//     public static int main(String[] args) {
//         RestTemplate restTemplate = new RestTemplateBuilder().rootUri("https://localhost:8080/vendas").build();

//         Venda[] vendas = restTemplate.getForObject("/", Venda[].class);
        
//         int contadorVendas = 0;


//     if(vendas!=null) {
//         for(int i=0; i<vendas.length; i++) {
//              if(vendas[i]!=null) {
//                  if(vendas[i].getIdDoVendedor().equal()) {
//                       contadorVendas++;
//                  }
//              }
//         }
//     } else {
//             System.out.println("id não existe");
//     }
//     return contadorVendas;
// }

//     } {
    
// }
