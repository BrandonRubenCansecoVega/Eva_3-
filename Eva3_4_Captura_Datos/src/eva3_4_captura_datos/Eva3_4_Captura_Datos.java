/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author rubra
 */
public class Eva3_4_Captura_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuantos nombres vas a capturar?");
        cant = captu.nextInt();
        String[] ListaNombres = new String[cant];
        captu.nextLine();
        //HAY QUE PREGUNTAR CADA NOMBRE
        for(int i = 0; i < ListaNombres.length; i++){
            System.out.println("Nombre #" + (i + 1) + ": ");
            ListaNombres[i] = captu.nextLine();
        }
        for(int i = 0; i < ListaNombres.length; i++){
            System.out.println(ListaNombres[i]);
        }        
    }
    
}
