package ar.unlam.primerParcialProgramacionBasica2Octubre2022EmpresaTransporte;

import ar.unlam.Persona.Acompaniante;
import ar.unlam.Persona.Chofer;

public class Motocicleta extends Vehiculo {
	
	private Acompaniante acompaniante;

	public Motocicleta(Integer kilometrajeRecorrido) {
		super(kilometrajeRecorrido);
	}

	public Motocicleta() {
		
	}

	@Override
	public Boolean asignarChofer(Chofer chofer) {
		if(this.acompaniante == null) {
			this.setChofer(chofer);
			return true;
		}
		return false;
		
	}

	@Override
	public void cambiarChofer(Chofer chofer) {
		// TODO Auto-generated method stub
		
	}

	public void agregarAcompaniante(Acompaniante acompaniante) {
		this.acompaniante = acompaniante;
		
	}

	public Acompaniante getAcompaniante() {
		// TODO Auto-generated method stub
		return this.acompaniante;
	}

	

	

}
