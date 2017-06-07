package punto4;

public class Camion extends Vehiculo { //Herencia hija
	// Creamos un constructor
	public Camion(){
	this.marca = "Mercedes Benz";
	this.asientos = 2;
	this.color = "Rojo";
	}
	public Camion(String marca){ //Polimorfismo
		this.marca  = marca;
		this.asientos = 2;
		this.color = "Rojo";
	}
}