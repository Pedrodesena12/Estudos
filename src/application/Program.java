package application;

import java.util.Locale;
import java.util.Scanner;

import entitiess.Account;
import entitiess.BusinessAccunt;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account acc = new Account(1001, "Esther", 0.0);
		BusinessAccunt bacc = new BusinessAccunt(1002, "Pedro", 0.0, 500.0);

	}

}
