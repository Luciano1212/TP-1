package punto3;

public class Main {

	public static void main(String[] args) {
		Socios pedro = new Socios("Pepito", 0, 49212312, "Diciembre 18",
				"Noviembre 1998", "Alsina", 0);
		Socios jose = new Socios("Josecxito", 0, 41000232, "Diciembre 18",
				"Noviembre 1998", "Alsina", 0);
		Profesor julio = new Profesor("Julio", 9, "Tango");
		Clase papa = new Clase("Enseñansa", "Tango", "Lunes", 1900, julio, 2900);

		Registro r = new Registro(10, papa, 13);
		r.AgregarSocio(pedro);
		r.AgregarSocio(jose);

		System.out.println(r);
		System.out.println("FIN");

	}

}
