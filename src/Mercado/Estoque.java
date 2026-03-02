package Mercado;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Produtos> listaProdutos;

	
	public Estoque() {
		
		 listaProdutos = new ArrayList<>();
		
		
	}
	public void adicionarProduto(Produtos produtos) {
        listaProdutos.add(produtos);
   }



	public void listarProdutos() {
        for (Produtos p : listaProdutos) {
            System.out.println(p.getNome() + " custa " + p.getPreco() + "$ e seu código é " + p.getCodigos());
        }
    }





}
 