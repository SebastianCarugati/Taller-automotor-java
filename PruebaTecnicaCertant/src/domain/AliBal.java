package domain;

public class AliBal implements ServiciosInterface {
	
	private boolean cambioGomas;
	private double precioAlibal;

	public AliBal(boolean cambioGomas1, double precioAlibal1) {
		this.cambioGomas = cambioGomas1;
		this.precioAlibal = precioAlibal1;
	}
	
	public AliBal(double precioAlibal1) {
		this.precioAlibal = precioAlibal1;
	}

	public boolean isCambioGomas() {
		return cambioGomas;
	}

	public void setCambioGomas(boolean cambioGomas) {
		this.cambioGomas = cambioGomas;
	}

	public double getPrecioAlibal() {
		return precioAlibal;
	}

	public void setPrecioAlibal(double precioAlibal) {
		this.precioAlibal = precioAlibal;
		precioAlibal = 2300;
	}

	
	public void mostrar() {
		System.out.println("El precio por alinear y balancear es de: " + precioAlibal);

	}

}
