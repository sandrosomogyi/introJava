package application;

import java.util.Locale;

import java.util.Scanner;

import java.util.List;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import aula10.application.ProgramAula10;
import aula11.application.ProgramAula11;
import aulaXadrez.application.ProgramAulaXadrez;

import entities.Product;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		int x = 1;

		while (x != 0) {

			x = selector(sc);

			switch (x) {

			case 1:
				aula1();
				break;

			case 2:
				aula2(sc);
				break;

			case 3:
				aula3(sc);
				break;

			case 4:
				aula4(sc);

				break;

			case 5:
				aula5(sc);

				break;

			case 6:
				aula6(sc);

				break;

			case 7:
				aula7(sc);

				break;

			case 8:
				aula8(sc);

				break;

			case 9:
				aula9();

				break;
				
			case 10:
				aula10(sc);

				break;
				
			case 11:
				aula11(sc);

				break;
				
			case 12:
				aula12(sc);

				break;

			default:
				x = 0;
			}
		}

		System.out.println("Saindo... ");

		sc.close();
	}

	public static int selector(Scanner sc) {

		System.out.println("");

		System.out.println("Digite o número da aula que deseja executar ou 0 para sair: ");

		int input = sc.nextInt();

		sc.nextLine(); // Consumir a nova linha pendente

		return input;
	}

	public static void aula1() {

		String produto1 = "Computador";
		String produto2 = "Mesa de Escritório";

		int idade = 30;
		int codigo = 5290;
		char genero = 'F';

		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;

		System.out.println("Produtos:");
		System.out.printf("%s, cujo preço é $ %.2f%n", produto1, preco1);
		System.out.printf("%s, cujo preço é $ %.2f%n%n", produto2, preco2);

		System.out.printf("Registro: %d anos de idade, código %d e Gênero: %s%n%n", idade, codigo, genero);

		System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
		System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal americano: %.8f%n", medida);
	}

	public static void aula2(Scanner sc) {

		String x;
		int i;
		double d;
		char c;

		System.out.println("Digite algo:");

		x = sc.next();

		System.out.println("Você digitou: " + x);

		i = sc.nextInt();

		System.out.println("Você digitou: " + i);

		d = sc.nextDouble();

		System.out.println("Você digitou: " + d);

		c = sc.next().charAt(0);

		System.out.println("Você digitou: " + c);

		System.out.println("Digite uma palavra, um número inteiro e um número decimal:");

		x = sc.next();
		i = sc.nextInt();
		d = sc.nextDouble();

		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + i);
		System.out.println("Você digitou: " + d);
	}

	public static void aula3(Scanner sc) {

		String x, y, z;

		System.out.println("Digite algo:");

		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();

		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);
	}

	public static void aula4(Scanner sc) {

		int x;

		System.out.println("Digite algo:");

		x = sc.nextInt();

		System.out.println("Você digitou: " + x);

		x += x;

		System.out.println("Dobro do que digitou é: " + x);
	}

	public static void aula5(Scanner sc) {

		double preco;
		double desconto;

		System.out.println("Digite algo:");

		preco = sc.nextDouble();

		System.out.println("Você digitou: " + preco);

		desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

		System.out.println("Seu desconto é: " + desconto);
	}

	public static void aula6(Scanner sc) {

		String original;

		System.out.println("Digite alguma String:");

		original = sc.next();

		System.out.println("Original : " + original);

		String convertido = original.toUpperCase();

		System.out.println("Maiuscula : " + convertido);

		convertido = original.toLowerCase();

		System.out.println("Minuscula : " + convertido);

		convertido = original.trim();

		System.out.println("Sem espaço nas pontas: " + convertido);

		convertido = original.substring(2);

		System.out.println("Substring inciando em 2 : " + convertido);

		convertido = original.substring(2, 4);

		System.out.println("Substring inciando em 2 e terminando em 4 : " + convertido);

		convertido = original.replaceAll("(?i)a", "1");

		System.out.println("Replace de 'a' ou 'A' por '1' : " + convertido);

		int index = original.indexOf("1");

		System.out.println("Posição da primeira ocorrencia de '1' : " + index);

		index = original.lastIndexOf("1");

		System.out.println("Posição da ultima ocorrencia de '1' : " + index);

		// Operaçao Split

		String testeSplit = "potato apple lemon";

		System.out.println("Função Split frase original : " + testeSplit);

		String[] vect = testeSplit.split(" ");

		System.out.println("Separado pelo split em em array posição 0 : " + vect[0]);

		System.out.println("Separado pelo split em em array posição 1 : " + vect[1]);

		System.out.println("Separado pelo split em em array posição 2 : " + vect[2]);

	}

	public static void aula7(Scanner sc) {

		Locale.setDefault(Locale.US);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		Double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();

		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();

		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);

	}

	public static void aula8(Scanner sc) {

		Locale.setDefault(Locale.US);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		Double price = sc.nextDouble();

		Product product = new Product(name, price);

		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();

		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();

		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);

	}

	public static void aula9() {

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size());
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
			
	}
	
	public static void aula10(Scanner sc) throws ParseException {

		ProgramAula10.executar(sc);
		
	}
	
	public static void aula11(Scanner sc) throws ParseException {

		ProgramAula11.executar(sc);
		
	}
	
	public static void aula12(Scanner sc) throws ParseException {

		ProgramAulaXadrez.executar(sc);
		
	}
}