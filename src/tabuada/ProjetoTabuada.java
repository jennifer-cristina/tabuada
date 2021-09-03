package tabuada;

import java.util.Scanner;

public class ProjetoTabuada {

	public static void main(String[] args) {
		// Elaborar uma tabuada
		
		Scanner leitor = new Scanner (System.in);
		 
		int multiplicando, multiplicador, produto;
		
		System.out.print("Insira o multiplicando: ");
		multiplicando = leitor.nextInt(); 
		
		System.out.println();
		
		System.out.print("Insira o multiplicador: ");
		multiplicador = leitor.nextInt();
		
		leitor.close();
		
		System.out.println();
		
		System.out.println("TABUADA DO " + multiplicando);
		System.out.println("-----------------------------");
		
		int contador = 0;
		
		while ( contador <= multiplicador) {
			 produto = multiplicando * contador;
			 System.out.println( multiplicando + "x" + contador + "= " + produto );
		
			 contador++;
		}
		
		System.out.println("-------------------------------");
	}
}
