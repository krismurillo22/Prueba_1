/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Movie extends RentItem{
    private String estado;
    Scanner lea= new Scanner(System.in);
    
    public Movie(int codigo, String nombre, double precio){
        super(codigo, nombre, precio);
        estado="ESTRENO";
    }
    
    public void setEstado(String estado){
        this.estado=estado;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public String toString(){
        return super.toString()+"\nEstado: "+estado+"\n – Movie";
    }
    
    public double pagoRenta(int dias){
        if (estado.equals("ESTRENO") && dias>2){
            return precioRenta+(dias-2)*50;
        }else if (!estado.equals("ESTRENO") && dias>5){
            return precioRenta+(dias-5)*30;
        }else{
            return precioRenta;
        }
    }
    
    public String Submenu(){
        return super.Submenu()+"\n2-Cambiar Estado";
    }
    
    public void ejecutarOpcion(int opcion){
        if (opcion==1){
            toString();
        }else if (opcion==2){
            System.out.println("Ingrese el estado actualizado: ");
            String nuevoEstado= lea.next().toUpperCase();
            setEstado(nuevoEstado);
        }else{
            System.out.println("Opcion No Valida");
        }
    }
    
    
    
}
