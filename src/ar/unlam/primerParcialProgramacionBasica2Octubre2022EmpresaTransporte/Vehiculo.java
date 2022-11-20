package ar.unlam.primerParcialProgramacionBasica2Octubre2022EmpresaTransporte;

import ar.unlam.Persona.Chofer;

public abstract class Vehiculo {

	private Integer kilometrajeRecorrido;
	private Chofer chofer;

	public Vehiculo(Integer kilometrajeRecorrido) {
		super();
		this.kilometrajeRecorrido = kilometrajeRecorrido;
	}
	public Vehiculo() {
		
	}

	public Chofer getChofer() {
		return chofer;
	}
	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	public Integer getKilometrajeRecorrido() {
		return kilometrajeRecorrido;
	}

	public void setKilometrajeRecorrido(Integer kilometrajeRecorrido) {
		this.kilometrajeRecorrido = kilometrajeRecorrido;
	}
	
	public abstract Boolean asignarChofer(Chofer chofer);
	
	public abstract void cambiarChofer(Chofer chofer);
	
	
}
