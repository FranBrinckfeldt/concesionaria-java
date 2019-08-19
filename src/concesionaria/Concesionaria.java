/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;
import tiposdevehiculos.*;
import ventas.*;

import java.util.*;

import java.util.Collections;
import java.util.Scanner;



import static java.util.Collections.*;

//Integrantes:
//Fernanda Añasco
//Francisca Brinckfeldt
//Paulo Rojas
/**
 *
 * @author Fernanda Añasco,Francisca Brinckfeldt,Paulo Rojas
 */
public class Concesionaria {

    public static void vender (int codigo, HashMap<Integer, Especificaciones_Tecnicas> vehiculos) {
        vehiculos.remove(codigo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Especificaciones_Tecnicas auto123 = new Autos(123, "Auto", "Toyota", "Supra", 1997, 1000000, "PJ 50 20");
        Especificaciones_Tecnicas camioneta456 = new Camionetas(456, "Camioneta", "Ford", "Raptor", 2015, 20000, "RT XD 35");
        Especificaciones_Tecnicas motocicleta789 = new Motocicletas(789, "Motocicleta", "Yamaha", "R3", 2019, 100, "SJ HF 98");
        Especificaciones_Tecnicas auto356 = new Autos(356, "Auto", "Honda", "Civic", 2001, 80000, "DG 63 98");
        Especificaciones_Tecnicas auto237 = new Autos(237, "Auto", "Toyota", "Trueno", 1986, 180000, "ED 20 33");
        Especificaciones_Tecnicas camioneta956 = new Camionetas(956, "Camioneta", "Nissan", "Navara", 2012, 50000, "KD UE 80");
        Especificaciones_Tecnicas auto017 = new Autos(017, "Auto", "Nissan", "Silvia", 1998, 120000, "LM 42 34");
        Especificaciones_Tecnicas motocicleta258 = new Motocicletas(258, "Motocicleta", "Kawasaki", "Ninja ZX-6R ", 2015, 1000, "XR FG 45");
        Especificaciones_Tecnicas camioneta369 = new Camionetas(369, "Camioneta", "Mitsubishi", "L200", 2013, 110000, "LK AC 85");

        HashMap<Integer, Especificaciones_Tecnicas> stockVehiculos = new HashMap<>();

        stockVehiculos.put(auto123.getCodigo_unico(), auto123);
        stockVehiculos.put(camioneta456.getCodigo_unico(), camioneta456);
        stockVehiculos.put(motocicleta789.getCodigo_unico(), motocicleta789);
        stockVehiculos.put(auto356.getCodigo_unico(), auto356);
        stockVehiculos.put(auto237.getCodigo_unico(), auto237);
        stockVehiculos.put(camioneta956.getCodigo_unico(), camioneta956);
        stockVehiculos.put(auto017.getCodigo_unico(), auto017);
        stockVehiculos.put(motocicleta258.getCodigo_unico(), motocicleta258);
        stockVehiculos.put(camioneta369.getCodigo_unico(), camioneta369);

        System.out.println(" ");
        System.out.println("========STOCK VEHÍCULOS========");

        for (Especificaciones_Tecnicas vehiculo : stockVehiculos.values()) {
            System.out.println(" ");
            System.out.println(vehiculo.mostrardatos());
        }

        ArrayList<Registro_Ventas> ventas = new ArrayList<>();

        ventas.add(new Registro_Ventas(auto123, "Feña", "Akatsuki", "19.564.987-2", "05/07/2019", 3000000));
        vender(auto123.getCodigo_unico(),stockVehiculos);
        ventas.add(new Registro_Ventas(camioneta456, "Feña", "Lain", "19.564.987-2", "12/03/2019", 2000000));
        vender(camioneta456.getCodigo_unico(),stockVehiculos);
        ventas.add(new Registro_Ventas(motocicleta789, "Javi", "Tercera", "19.564.987-2", "25/06/2019", 3500000));
        vender(motocicleta789.getCodigo_unico(),stockVehiculos);

        System.out.println(" ");
        System.out.println("========VENTAS========");

        for (Registro_Ventas venta : ventas) {
            System.out.println(" ");
            System.out.println(venta.imprimirDatos());
        }

        System.out.println(" ");
        System.out.println("========STOCK VEHÍCULOS========");

        for (Especificaciones_Tecnicas vehiculo : stockVehiculos.values()) {
            System.out.println(" ");
            System.out.println(vehiculo.mostrardatos());
        }

        ArrayList<Especificaciones_Tecnicas> Orden = new ArrayList<>(stockVehiculos.values());
        Collections.sort(Orden);

        System.out.println(" ");
        System.out.println("========TODOS LOS VEHÍCULOS ORDENADOS POR AÑO========");
        System.out.println(" ");
        for (Especificaciones_Tecnicas ordenados : Orden) {
            System.out.println(ordenados.mostrardatos());
            System.out.println(" ");
        }

        System.out.println("========AUTOS ORDENADOS POR AÑO========");
        System.out.println(" ");
        for (Especificaciones_Tecnicas autosOrdenados : Orden) {
            if (autosOrdenados.getTipo().equals("Auto")) {
                System.out.println(autosOrdenados.mostrardatos());
                System.out.println(" ");
            }
        }

        System.out.println("========CAMIONETAS ORDENADAS POR AÑO========");
        System.out.println(" ");
        for (Especificaciones_Tecnicas camionetasOrdenadas : Orden) {
            if (camionetasOrdenadas.getTipo().equals("Camioneta")) {
                System.out.println(camionetasOrdenadas.mostrardatos());
                System.out.println(" ");
            }
        }

        System.out.println("========MOTOCICLETAS ORDENADAS POR AÑO========");
        System.out.println(" ");
        for (Especificaciones_Tecnicas motocicletasOrdenadas : Orden) {
            if (motocicletasOrdenadas.getTipo().equals("Motocicleta")) {
                System.out.println(motocicletasOrdenadas.mostrardatos());
                System.out.println(" ");
            }
        }

        System.out.println("========BÚSQUEDA POR PATENTE: RT XD 35========");
        System.out.println(" ");

        for (Especificaciones_Tecnicas vehiculo : stockVehiculos.values()) {
            if (vehiculo.getPatente().equals("RT XD 35")) {
                System.out.println(vehiculo.mostrardatos());
                System.out.println(" ");
            }
        }

        for (Registro_Ventas venta : ventas) {
            if (venta.getVehiculo().getPatente().equals("RT XD 35")) {
                System.out.println(venta.getVehiculo().mostrardatos());
                System.out.println(" ");
            }
        }

        System.out.println("========MÉTODO GET Y SET EN EL MONTO DE UNA VENTA========");
        System.out.println(" ");

        try {
            for (Registro_Ventas venta : ventas) {
                if (venta.getMonto_venta() == 3500000) {
                    System.out.println(venta.imprimirDatos());
                    venta.setMonto_venta(4000000);
                    System.out.println(" ");
                    System.out.println(venta.imprimirDatos());
                    System.out.println(" ");
                }
            }
        } catch (Exception e) {
            System.out.println("LOS DATOS NO SON VÁLIDOS");
        }

        System.out.println("========MÉTODO GET Y SET EN EL CÓDIGO DE UN VEHÍCULO EN STOCK========");
        System.out.println(" ");

        try {
            for (Especificaciones_Tecnicas vehiculo : Orden) {
                if (vehiculo.getCodigo_unico() == 258) {
                    System.out.println(vehiculo.mostrardatos());
                    vehiculo.setCodigo_unico(260);
                    System.out.println(" ");
                    System.out.println(vehiculo.mostrardatos());
                    System.out.println(" ");
                }
            }
        } catch (Exception e){
            System.out.println("LOS DATOS NO SON VÁLIDOS");
        }
    }
}


