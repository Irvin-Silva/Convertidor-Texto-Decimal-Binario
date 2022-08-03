/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ConvertidorBinarioTexto;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class VentanaPrincipalBinarioTexto extends JDialog
{
    //Elementos de la ventana (atributos)
    private Panel1BinarioTexto miPanel1BinarioTexto;
    private ConvertidorBinarioTexto miTexto;
    private BarraMenuBinarioTexto miBarraMenu;
    private VentanaPrincipal ventPrin;
   
    
    //Metodo constructor
    public VentanaPrincipalBinarioTexto(VentanaPrincipal vp)
    {
        
        super(vp,true);
        //Creación y adición del panel1 a ala ventana
        miPanel1BinarioTexto= new Panel1BinarioTexto(this);
        miPanel1BinarioTexto.setBounds(0,0,800,520);
        add(miPanel1BinarioTexto);
       
        //Barra de menú
        miBarraMenu = new BarraMenuBinarioTexto(this);
        this.setJMenuBar(miBarraMenu);
        
       //Caracteristicas de la ventana 
        setTitle("Convertidor - UIS Socorrro");
       
        miTexto= new ConvertidorBinarioTexto();
        
    }   
    //Operaciones Principales
    
    //Calcular
     public void calcular()
    {
        try
        {
            String x = (miPanel1BinarioTexto.obtenerX());
            
            
            miTexto.setX(x);
            
            
           miTexto.Texto();
            
            String p=  miTexto.getP();
            
            miPanel1BinarioTexto.mostrarResultado(""+p);
            
          
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Datos errones","UIS",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Borrar
    public void limpiar()
    {
        JOptionPane.showMessageDialog(this,"Se limpiarán todos los elementos.");
        miPanel1BinarioTexto.borrartBinario();
        miPanel1BinarioTexto.borrarJResultado();
        
        
    }
    //Salir
    
    public void salir()
    {
        JOptionPane.showMessageDialog(this,"Gracias por usar esta aplicación.");
        System.exit(0);
    }
     public void mostrarInfoBinarioTexto()
    {
        InfoBinarioTexto miInfoBinarioTexto = new InfoBinarioTexto(this);
        miInfoBinarioTexto.setLocationRelativeTo(this);
        miInfoBinarioTexto.setVisible(true);
    }
    public void volverInicio()
     {
         super.dispose();
     }
}
    
