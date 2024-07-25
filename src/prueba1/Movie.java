/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author User
 */
public class Movie extends RentItem{
    private String estado;
    
    public Movie(int codigo, String nombre, double precio){
        super(codigo, nombre, precio);
        estado="ESTRENO";
    }
    
}
