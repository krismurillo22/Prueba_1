/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author User
 */
public class RentItem {
    private int codigo;
    private String nombre;
    private double precioRenta;
    private int cantidadCopias;
    
    public RentItem(int codigo, String nombre, double precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precioRenta=precio;
        cantidadCopias=0;
    }
    
    public String toString(){
        return "Codigo del Item: "+codigo+"\nNombre del Item: "+nombre+"\nPrecio del Item: "+precioRenta;
    }

    public double pagoRenta(int dias){
        return 0;
    } 
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecioRenta(){
        return precioRenta;
    }
    
    public int getCantidadCopias(){
        return cantidadCopias;
    }
    
    public String Submenu(){
        return "1-Imprimir";
    }
    
    public void ejecutarOpcion(int opcion){
        if (opcion==1){
            toString();
        }else{
            System.out.println("Opcion No Valida");
        }
    }
    
    
    
}
