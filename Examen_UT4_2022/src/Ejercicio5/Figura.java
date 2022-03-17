package Ejercicio5;
//CREAMOS LA CLASE PADRE "FIGURA" PARA PODER EXTRAER EL ATRIBUTO COMUN 'ORIGEN' DE TIPO "COORDENADA"
public class Figura extends Coordenada {
	private Coordenada origen;

	public Figura() {

	}
	public Figura(Coordenada origen) {
		this.origen = origen;
	}
	@Override
	public String toString() {
		return "Figura [origen=" + origen + " (";
	}
}
