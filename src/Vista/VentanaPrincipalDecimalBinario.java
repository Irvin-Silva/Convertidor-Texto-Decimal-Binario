/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ConvertidorDecimalBinario;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class VentanaPrincipalDecimalBinario extends JDialog
{
    //Elementos de la ventana (atributos)
    private Panel1DecimalBinario miPanel1DecimalBinario;
    private ConvertidorDecimalBinario miNbinario;
    private BarraMenuDecimalBinario miBarraMenu;
    private VentanaPrincipal ventPrin;
   
    
    //Metodo constructor
    public VentanaPrincipalDecimalBinario(VentanaPrincipal vp)
    {
        
        super(vp,true);
        //Creación y adición del panel1 a ala ventana
        miPanel1DecimalBinario= new Panel1DecimalBinario(this);
        miPanel1DecimalBinario.setBounds(0,0,800,520);
        add(miPanel1DecimalBinario);
        
        //Barra de menú
        miBarraMenu = new BarraMenuDecimalBinario(this);
        this.setJMenuBar(miBarraMenu);
       
        //Caracteristicas de la ventana 
        setTitle("Convertidor - UIS Socorrro");
       
        miNbinario= new ConvertidorDecimalBinario();
        
    }   
    //Operaciones Principales
    
    //Calcular
     public void calcular()
    {
        try
        {
            int x = Integer.parseInt(miPanel1DecimalBinario.obtenerX());
            
            
            miNbinario.setX(x);
            
            
            miNbinario.Decimal();
            
            String p=  miNbinario.getP();
            
            miPanel1DecimalBinario.mostrarResultado(""+p);
            
          
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
        miPanel1DecimalBinario.borrartBinario();
        miPanel1DecimalBinario.borrarJResultado();
        
        
    }
    public void mostrarInfoDecimalBinario()
    {
        InfoDecimalBinario miInfoDecimalBinario = new InfoDecimalBinario(this);
        miInfoDecimalBinario.setLocationRelativeTo(this);
        miInfoDecimalBinario.setVisible(true);
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
    
