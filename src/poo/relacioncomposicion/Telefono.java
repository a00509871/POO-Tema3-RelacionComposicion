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
    
    /**
     * Método para ayudar a buscar el int del primer espacio disponible en la lista 
     * @return un int con el primer espacio disponible de la lista o -1 si no existe
     */
    private static int buscaEspacio(){
        
        //Int que regresará el último espacio de la lista.
        int ultimoEspacio=-1;
        
        //Un boolean auxiliar que permitirá recorrer la lista
        boolean auxiliar = true;
        
        // 'For' que recorre la lista hasta encontrar un espacio libre en la lista o 
        // hasta que la haya recorrido por completo
        for (int i = 0; auxiliar; i++){            
            // Si encuentra en el lugar i un null, i es el entero buscado
            if (listaTelefonica[i] == null){
                ultimoEspacio = i;
            }                        
            // Se vuelve false si i = 99 (que implicaría que recorrió toda la lista
            // o listaTelefonica[i] es null (que implicaría que ya se encontró el espacio buscado)
            auxiliar = i < 99 && listaTelefonica[i] != null;            
        }                
        
        return ultimoEspacio;
    }
            
    /**
     * Método que agrega un contacto a la lista
     * @param nombre String con nombre del contacto
     * @param telefono String con telefono del contacto
     * @param correo String con correo del contacto
     */
    static void agregarContacto(String nombre, String telefono, String correo){
        listaTelefonica[buscaEspacio()] = new Contacto(nombre, telefono, correo);        
    }
    
    /**
     * Método que agrega un contacto a la lista
     * @param cont Contacto con los datos de la persona a agregar
     */
    static void agregarContacto(Contacto cont){
        listaTelefonica[buscaEspacio()] = cont;        
    }
        
//    static String mostrarUltimoContacto(){
//        return mostrarContacto(contador-1);
//    }
    
    /**
     * Método que regresa un String con los datos del Contacto en el índice solicitado
     * @param indice int del índice que se piensa buscar
     * @return Un string que indica si existe o no un contacto en el índice solicitado.
     */
    static String mostrarContacto(int indice){
        String auxiliar = "No existe contacto";
        
        // Si el índice solicitado es un entero válido y el contacto en el índice indicado
        // no esta vacío, el auxiliar guardará los datos del contacto.
        if ((indice < 100) && (indice >= 0) && (listaTelefonica[indice] != null)){
            auxiliar = listaTelefonica[indice].mostrarContacto();
        }
        
        return "En el índice " + indice + ":\n" + auxiliar;
    }
    
}