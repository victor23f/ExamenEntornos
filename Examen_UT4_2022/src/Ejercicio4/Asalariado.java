package Ejercicio4;

/*
Ejerc1_4: ¿qué podrías refactorizar en este ejercicio? Justifica tu respuesta y refactoriza en caso necesario.
*/
public class Asalariado extends Empleado{
   //ELIMINAMOS TODOS LOS ATRIBUTOS DE LA CLASE "ASALARIADO" YA QUE PODEMOS HEREDARLOS DE SU CLASE PADRE "EMPLEADO"

   public Asalariado() {
   }

   public Asalariado(String nombre, String direccion, String telefono, String email) {
      super(nombre, direccion, telefono, email);
   }
   
}

