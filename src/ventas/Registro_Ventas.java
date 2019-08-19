/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;
import tiposdevehiculos.*;
import concesionaria.*;

import java.util.ArrayList;

/**
 *
 * @author Fernanda Añasco,Francisca Brinckfeldt,Paulo Rojas
 */
public class Registro_Ventas {

    private String nombre;
    private String apellido;
    private String rut;
    private String fecha_transaccion;
    public int vehiculo_vendido;
    private double monto_venta;
    protected Especificaciones_Tecnicas vehiculo;

    
    public Registro_Ventas(Especificaciones_Tecnicas vehiculo, String nombre, String apellido, String rut, String fecha_transaccion, double monto_venta) {
        this.vehiculo = vehiculo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.fecha_transaccion = fecha_transaccion;
        this.monto_venta = monto_venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getFecha_transaccion() {
        return fecha_transaccion;
    }

    public void setFecha_transaccion(String fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }

    public double getMonto_venta() {
        return monto_venta;
    }

    public void setMonto_venta(double monto_venta) {
        this.monto_venta = monto_venta;
    }

    public Especificaciones_Tecnicas getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Especificaciones_Tecnicas vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String imprimirDatos(){
        return "Código Vendido: "+ this.vehiculo.getCodigo_unico()+
                   "\nNombre: " + getNombre()+
                   "\nApellido: " + getApellido()+
                   "\nRut: " + getRut()+
                   "\nFecha Transaccion; " + getFecha_transaccion()+
                   "\nMonto de Venta: " + getMonto_venta();
    }

}

