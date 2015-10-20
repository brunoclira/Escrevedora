package EscrevedoraDeArquivos;

import java.util.Scanner;

public class Main_Escreve {

	public static void main(String args[]){
		
		int Num1;
		int Num2;
		int desejo;
		char operador;
		
		Calculadora calc = new Calculadora();
		
		Scanner input = new Scanner(System.in);
		
		do{
			
			System.out.println("Digite o primeiro valor: ");
				Num1 = input.nextInt();
			
			System.out.println("Operação: ");
			System.out.println("+   |   -   |   *   |   /");
				String op = input.next();
			
			System.out.println("Digite o segundo valor: ");
				Num2 = input.nextInt();
		
				operador = op.charAt(0);
			
				System.out.println("Resultado: " + calc.calcula(Num1,Num2,operador));
				System.out.println("");
				
				System.out.println("Deseja sair? 1-Sim ou 2-Não");
				desejo = input.nextInt();
				System.out.println("");
				
		}while(desejo != 1);
		
				System.out.println("GOOD BYE!");
		
	}
	
}
