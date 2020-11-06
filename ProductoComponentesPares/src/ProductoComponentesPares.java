import java.util.Scanner;		//IMPORTAR SCANNER
public class ProductoComponentesPares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		System.out.print("Introduzca el primer valor: ");
		int n = teclado.nextInt();		//ALMACENAR PRIMER VALOR
		int contador = 1;		//INICIALIZAR CONTADOR
		int total = 1;		//INICIALIZAR TOTAL

		while (n!=0) {		//MIENTRAS N NO SEA 0 
			if (contador%2==0) {		//SI CONTADOR ES PAR
				total = total * n;		//MULTIPLICAR VALOR POR TOTAL
			}
			
			n = teclado.nextInt();		//PEDIR VALOR
			contador++;		//ACTUALIZAR CONTADOR
		}
		//OUTPUT
		System.out.printf("La suma de los valores introducidos en posiciones pares es: %d.",total);
	}
}
