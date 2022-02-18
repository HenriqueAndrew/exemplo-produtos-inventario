package Inventario;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		
		System.out.println("Digite um codigo para o produto: ");
		tempNumber = in.nextInt();
		System.out.println("Digite o nome do produto: ");
		tempName = in.next();
		System.out.println("Digite a quantidade atual do produto: ");
		tempQty = in.nextInt();
		System.out.println("Digite o preço do produto: ");
		tempPrice = in.nextDouble();

		Produto p1 = new Produto(tempNumber, tempName, tempQty, tempPrice);
		
		in.nextLine();
		System.out.println("Digite um codigo para o segundo produto: ");
		tempNumber = in.nextInt();
		System.out.println("Digite o nome do produto: ");
		tempName = in.next();
		System.out.println("Digite a quantidade atual do produto: ");
		tempQty = in.nextInt();
		System.out.println("Digite o preço do produto: ");
		tempPrice = in.nextDouble();
		
		Produto p2 = new Produto(tempNumber, tempName, tempQty, tempPrice);

		Produto p3 = new Produto(3, "Papel A4 pacote de 500 folhas", 20, 24.9);

		Produto p4 = new Produto(4, "Envelope papel branco", 50, 0.2);

		Produto p5 = new Produto();
		p5.setnrItem(5);
		p5.setnmProduto("Grampeador");
		p5.setqtde(5);
		p5.setpreco(21.90);

		Produto p6 = new Produto();
		p6.setnrItem(6);
		p6.setnmProduto("Pasta fichario AZ");
		p6.setqtde(10);
		p6.setpreco(10.70);
		p6.setativo(false);

		System.out.println("\n ---Inventario de materiais de escritorio--- \n\n" + p1 + "\n\n" + p2 + "\n\n" + p3 + "\n\n" + p4
				+ "\n\n" + p5 + "\n\n" + p6);
		in.close();
	}

}
