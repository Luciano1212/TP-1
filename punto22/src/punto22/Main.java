package punto22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	private static final int CantidadDeNumeros = 0;
	static ArrayList<Producto> lista;

	public static void main(String[] args) {
		IngresarProductos();
	}

	private static void IngresarProductos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba Los Productos: ");
		lista = new ArrayList<Producto>();

		for (int i = 0; i < 5; i++) {
			System.out.println("stock:");
			int stock = teclado.nextInt();
			System.out.println("nombre: ");
			String nombre = teclado.next();
		    System.out.println("precio");
			float precio = teclado.nextFloat();
			Producto p = new Producto();
			p.nombre = nombre;
			p.precio = precio;
			p.stock = stock;
			lista.add(p);
		}
		
		Collections.sort(lista);
		
		for (Producto producto : lista) {
			System.out.println(producto);
			
		}
	}
}
