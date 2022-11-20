package ar.unlam.primerParcialProgramacionBasica2Octubre2022EmpresaTransporte;

import org.junit.Assert;
import org.junit.Test;

import ar.unlam.Persona.Acompaniante;
import ar.unlam.Persona.Chofer;
import ar.unlam.Persona.Pasajero;
import ar.unlam.Persona.Persona;

public class testEmpresaDeTransporte {
	
@Test
public void cuandoCreoUnaMotocicletaQueConoceSuKilometraje() {
	Integer kilometraje = 200;
	Motocicleta motocicleta = dadoQueTengoUnaMotocicletaQueConoceSuKilometraje(kilometraje);
	Integer valorObtenido = cuandoConsultoSuKilometraje(motocicleta);
	entoncesSuKilometrajeEs(motocicleta, valorObtenido);
}

@Test
public void cuandoLeQuieroAsignarUnChoferALaMotocicleta() {
	Motocicleta motocicleta= dadoQueTengoUnaMotocicleta();
	Chofer chofer = dadoQueTengoUnChoferConNombre("Leandro");
	cuandoLeAsignoUnChofer(motocicleta, chofer);
	entoncesLaMotocicletaTieneChofer(motocicleta, chofer);
}

@Test
public void cuandoLeQuieroAgregarUnAcompanianteALaMotocicleta() {
	Motocicleta motocicleta= dadoQueTengoUnaMotocicleta();
	Chofer chofer = dadoQueTengoUnChoferConNombre("Leandro");
	Acompaniante acompaniante = new Acompaniante("Camila");
	cuandoLeAsignoUnChofer(motocicleta, chofer);
	cuandoLeAsignoUnAcompaniante(motocicleta, acompaniante);
	entoncesLaMotocicletaTieneAcompaniante(motocicleta, acompaniante);
}

@Test
public void queElAutobusNoPuedaCambiarDeChoferSiHubieraPasajeros() {
	Autobus autobus = dadoQueTengoUnAutobus();
	Chofer choferEsperado = new Chofer("Leandro");
	Chofer chofer2 = new Chofer("Ramon");
	Pasajero pasajero = new Pasajero();
	cuandoLeAsignoUnChofer(autobus,choferEsperado);
	cuandoLeAsignoPasajeros(autobus, pasajero);
	cuandoQuieroCambiarElChofer(autobus, chofer2);
	entoncesElAutobusNoCambioDeChofer(autobus, choferEsperado);
	
}

@Test
public void queLaMotocicletaNoPuedaCambiarDeChoferSiTieneAcompaniante() {
	Motocicleta motocicleta= dadoQueTengoUnaMotocicleta();
	Chofer choferEsperado = dadoQueTengoUnChoferConNombre("Leandro");
	Chofer chofer2 = dadoQueTengoUnChoferConNombre("Emilio");
	Acompaniante acompaniante = new Acompaniante("Camila");
	cuandoLeAsignoUnChofer(motocicleta, choferEsperado);
	cuandoLeAsignoUnAcompaniante(motocicleta, acompaniante);
	cuandoLeAsignoUnNuevoChofer(motocicleta, chofer2);
	entoncesLaMotocicletaNoCambioDeChofer(motocicleta, choferEsperado);
}
@Test
public void queCreoUnAutomovilConChoferYMaximoTresPasajeros() {
	Automovil auto =dadoQueTengoUnAutomovil();
	Chofer choferEsperado = dadoQueTengoUnChoferConNombre("Leandro");
	Integer valorEsperado=3;
	cuandoLeAsignoUnChofer(auto, choferEsperado);
	cuandoLeAsignoMaximoTresPasajeros(auto,valorEsperado);
	entoncesElAutoTieneTresPasajeros(auto,valorEsperado);
}

@Test
public void queCreoUnAutobusConChoferYMaximoVeintePasajeros() {
	Autobus autobus = dadoQueTengoUnAutobus();
	Chofer choferEsperado = dadoQueTengoUnChoferConNombre("Leandro");
	Integer maximoPasajeros = 20;
	cuandoLeAsignoUnChofer(autobus,choferEsperado);
	cuandoLeAsignoVeintePasajeros(autobus,maximoPasajeros);
	entoncesTieneVeintePasajeros(autobus, maximoPasajeros);
}

private void entoncesTieneVeintePasajeros(Autobus autobus, Integer maximoPasajeros) {
	Assert.assertTrue(autobus.getPasajeros().size() == maximoPasajeros);
	
}

private void cuandoLeAsignoVeintePasajeros(Autobus autobus, Integer maximoPasajeros) {
	autobus.agregarPasajeros(maximoPasajeros);
	
}

private void entoncesElAutoTieneTresPasajeros(Automovil auto, Integer valorEsperado) {
	
	Assert.assertTrue(auto.getPasajeros().size()== valorEsperado);
	
}

private void cuandoLeAsignoMaximoTresPasajeros(Automovil auto, Integer cantidadPasajeros) {
	auto.agregarPasajeros(cantidadPasajeros);
	
}

private Automovil dadoQueTengoUnAutomovil() {
	return new Automovil();
	
}

private void entoncesLaMotocicletaNoCambioDeChofer(Vehiculo motocicleta, Persona choferEsperado) {
	Assert.assertEquals(choferEsperado.getNombre(), motocicleta.getChofer().getNombre());
	
}

private void cuandoLeAsignoUnNuevoChofer(Motocicleta motocicleta, Chofer chofer2) {
	motocicleta.asignarChofer(chofer2);
	
}

private void entoncesElAutobusNoCambioDeChofer(Autobus autobus, Chofer choferEsperado) {
	Assert.assertEquals(choferEsperado.getNombre(), autobus.getChofer().getNombre());
	
}

private void cuandoQuieroCambiarElChofer(Autobus autobus, Chofer chofer2) {
	autobus.asignarChofer(chofer2);
	
}

private void cuandoLeAsignoUnChofer(Vehiculo vehiculo, Persona chofer) {
	vehiculo.asignarChofer((Chofer) chofer);
	
}

private void cuandoLeAsignoPasajeros(Autobus autobus, Pasajero pasajero) {
	
	autobus.agregarPasajero(pasajero);
	
}

private Autobus dadoQueTengoUnAutobus() {
	return new Autobus();
	
}

private void entoncesLaMotocicletaTieneAcompaniante(Motocicleta motocicleta, Acompaniante acompaniante) {
	Assert.assertEquals(acompaniante, motocicleta.getAcompaniante());
	
}

private void cuandoLeAsignoUnAcompaniante(Motocicleta motocicleta, Acompaniante acompaniante) {
	motocicleta.agregarAcompaniante(acompaniante);
	
}

private void entoncesLaMotocicletaTieneChofer(Motocicleta motocicleta, Chofer chofer) {
	Assert.assertEquals(chofer, motocicleta.getChofer());
	
}

private Chofer dadoQueTengoUnChoferConNombre(String nombre) {
	// TODO Auto-generated method stub
	return new Chofer(nombre);
}

private void cuandoLeAsignoUnChofer(Vehiculo motocicleta, Chofer chofer) {
	motocicleta.asignarChofer(chofer);
	
}

private Motocicleta dadoQueTengoUnaMotocicleta() {
	// TODO Auto-generated method stub
	return new Motocicleta();
}

private void entoncesSuKilometrajeEs(Motocicleta motocicleta, Integer valorObtenido) {
	Assert.assertEquals(new Integer(200), valorObtenido);
	
}

private Integer cuandoConsultoSuKilometraje(Motocicleta motocicleta) {
	return motocicleta.getKilometrajeRecorrido();
	
}

private Motocicleta dadoQueTengoUnaMotocicletaQueConoceSuKilometraje(Integer kilometraje) {
	
	return new Motocicleta (kilometraje);
}



}
