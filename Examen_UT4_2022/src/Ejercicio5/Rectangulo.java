package Ejercicio5;

public class Rectangulo extends Figura {// CREAMOS UNA HERENCIA CON "FIGURA"
										// COMO CLASE PADRE Y "RECTANGULO" COMO
										// CLASE HIJA PARA HEREDAR EL ATRIBUTO
										// COORDENADA ORIGEN

	private int base;
	private int altura;
	Figura f1 = new Figura();// CREAMOS UN OBJETO DE LA CLASE "FIGURA" PARA
								// PODER LLAMAR AL METODO TOSTRING DE ESTA Y ASI
								// CONCATENARLO CON EL TOSTRING DE RECTANGULO
	public Rectangulo() {
	}

	public Rectangulo(Coordenada origen, int base, int altura) {
		super(origen);// UTILIZAMOS LA PALABRA RESERVADA SUPER PARA ACCEDER A
						// 'ORIGEN' DE TIPO "COORDENADA", ATRIBUTO DE LA CLASE
						// PADRE "FIGURA"
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override//SOBREESCRIBIMOS EL METODO TOSTRING DE LA CLASE PADRE
	public String toString() {

		return f1.toString() + "Rectangulo [base=" + base + ", altura=" + altura
				+ ")]";
	}

}
