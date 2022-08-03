/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ConvertidorBinarioDecimal;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class VentanaPrincipalBinarioDecimal extends JDialog
{
    //Elementos de la ventana (atributos)
    private Panel1BinarioDecimal miPanel1BinarioDecimal;
    private ConvertidorBinarioDecimal miNdecimal;
    private BarraMenuBinarioDecimal miBarraMenu;
    private VentanaPrincipal ventPrin;
   
    
    //Metodo constructor
    public VentanaPrincipalBinarioDecimal(VentanaPrincipal vp)
    {

       super(vp,true);
       
        //Creación y adición del panel1 a ala ventana
        miPanel1BinarioDecimal= new Panel1BinarioDecimal(this);
        miPanel1BinarioDecimal.setBounds(0,0,800,520);
        add(miPanel1BinarioDecimal);
        
        //Barra de menú
        miBarraMenu = new BarraMenuBinarioDecimal(this);
        this.setJMenuBar(miBarraMenu);
       
        //Caracteristicas de la ventana 
        setTitle("Convertidor - UIS Socorrro");
        
       
        miNdecimal= new ConvertidorBinarioDecimal();
        
        
    }   
    //Operaciones Principales
    
    //Calcular
     public void calcular()
    {
        try
        {
            int x = Integer.parseInt(miPanel1BinarioDecimal.obtenerX());
            
            
            miNdecimal.setX(x);
            
            
            miNdecimal.Decimal();
            
            int p= (int) miNdecimal.getP();
            
            miPanel1BinarioDecimal.mostrarResultado(""+p);

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
        miPanel1BinarioDecimal.borrartBinario();
        miPanel1BinarioDecimal.borrarJResultado();

    }
  
    public void mostrarInfoBinarioDecimal()
    {
        InfoBinarioDecimal miInfoBinarioDecimal = new InfoBinarioDecimal(this);
        miInfoBinarioDecimal.setLocationRelativeTo(this);
        miInfoBinarioDecimal.setVisible(true);
    }
    
    //Salir
    
    public void salir()
    {
        JOptionPane.showMessageDialog(this,"Gracias por usar esta aplicación.");
        System.exit(0);
    }
     public void volverInicio()
     {
         super.dispose();
     }
     
    
     
    
   
}