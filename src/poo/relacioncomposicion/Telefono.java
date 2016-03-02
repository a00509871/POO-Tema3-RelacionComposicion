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
    private static Contacto[] listaTelefonica = new Contacto[100];

    
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
    
    private static int buscaEspacio(){
        int ultimoEspacio=-1;
        boolean auxiliar = true;
        
        for (int i = 0; auxiliar; i++){            
            if (listaTelefonica[i] == null){
                ultimoEspacio = i;
            }            
            auxiliar = i < 100 && listaTelefonica[i] != null;            
        }                
        
        return ultimoEspacio;
    }
            
    static void agregarContacto(String nombre, String telefono, String correo){
        listaTelefonica[buscaEspacio()] = new Contacto(nombre, telefono, correo);        
    }
    
    static void agregarContacto(Contacto cont){
        listaTelefonica[buscaEspacio()] = cont;        
    }
    
    
//    static String mostrarUltimoContacto(){
//        return mostrarContacto(contador-1);
//    }
    
    static String mostrarContacto(int indice){
        String auxiliar = "No existe contacto";
        
        if ((indice < 100) && (indice >= 0) && (listaTelefonica[indice] != null)){
            auxiliar = listaTelefonica[indice].mostrarContacto();
        }
        
        return "En el índice " + indice + ":\n" + auxiliar;
    }
    
}