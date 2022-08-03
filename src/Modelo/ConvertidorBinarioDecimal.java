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
public class ConvertidorBinarioDecimal 
{
    //Atributos
    
    private int x=0;
    private int p=0;
    //Metodos
    public void setX(int px)
    {
        this.x=px;
    }
    
    
   
    public void Decimal()
    {
        
       int c=0, exponente=0;
       p=0;
            do
            {
                c=(int) (x%10);
                p=p+c*(int) Math.pow(2, exponente);
                exponente++;
                x=x/10;
            }
            while(x>0);
      
    }
    
    public double getP()
    {
        return p;
    }
}
