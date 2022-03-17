package Ejercicio1;

/*
Ejerc1_1: Extraer los datos relacionados con el telefono en otra clase llamada Telefono
 */
public class Cliente extends Telefono{
    private String nombre;
    Cliente c1 = new Cliente();

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
