package domain;


import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List <Turno> turnos;

	public Agenda() {
		
		this.turnos = new ArrayList<>();
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}
	
	public void addTurno(Turno turno) {
		this.turnos.add(turno); 
	}
	
	
	public void mostrar() {
		for(Turno turno: turnos ) {
			turno.mostrar();
		}
	}

}