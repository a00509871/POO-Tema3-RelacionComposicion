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
public class Tecla {
    
    //Tecla
    private char digito;
    private char[] letras = new char[3];
    
    public void setDigito(char d){
        this.digito = d;
    }
    
    public char getDigito(){
        return this.digito;
    }
    
    public void setLetras(char l1, char l2, char l3){        
        letras[0] = l1;
        letras[1] = l2;
        letras[2] = l3;
    }
    
}
