/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

import java.util.Calendar;

/**
 *
 * @author User
 */
public class PS3Game extends RentItem{
    private Calendar fechapublicacion;
    
    public PS3Game(int codigo, String nombre){
        super(codigo, nombre, 30);
        fechapublicacion=Calendar.getInstance();
    }
    
    public String toSring(){
        return super.getNombre()+"Fecha de publicacion: "+fechapublicacion+"\n– PS3 Game";
    }
    
    //public void setFechaPublicacion(int year, int mes, int dia){
    //    fechapublicacion= fechapublicacion.set(year, mes, dia);
    //}
    
    
    
}
