package punto4;

public class Auto extends Vehiculo { // Herencia hija
	// Creamos un constructor
	public Auto() {
		this.marca = "Ford";
		this.asientos = 4;
		this.color = "Amarillo";
	}

	public Auto(String marca) { // Polimorfismo
		this.marca = marca;
		this.asientos = 4;
		this.color = "Amarillo";
	}

}