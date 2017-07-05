import java.util.*;

public class Main {
	static ArrayList<Integer> lista;
	static int NumeroAIngresar;

	public static void main(String[] args) {

		solicitarNros();
		// ya tengo la lista cargada
		solicitarValorAEvaluar();
		mostrarMasCercano();
	}

	private static void mostrarMasCercano() {
		int valorMasCercano = 0;
		int diferenciaMinima = 9999999;
		int diferenciaActual = 0;

		for (Integer valorActual : lista) {
			diferenciaActual = Math.abs(NumeroAIngresar - valorActual); // mat.abs
																		// es
																		// valor
																		// absoluto
			if (diferenciaActual < diferenciaMinima) {
				valorMasCercano = valorActual;
				diferenciaMinima = diferenciaActual;
			}
			
		}
		System.out.println("el menor es:  "+valorMasCercano );
		
	}

	private static void solicitarValorAEvaluar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba el numero a evaluar: ");
		NumeroAIngresar = teclado.nextInt();

	}

	private static void solicitarNros() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba el primer numero del rango: ");
		lista = new ArrayList<Integer>();

		int CantidadDeNumeros = teclado.nextInt();

		for (int i = 0; i < CantidadDeNumeros; i++) {
			// pido los valores de la lista
			System.out.println("Escriba numero : ");
			lista.add(teclado.nextInt());
		}
	}
}
