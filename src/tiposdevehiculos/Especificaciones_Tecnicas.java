/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdevehiculos;

import java.util.ArrayList;

/**
 *
 * @author Fernanda Añasco,Francisca Brinckfeldt,Paulo Rojas
 */
public class Especificaciones_Tecnicas implements Comparable<Especificaciones_Tecnicas> {

    protected String tipo;
    private String marca;
    private String modelo;
    protected int año;
    private double kilometraje;
    private String patente;
    private int codigo_unico;


    public Especificaciones_Tecnicas(int codigo_unico, String tipo, String marca, String modelo, int año, double kilometraje, String patente) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.patente = patente;
        this.codigo_unico = codigo_unico;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(int codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    public String mostrardatos() {

        return "\nTipo: " + getTipo() +
                "\nMarca: " + getMarca() +
                "\nModelo; " + getModelo() +
                "\nAño: " + getAño() +
                "\nKilometraje: " + getKilometraje() + " Km" +
                "\nPatente: " + getPatente();
    }

    @Override
    public int compareTo(Especificaciones_Tecnicas vehiculo) {
        return (int)(this.año - vehiculo.getAño());
    }


}