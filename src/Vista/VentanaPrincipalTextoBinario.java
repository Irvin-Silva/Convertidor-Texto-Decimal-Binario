/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ConvertidorTextoBinario;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class VentanaPrincipalTextoBinario extends JDialog
{
    //Elementos de la ventana (atributos)
    private Panel1TextoBinario miPanel1BinarioDecimal;
    private ConvertidorTextoBinario miNdecimal;
    private BarraMenuTextoBinario miBarraMenu;
    private VentanaPrincipal ventPrin;
    
    //Metodo constructor
    public VentanaPrincipalTextoBinario(VentanaPrincipal vp)
    {
      
        super(vp,true);
        //Creación y adición del panel1 a ala ventana
        miPanel1BinarioDecimal= new Panel1TextoBinario(this);
        miPanel1BinarioDecimal.setBounds(0,0,800,520);
        add(miPanel1BinarioDecimal);
        
        //Barra de menú
        miBarraMenu = new BarraMenuTextoBinario(this);
        this.setJMenuBar(miBarraMenu);
       
      //Caracteristicas de la ventana 
        setTitle("Convertidor - UIS Socorrro");
       
        miNdecimal= new ConvertidorTextoBinario();
        
    }   
    //Operaciones Principales
    
    //Calcular
     public void calcular()
    {
        try
        {
            String x = (miPanel1BinarioDecimal.obtenerX());
            
            
            miNdecimal.setX(x);
            
            
            miNdecimal.Tbinario();
            
            String p= miNdecimal.getP();
            
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
    public void mostrarInfoTextoBinario()
    {
        InfoTextoBinario miInfoTextoBinario = new InfoTextoBinario(this);
        miInfoTextoBinario.setLocationRelativeTo(this);
        miInfoTextoBinario.setVisible(true);
        
    }
    //Salie
    
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
    
