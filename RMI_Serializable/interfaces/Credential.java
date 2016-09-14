/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.Serializable;

/**
 *
 * @author sdist
 */
public class Credential implements Serializable{
    private String nombre;
    private int año;
    private String estado;
    private String password;

    public Credential(String nombre, int año, String estado, String password) {
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    
    
    
}
