package EscrevedoraDeArquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calculadora  {

	int Num1;
	int Num2;
	char operador;

	public double calcula(int Num1, int Num2, char operador) {

		double result = 0;
		this.Num1 = Num1;
		this.Num2 = Num2;
		this.operador = operador;
		
		switch (operador) {
		
			case '+':
				result = Num1 + Num2;
				break;
				
			case '-':
				result = Num1 - Num2;
				break;
				
			case '/':
				result = Num1 / Num2;
				break;
				
			case '*':
				result = Num1 * Num2;
				break;
				
		}
			
			try {
				
				PrintWriter log = new PrintWriter(new FileWriter("log.txt",true), true);
				log.write(this.dados());
				log.close();
			
			}catch(IOException e) {
				
				e.printStackTrace();
				
			}
		
			return result;
	}

	public String dados() {
		
		SimpleDateFormat sdf = new SimpleDateFormat(" dd/MM/yyyy hh:mm:ss");

		return (String.valueOf(Num1) + operador + String.valueOf(Num2) + " - " + sdf.format(new Date()) + " \n");
	
	}
}
