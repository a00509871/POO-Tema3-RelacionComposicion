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
public class POORelacionComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Telefono starTac = new Telefono();
        starTac.EA.presionar();
        System.out.println("Esta Encendido: " + starTac.EA.IO);
        starTac.EA.presionar();
        System.out.println("Esta Encendido: " + starTac.EA.IO);
        starTac.setTeclado();
        
        for(int i = 0; i <= 4; i++){            
            for(int e= 0; e <= 2; e++){
                System.out.println("x: " + e + "; y: " + i);
                System.out.println(starTac.teclado[i][e].getDigito());
            }
        }

    }
}
