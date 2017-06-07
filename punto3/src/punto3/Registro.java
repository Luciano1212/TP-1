package punto3;

import java.util.ArrayList;



public class Registro {

	ArrayList<Socios> asistencia;
	int cupo;
	Clase clase;
	int descuento;
	String pago;

	public Registro(int cupo, Clase clase, int descuento) {
		this.cupo = cupo;
		this.clase = clase;
		this.descuento = descuento;
		this.asistencia=new ArrayList<>();
	}
    
	public void AgregarSocio(Socios socio) {
		asistencia.add(socio);
		
		

	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Información de la inscripción\n");
		sb.append("Clase: " + this.clase.Nombre + "\n");
		sb.append("Profesor: " + this.clase.profesor.nombre + "\n");
		sb.append("Horario: " + this.clase.Dia + " - " + this.clase.hora + "\n");
		sb.append("Cupo: " + this.cupo + "\n");
		sb.append("Inscriptos: " + this.asistencia.size() + "\n");

		for (Socios socio : asistencia) {
			sb.append("\tDNI: "+socio.NroDocumento + " - Nombre: " + socio.nombre + "\n");
		}

		return sb.toString();
	}

}
