package domain;

import java.util.Scanner;


public class Turno implements ServiciosInterface {
	private String fecha;
	private String hora;
	private String nombre;
	private String patente;
	private Servicios servicio;

	public Turno(String fecha, String hora, String nombre, String patente) {

		this.fecha = fecha;
		this.hora = hora;
		this.nombre = nombre;
		this.patente = patente;

	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	

	public Servicios getServicio() {
		return servicio;
	}


	

	public Turno() {
		try (Scanner scanner = new Scanner(System.in)) {
			String patronFecha = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d{2})$";
			String patronHora = "^([01][0-9]|2[0-3]):([0-5][0-9])$";
			String patronPatenteVieja = "[A-Z]{3}[0-9]{3}";
			String patronPatenteNueva = "[A-Z]{2}[0-9]{3}[A-Z]{2}";

			do {
				System.out.println("Ingresa la fecha para agandar un turno con el formato DD/MM/YYYY");
				this.fecha = scanner.nextLine();
			} while (!this.fecha.matches(patronFecha));

			do {
				System.out.println("Ingresa la hora");
				this.hora = scanner.nextLine();
			} while (!this.hora.matches(patronHora));

			System.out.println("Ingresa tu nombre");
			this.nombre = scanner.nextLine();

			do {
				System.out.println("Ingresa tu patente");
				this.patente = scanner.nextLine();
			} while (!this.patente.matches(patronPatenteVieja) && !this.patente.matches(patronPatenteNueva));

		}

	}

	public void mostrar() {
		System.out.println("Perfecto " + nombre + ", tenes turno para el dia " + fecha + " a las " + hora
				+ ", para el vehiculo " + patente);
	}

}
