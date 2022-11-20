package ar.unlam.primerParcialProgramacionBasica2Octubre2022EmpresaTransporte;

import java.util.LinkedList;

import ar.unlam.Persona.Chofer;
import ar.unlam.Persona.Pasajero;

public class Automovil extends Vehiculo{
	
	private LinkedList<Pasajero> pasajeros = new LinkedList<Pasajero>();

	public Automovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Automovil(Integer kilometrajeRecorrido) {
		super(kilometrajeRecorrido);
		// TODO Auto-generated constructor stub
	}

	public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	@Override
	public Boolean asignarChofer(Chofer chofer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cambiarChofer(Chofer chofer) {
		// TODO Auto-generated method stub
		
	}

	public void agregarPasajeros(Integer cantidadPasajeros) {
		for(int i =0; pasajeros.size() < cantidadPasajeros; i++) {
			pasajeros.add(new Pasajero());
		}
		
	}

}
