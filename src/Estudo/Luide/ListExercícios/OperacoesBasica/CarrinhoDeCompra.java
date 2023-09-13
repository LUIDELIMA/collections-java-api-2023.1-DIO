package Estudo.Luide.ListExercícios.OperacoesBasica;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> itemList;
    private String nome;

public CarrinhoDeCompra(){
        this.itemList = new ArrayList<>();

    }

public void adicionarItem( String nome, double preco, int quantidade){
        Item intem = new Item(nome, preco, quantidade);
        this.itemList.add(intem);
    }
    
public void removerItem(String nome) {
        List <Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                  itensParaRemover.add(i);
                }
              }
              itemList.removeAll(itensParaRemover);
            } else {
              System.out.println("A lista está vazia!");
            }
          
         }
 public double calcularValorTotal() {
      double valorTotal = 0d;
      if (!itemList.isEmpty()) {
        for (Item item : itemList) {
         double valorItem = item.getPreco() * item.getQuantidade();
         valorTotal += valorItem; 
      }
      return valorTotal;
     } else {
     throw new RuntimeException("A lista está vazia!");
     }
   }

public void exibirItens() {
    if (!itemList.isEmpty()) {
      System.out.println(this.itemList);
    } else {
      System.out.println("A lista está vazia!");
    }
}


public String toString() {
  return "CarrinhoDeCompra{" +
        "itens=" + itemList +
        '}';
}

public static void main(String[] args) {
    
    CarrinhoDeCompra carrinhoDeCompras = new CarrinhoDeCompra();

    
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

   
    carrinhoDeCompras.exibirItens();
    
    carrinhoDeCompras.removerItem("Lápis");
    
    carrinhoDeCompras.exibirItens();

    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
  }
}
