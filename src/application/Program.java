package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();
		System.out.print("Enter initial deposit (y/n)? ");
		char escolha = sc.next().charAt(0);
		
		Conta conta = new Conta(numero,nome);
		
		if(escolha == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valor = sc.nextDouble();
			conta = new Conta(numero,nome,valor);	
		}
		
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.print("Enter a deposit value: ");
		double quantity = sc.nextDouble();
		conta.deposito(quantity);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.print("Enter a withdraw value:");
		quantity = sc.nextDouble();
		conta.saque(quantity);
		System.out.println("Updated account data:");
		System.out.println(conta);
		sc.close();
	}

}
