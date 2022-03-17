package Ejercicio5;

public class Circulo extends Figura {// CREAMOS UNA HERENCIA CON "FIGURA" COMO
										// CLASE PADRE Y "CIRCULO" COMO CLASE
										// HIJA PARA HEREDAR EL ATRIBUTO
										// COORDENADA ORIGEN

	private float radio;
	Figura f1 = new Figura();

	public Circulo() {
	}

	public Circulo(Coordenada origen, float radio) {
		super(origen);// UTILIZAMOS LA PALABRA RESERVADA SUPER PARA ACCEDER A
						// 'ORIGEN' DE TIPO "COORDENADA", ATRIBUTO DE LA CLASE
						// PADRE "FIGURA"
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override//SOBREESCRIBIMOS EL METODO TOSTRING DE LA CLASE PADRE
	public String toString() {
		return f1.toString() + "Circulo [radio=" + radio + ")]";
	}

}
