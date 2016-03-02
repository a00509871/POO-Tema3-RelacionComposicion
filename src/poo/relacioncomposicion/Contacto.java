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
public class Contacto {
        
    private String nombre;
    private String telefono;
    private String correo;
    
    public Contacto(String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public String mostrarContacto(){
        String auxiliar = "No existe contacto";
        if (nombre != null){
            auxiliar = nombre + "\n" + telefono + "\n" + correo;
        }
        return auxiliar;
    }

}
