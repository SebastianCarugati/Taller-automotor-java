package domain;

public class Service implements ServiciosInterface {
	
	private String serviceBasico;
	private String serviceAltoRendimiento;
	private String tipoServicio;
	private double precioService;
	
	public Service(String serviceBasico1 , String serviceAltoRendimiento1, String tipoServicio1, double precioService1) {
		
		this.serviceBasico = serviceBasico1;
		this.serviceAltoRendimiento = serviceAltoRendimiento1;
		this.precioService = precioService1;
		this.tipoServicio = tipoServicio1;
	}
	
	
	public Service (String tipoServicio1, double precioService1) {
		this.tipoServicio = tipoServicio1;
		this.precioService = precioService1;
	}
	
	

	public String getTipoServicio() {
		return tipoServicio;
	}


	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
		this.serviceBasico = tipoServicio;
		this.serviceAltoRendimiento = tipoServicio;
	}




	public String getServiceBasico() {
		return serviceBasico;
	}

	public void setServiceBasico(String serviceBasico) {
		this.serviceBasico = serviceBasico;
		this.precioService = 3000;
	}

	public String getServiceAltoRendimiento() {
		return serviceAltoRendimiento;
	}

	public void setServiceAltoRendimiento(String serviceAltoRendimiento) {
		this.serviceAltoRendimiento = serviceAltoRendimiento;
		this.precioService = 6000;
	}
	
	
	public double getPrecioService() {
		return precioService;
	}

	public void setPrecioService(double precioService) {
		this.precioService = precioService;
	}

	
	
	public void mostrar() {
		System.out.println("El servicio: " + tipoServicio + " tiene un precio de: "+ precioService);
	
	}



}
