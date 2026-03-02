package Mercado;

import java.util.ArrayList;
public class CriadorProdutos {

	private Produtos p1;
    private Produtos p2;
    private Produtos p3;

   
    private ArrayList<Produtos> listaProdutos;

    
    public CriadorProdutos() {
        listaProdutos = new ArrayList<>();

      
        p1 = new Produtos("Banana", 7.00, 29192);
        p2 = new Produtos("Maçã", 5.50, 20221);
        p3 = new Produtos("Arroz", 18.00, 30001);

      
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
    }

    public ArrayList<Produtos> getListaProdutos() {
        return listaProdutos;
    }
}
