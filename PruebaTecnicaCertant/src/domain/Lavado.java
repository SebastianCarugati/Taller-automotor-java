package domain;

public class Lavado implements ServiciosInterface {
	
		private String lavadoBasico;
		private String lavadoCompleto;
		private String lavadoPremium;
		private String tipoLavado;
		private double precioLavado;
		
		
		public Lavado(String lavadoBasico1, String lavadoCompleto1, String lavadoPremium1, String tipoLavado, double precioLavado1) {
			this.lavadoBasico = lavadoBasico1;
			this.lavadoCompleto = lavadoCompleto1;
			this.lavadoPremium = lavadoPremium1;
			this.tipoLavado = tipoLavado;
			this.precioLavado = precioLavado1;
			
		}
		
		
		
		public String getTipoLavado() {
			return tipoLavado;
		}



		public void setTipoLavado(String tipoLavado) {
			this.tipoLavado = tipoLavado;
			this.lavadoBasico = tipoLavado;
			this.lavadoCompleto = tipoLavado;
			this.lavadoPremium = tipoLavado;
		}



		public Lavado (String tipoLavado, double precioLavado) {
			this.tipoLavado = tipoLavado;
			this.precioLavado = precioLavado;
		    
		}


		public String getLavadoBasico() {
			return lavadoBasico;
		}


		public void setLavadoBasico(String lavadoBasico) {
			this.lavadoBasico = lavadoBasico;
			
		}


		public String getLavadoCompleto() {
			return lavadoCompleto;
		}


		public void setLavadoCompleto(String lavadoCompleto) {
			this.lavadoCompleto = lavadoCompleto;
		}


		public String getLavadoPremium() {
			return lavadoPremium;
		}


		public void setLavadoPremium(String lavadoPremium) {
			this.lavadoPremium = lavadoPremium;
		}
		
		

		public double getPrecioLavado() {
			return precioLavado;
		}


		public void setPrecioLavado(double precioLavado) {
			this.precioLavado = precioLavado;
		}


		
		
		public void mostrar() {
			System.out.println("El precio del lavado " + tipoLavado + " es de: " + precioLavado);
		}
			

}
