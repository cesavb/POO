/*
Aluno: Cesar Augusto Vieira Baganha
Matricula: 0050012741
*/

import java.util.Scanner ;

public class CesarAugustoTabuada {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tb=10, num;
		
		System.out.printf("Tabuada de Adição. Entre com o numero:");
		num = input.nextInt();
		
		for(int i=0; i<=tb; i++) {
			
			System.out.println(num + ("+") + i + ("=") + (num+i));
		
		}
	
	}

}
