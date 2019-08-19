/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdevehiculos;

/**
 *
 * @author Fernanda Añasco,Francisca Brinckfeldt,Paulo Rojas
 */
public class Camionetas extends Especificaciones_Tecnicas {
    
     public Camionetas (int codigo_unico, String tipo, String marca, String modelo, int año, double kilometraje, String patente){
        super (codigo_unico, tipo, marca, modelo, año, kilometraje, patente);
    }

    @Override
    public String mostrardatos(){
        return "Código Único: " + getCodigo_unico()+
                   "\nTipo: " + getTipo()+
                   "\nMarca: " + getMarca()+
                   "\nModelo; " + getModelo()+
                   "\nAño: " + getAño()+
                   "\nKilometraje: " + getKilometraje()+ " Km"+
                   "\nPatente: " + getPatente();
    }
}
