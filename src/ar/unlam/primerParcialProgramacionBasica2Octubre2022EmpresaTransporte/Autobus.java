package ar.unlam.primerParcialProgramacionBasica2Octubre2022EmpresaTransporte;

import java.util.LinkedList;

import java.util.Iterator;

import ar.unlam.Persona.Chofer;
import ar.unlam.Persona.Pasajero;

public class Autobus extends Vehiculo{
	
	private LinkedList<Pasajero> pasajeros = new LinkedList<Pasajero>();
	
	

	public Autobus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autobus(Integer kilometrajeRecorrido) {
		super(kilometrajeRecorrido);
		// TODO Auto-generated constructor stub
	}

	

	public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public Boolean asignarChofer(Chofer chofer) {
		Iterator<Pasajero> it = pasajeros.iterator();
		while(it.hasNext()) {
			return false;
		}
		this.setChofer(chofer);
		return true;
	}
	
	

	@Override
	public void cambiarChofer(Chofer chofer) {
		// TODO Auto-generated method stub
		
	}

	public void agregarPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
		
	}

	public void agregarPasajeros(Integer maximoPasajeros) {
		for(int i=0; i < maximoPasajeros; i++) {
			pasajeros.addLast(new Pasajero());
		}
		
	}


}
