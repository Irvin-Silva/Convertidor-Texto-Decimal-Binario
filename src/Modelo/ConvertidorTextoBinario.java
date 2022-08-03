/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class ConvertidorTextoBinario
{
    //Atributos
    
    private String x;
    private String p;
    //Metodos
    public void setX(String px)
    {
        this.x=px;
    }
    
    
   
    public void Tbinario()
    {
        
        p = "";
        for(char letra : x.toCharArray())
        {
            p += String.format("%16s", Integer.toBinaryString(letra));  
          
            /*
            coloqué %016d para que rellene con ceros hasta completar los 16 bits de los char que contienen los unicode. 
            Si pusiera %08d rellenaría con 0 hasta completar 8 bit y se escribirian espacios  
           */
        }
    }
    
    public String getP()
    {
        return p.replace("\u0020","\u0030");
    }
}
