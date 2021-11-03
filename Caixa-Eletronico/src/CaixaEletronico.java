import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> notas = new ArrayList<>();
		
		System.out.println("Digite o valor que você deseja sacar");
		int valor_0067 = input.nextInt();
		
		
		int nota100_0067 = 100;
		int nota50_0067 = 50;
		int nota10_0067 = 10;
		int nota20_0067 = 20;
		int nota5_0067 = 5;
		int soma = 0;
		int saldo = 1000;
		
		
		int value = valor_0067;
		
		
		Calendar c =  Calendar.getInstance();
	
		if(nota100_0067 >= nota100_0067) {
			nota100_0067 = valor_0067 / 100; 
			valor_0067 = valor_0067 % 100;   
			if (nota100_0067 != 0) {
				notas.add(nota100_0067 + " notas de R$ 100,00"); 
		//		System.out.println(nota100_0067 + " notas de R$ 100,00");
			    soma =+ soma + 100;
			    saldo =- saldo + 100; 
			}
		} 
		
		if(nota50_0067 >= nota50_0067) {
			nota50_0067 = valor_0067 / 50;
			valor_0067 = valor_0067 % 50;
			if (nota50_0067 != 0) {
				notas.add(nota50_0067 + " notas de R$ 50,00");
		//		System.out.println(nota50_0067 + " notas de R$ 50,00");
	       		soma =+ soma + 50;
	       		saldo =- saldo + 50;
			}
		}
		
		if(nota20_0067 >= nota20_0067) {
			nota20_0067 = valor_0067 / 20;
			valor_0067 = valor_0067 % 20;
			if (nota20_0067 != 0) {
				notas.add(nota20_0067 + " notas de R$ 20,00");
		//		System.out.println(nota20_0067 + " notas de R$ 20,00");
			    soma =+ soma + 20;
			    saldo =- saldo + 20;
			}
		}
		
		if(nota10_0067 >= nota10_0067) {
			nota10_0067 = valor_0067 / 10;
			valor_0067 = valor_0067 % 10;
			if (nota10_0067 != 0) {
				notas.add(nota10_0067 + " notas de R$ 10,00");
	//			System.out.println(nota10_0067 + " notas de R$ 10,00");
			    soma =+ soma + 10;
			    saldo =- saldo + 10;
			}
		}
		
		if(nota5_0067 >= nota5_0067) {
			nota5_0067 = valor_0067 / 5;
			valor_0067 = valor_0067 % 5;
			if (nota5_0067 != 0) {
				notas.add(nota5_0067 + " notas de R$ 5,00");
//				System.out.println(nota5_0067 + " notas de R$ 5,00"); 
		     	soma =+ soma + 5;
		     	saldo =- saldo + 5;
			}
		}
	
		if (soma > value)  throw new RuntimeException("Valor inválido não será realizado o saque, procure o gerente"); 

		    System.out.println("Data e Hora atual : "+ c.getTime());
			System.out.println(notas);
			
	}
}

