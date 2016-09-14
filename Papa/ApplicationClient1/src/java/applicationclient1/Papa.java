package applicationclient1;


import java.io.Serializable;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdist
 */
public class Papa implements Serializable{
    private int id;
    private int tiempo;
    
    public Papa(int id){
        Random i= new Random();
        tiempo= i.nextInt(3);
        this.id=id;
    }
    public int getTiempo(){
        return tiempo;
    }
    public int getId(){
        return id;
    }

    public void setTiempo() {
        this.tiempo=tiempo-1;
    }
    
    
    
}
