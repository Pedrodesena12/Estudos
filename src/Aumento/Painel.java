package Aumento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Painel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		  List<Funcionarios> lista = new ArrayList<>();
	
		int n = 0;
		
	
			System.out.println("Quantos funcionarios serao adicionados?");
			n = sc.nextInt();
			

		for  (int i = 0; i < n; i++) {
			System.out.println("Funcionario " + (i+1));
			System.out.println("ID:");
			int id = sc.nextInt();
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Salario:");
			Double salario = sc.nextDouble();
			  lista.add(new Funcionarios(id, nome, salario));
		}

		String s;
		int c;
		while (true) {
			
			System.out.println("Deseja fazer o aumento de algum funcionario? (S/N)");
			s = sc.next();
		
			if(s.equalsIgnoreCase("S")) {
				System.out.println("Digite o codigo do funcionario:");
				 c = sc.nextInt();
			
				    Funcionarios encontrado = null;
	                for (Funcionarios f : lista) {
	                    if (f.getId() == c) {
	                        encontrado = f;
	                        System.out.println("Digite a porcentagem de aumento:");
                            double porcentagem = sc.nextDouble();
                            encontrado.aumentoSalario(porcentagem);
                            System.out.println("Novo salario de " + encontrado.getNome() +
                                               ": " + encontrado.getSalario());
	                        break;
	                    }
	                }
	                        if (encontrado == null) {
	                            System.out.println("Funcionario nao encontrado!");
	                       
	                        }

	                    } else if (s.equalsIgnoreCase("N")) {
	                        System.out.println("Encerrando...");
	                        break;
	                    } else {
	                        System.out.println("Opcao invalida! Digite S ou N.");
	                    }
	                    }
				
				
				
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		sc.close();

	}

}
