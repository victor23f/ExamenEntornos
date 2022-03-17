package Ejercicio4;

/*
Ejerc1_4: ¿qué podrías refactorizar en este ejercicio? Justifica tu respuesta y refactoriza en caso necesario.
*/
public class Empleado {
	//PODEMOS TAMBIEN DECLARARLOS TODOS EN UNA MISMA LINEA
   private String nombre,direccion,telefono,email;

   public Empleado() {
   }

   public Empleado(String nombre, String direccion, String telefono, String email) {
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public String getDireccion() {
       return direccion;
   }

   public void setDireccion(String direccion) {
       this.direccion = direccion;
   }

   public String getTelefono() {
       return telefono;
   }

   public void setTelefono(String telefono) {
       this.telefono = telefono;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }
}
