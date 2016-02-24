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
public class Telefono {
    
    // Atributos
    public BotonApagar EA = new BotonApagar();
    public Tecla[][] teclado = new Tecla[5][3];
    
    public void setTeclado(){
        
        Tecla aux;
        for(int i = 0; i <= 2; i++){
            
            for(int e= 0; e <= 2; e++){
                aux = new Tecla();
                aux.setDigito(Integer.toString((3*i)+(e+1)).charAt(0));
                teclado[i][e] = aux;                                   
            }
        }
        aux = new Tecla();
        aux.setDigito('*');
        teclado[3][0] = aux;
        
        aux = new Tecla();
        aux.setDigito('0');
        teclado[3][1] = aux;
        
        aux = new Tecla();
        aux.setDigito('#');        
        teclado[3][2] = aux;
        
        aux = new Tecla();
        aux.setDigito('C');        
        teclado[4][0] = aux;        
        
        aux = new Tecla();
        aux.setDigito('M');
        teclado[4][1] = aux;
        
        aux = new Tecla();
        aux.setDigito('L');
        teclado[4][2] = aux;                
    }
}