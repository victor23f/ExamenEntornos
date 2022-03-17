package Ejercicio2;

/*
Ejerc1_2: hacer que el método getSalario sea polimorfico, tenga un comportamiento diferente segun
el tipo de empleado
*/
public class Empleado {
   static final String INGENIERO = "ingeniero";
   static final String VENDEDOR = "vendedor";
   static final String DIRECTOR = "director";

   private String nombre;
   private String tipoEmpleado;
   private double salarioBase;
   private double productividad;
   private int ventas;
   private double comision;
   private double bonificacion;
   private double dietas;


   public Empleado() {
   }

   public Empleado(String nombre, String tipoEmpleado) {
       this.nombre = nombre;
       this.tipoEmpleado = tipoEmpleado;
   }

   public double getSalario(String tipoEmpleado) {//Añadimos por parametros el tipo de empleado para que se comporte en el switch de una manera u otra
       double salarioBruto = 0;
       switch (tipoEmpleado) {
           case INGENIERO:
               salarioBruto = salarioBase + productividad;
               break;
           case VENDEDOR:
               salarioBruto = salarioBase + ventas * comision;
               break;
           case DIRECTOR:
               salarioBruto = salarioBase + bonificacion + dietas;
               break;
           default:
               throw new RuntimeException("Tipo de empleado incorrecto");
       }

       return salarioBruto;
   }


}

