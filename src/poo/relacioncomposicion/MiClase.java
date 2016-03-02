/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.relacioncomposicion;

/**
 *
 * @author A00509871
 */
public class MiClase {
    static int contador = 0;
    
    public MiClase(){
        contador = contador + 1;
    }

    public static void main (String[] args){
        new MiClase();
        new MiClase();
        new MiClase();
        
        System.out.println("El número de clases son: " + contador);
    }
}