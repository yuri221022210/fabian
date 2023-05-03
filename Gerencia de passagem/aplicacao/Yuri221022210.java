package aplicacao;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		Itinerario itine = new Itinerario();
		int esc1;
		
		
		System.out.println("------------------------Gerencia de Passagem------------------------");
		System.out.println("--------------------------------menu--------------------------------");
		System.out.println("1- Empresa");
		System.out.println("2- Para usuarios");
		System.out.println("--------------------------Selecione a Opcao-------------------------");
		
		esc1 = ler.nextInt(); 
		
		if (esc1 != 1 && esc1 !=2){
			
		}
		else {
			if(esc1== 1) {
				System.out.println("--------------------------O que deseja fazer ?--------------------------");
				System.out.println("1 - Cadastrar Itinerario");
				int esc2;
				esc2 = ler.nextInt();
				if (esc2 == 1)
				{
					System.out.println("--------Digite o dia da semana que o onibus ira passsar---------------\n");
			        itine.setDiaSemana(ler.next());
			        System.out.println("-----------------Digite a hora que o onibus ira passsar---------------\n");
			        itine.setHora1(ler.nextInt());
			        System.out.println("----------------Digite o minuto que o onibus ira passsar--------------\n");
			        itine.setMinuto(ler.nextInt());
			        System.out.println("--------------Digite a cidade  que o onibus ira passsar---------------\n");
			        itine.setNomeLugar1(ler.next());
			        System.out.println("------Digite um ponto de referencia onde o onibus ira passsar---------\n");
			        itine.setPontoReferencia1(ler.next());
			        System.out.println(itine.toString());
			        
					
				}
			
			}
		}
	
	}

}
