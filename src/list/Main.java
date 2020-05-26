package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		int x,y,z,media;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		media = (x+y+z)/3;
		System.out.println(media);

		System.out.println("Quantos funcionário você quer registrar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			sc.nextLine();
			System.out.println("Funcionário #" + i + ":");
			System.out.println();
			System.out.println("Digite seu nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Digite seu ID: ");
			int id = sc.nextInt();
			System.out.println();

			System.out.println("Digite seu salário: ");
			double salario = sc.nextDouble();

			Funcionario fun = new Funcionario(id, nome, salario);
		}
	}

}
