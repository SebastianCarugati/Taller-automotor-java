package domain;


public class Servicios {
	private ServiciosInterface servicio;
	
	public Servicios(ServiciosInterface servicio) {
		
		this.servicio = servicio;
		
	}
	
	public void mostrarServicio() {
		this.servicio.mostrar();
	};
	
	
	

	

}
