package punto22;

public class Producto implements Comparable<Producto> {
	String nombre;
	int stock;
	float precio;

	@Override
	public int compareTo(Producto otroProducto) {
		// TODO Auto-generated method stub
		int diff = (int) (this.stock - otroProducto.stock);
		return diff;
	}

	public String toString() {
		String producto = "nombre: " + nombre + " stock: " + stock
				+ " precio: " + precio;

		return producto;

	}

}
