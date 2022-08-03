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
public class ConvertidorDecimalBinario 
{
    //Atributos
    
    private int x=0;
    private String p;
    //Metodos
    public void setX(int px)
    {
        this.x=px;
    }
    
   
    public void Decimal()
    {
    
      p = Integer.toBinaryString((int) x);
            
    }
    
    public String getP()
    {
        return p;
    }
}
