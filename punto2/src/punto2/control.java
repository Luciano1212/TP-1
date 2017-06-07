package punto2;

public class control {
	public static void Show() {
		String resultado = "";
		String letra = "";

		for (int i = 0; i < 12; i++) {
			letra = obtenerLetra(i);
			for (int o = 0; o < 1; o++) {
				resultado = letra + resultado + letra;
			}
		}

		System.out.println(resultado);
	}

	private static String obtenerLetra(int i) {
		String letra = "";
		if (i == 0)
			letra = "a";
		else if (i == 1)
			letra = "b";
		else if (i == 2)
			letra = "c";
		else if (i == 3)
			letra = "d";
		else if (i == 4)
			letra = "e";
		else if (i == 5)
			letra = "f";

		return letra;
	}

	public static void ShowMessage() {
		String resultado = "";
		String letra = "";

		for (int i = 0; i < 3; i++) {

			letra = obtenerLetra(i);

			for (int o = 0; o < 5; o++) {
				resultado = resultado + letra;
			}
		}

		System.out.println(resultado);
	}

	public static void Show1() {

		for (int i = 1; i < 7; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void Show2() {

		for (int i = 7; i < 13; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void Show3() {

		for (int i = 11; i < 21; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void Show4() {
		int serie = 1;
		int anterior = 1;

		System.out.println("a");

		for (int i = 2; i <= 8; i++) {
			serie = anterior + serie;
			anterior = serie - anterior;

			for (int o = 0; o < serie; o++) {
				System.out.print("a");
			}
			
			System.out.println();
		}
	}
}
