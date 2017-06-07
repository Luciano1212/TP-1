package punto4;

public class Main {

	public static void main(String[] args) {
		Auto objAuto = new Auto("ford"); // Polimorfismo porque el metodo tiene el mismo nombre 
		Camion objCamion = new Camion("Mercedes Benz "); //Polimorfismo

		System.out.println("Datos Del Auto");
		System.out.println("La marca es  :" + objAuto.marca);
		System.out.println("Nro. asientos es :" + objAuto.asientos);
		System.out.println("El color es :" + objAuto.color + "\n");

		System.out.println("Datos del Camion");
		System.out.println("La marca es : " + objCamion.marca);
		System.out.println("Nro. asientos es : " + objCamion.asientos);
		System.out.println("El color es :" + objCamion.color);
	}

}
