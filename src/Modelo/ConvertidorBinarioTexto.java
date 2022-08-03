/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class ConvertidorBinarioTexto 
{
    //Atributos
    
    private String x;
    private String p;
    
    //Metodos
    public void setX(String px)
    {
        this.x=px;
    }
    
    public void Texto()
    {
          
     p = "";
      for(int i = 0; i <= x.length() - 8; i+=8)
        {
            int k = Integer.parseInt(x.substring(i, i+8), 2);
            p += (char) k;
        }
 
    }
    
    public String getP()
    {
        return p;
    }
}
