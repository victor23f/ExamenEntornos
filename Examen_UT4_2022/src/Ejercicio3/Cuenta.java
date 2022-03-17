package Ejercicio3;

/*
En el método sacarDinero: Cambiar código de error por excepcion 'ExceptionSaldoInsuficiente'
 */
public class Cuenta extends ExcepcionSaldoInsuficiente{//HACEMOS QUE CUENTA HEREDE DE EXCEPCIONSALDOINSUFICIENTE PARA QUE PUEDA ACCEDER A SUS METODOS
    private double saldo;
    ExcepcionSaldoInsuficiente es1 = new ExcepcionSaldoInsuficiente();//CREAMOS OBJETO DE LA CLASE EXCEPCIONSALDOINSUFICIENTE PARA PODER UTILIZAR EL METODO

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public String sacarDinero(double cantidad) {//CAMBIAMOS EL TIPO DEL METODO A STRING PARA QUE PUEDA RETORNAR MENSAJES
        if (cantidad > saldo) return es1.ExcepcionSaldoInsuficiente("Saldo insuficiente");
        else { saldo -= cantidad; return "Sacando dinero"; }
    }
}
