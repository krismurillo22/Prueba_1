/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        System.out.println("Menu: "+"\n1. Agregar Item"+"\n2. Ejecutar Sub Menú"+"\n3. Imprimir Todo.");
        int numero=lea.nextInt();
        
        if (numero==1){
            System.out.println("Ingrese tipo: ");
            String tipo=lea.next().toUpperCase();
            if (tipo.equals("MOVIE")){
                
            }
        }
    }
    
}
