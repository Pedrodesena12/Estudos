package Equipamentos;

import java.util.Locale;
import java.util.Scanner;

public class Painel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ac = new Scanner(System.in);

		ControleEquipamentos controle = new ControleEquipamentos();

		Equipamentos e1 = new Equipamentos(1, "Notebook");
		Equipamentos e2 = new Equipamentos(2, "Celular");

		controle.adicionarEquipamentos(e1);
		controle.adicionarEquipamentos(e2);

		controle.retirarEquipamentosPorId(1);

	}

}
