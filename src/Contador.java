import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		receberParametro();	
		
	}
	
	static void receberParametro() {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			 System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			 receberParametro();
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		  if (parametroUm > parametroDois) {
	            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
	        }
		  else {
	        	int contagem = parametroDois - parametroUm;
	    		//realizar o for para imprimir os números com base na variável contagem
	    		for(int i =1; i<= contagem;i++) {
	    			System.out.println("Imprimindo o numero " +i);
	    		}
	    		
	    		continuarProcesso();
	        }
		
	}
	
	static void continuarProcesso() {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Deseja repetir o processo? \n1 - SIM \n2 - NAO");
		int resposta = terminal.nextInt();
		if(resposta == 1) {
			receberParametro();
		} else if(resposta == 2){
			System.out.println("Até mais!!!");
		} else {
			System.out.println("Resposta inválida");
			continuarProcesso();
		}
	}
}
