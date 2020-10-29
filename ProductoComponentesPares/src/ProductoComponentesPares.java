import java.util.Scanner;		//IMPORTAR SCANNER
public class ProductoComponentesPares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		int n = teclado.nextInt();		//ALMACENAR PRIMER VALOR
		int contador = 1;		//INICIALIZAR CONTADOR
		int total = 1;		//INICIALIZAR TOTAL
		if (n==0) {		//SI N ES 0
			System.out.print("El primer valor es 0, la suma es 0.");		//OUTPUT
		} else {		//SI NO
			while (n!=0) {		//MIENTRAS N NO SEA 0 
				contador++;		//ACTUALIZAR CONTADOR
				n = teclado.nextInt();		//PEDIR VALOR
				if (contador%2==0) {		//SI CONTADOR ES PAR
					total = total * n;		//MULTIPLICAR VALOR POR TOTAL
				}
			}
					//OUTPUT
			System.out.printf("La suma de los valores introducidos en posiciones pares es: %d.",total);
		}
	}
}