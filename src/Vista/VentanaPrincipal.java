/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class VentanaPrincipal extends JFrame
{
    //Elementos de la ventana (atributos)
    private Panel1 miPanel1;
    private VentanaPrincipalBinarioDecimal miVentanaPrincipalBinarioDecimal1;
    private VentanaPrincipalBinarioTexto miVentanaPrincipalBinarioTexto;
    private VentanaPrincipalDecimalBinario miVentanaPrincipalDecimalBinario;
    private VentanaPrincipalTextoBinario miVentanaPrincipalTextoBinario;
    private Firma miFirma;
    
    
   
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Contenedor de la ventana 
        setLayout(null);
       
        //Creación y adición del panel1 a ala ventana
        miPanel1 = new Panel1(this);
        miPanel1.setBounds(0,0,800,520);
        add(miPanel1);
       
        //Caracteristicas de la ventana 
        setTitle("Convertidor - UIS Socorrro");
        setSize(800,520);
        setLocationRelativeTo(null);
        //setLocation(100,100);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        //Caracteristicas de la ventana 
        setTitle("Convertidor - UIS Socorrro");
        setSize(800,500);
        setLocationRelativeTo(null);
        //setLocation(100,100);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   
    
    public void salir()
    {
        JOptionPane.showMessageDialog(this,"Gracias por usar esta aplicación");
        System.exit(0);
    }
    public void abrirBinarioDecimal()
    {
      
        miVentanaPrincipalBinarioDecimal1 = new VentanaPrincipalBinarioDecimal(this);
        miVentanaPrincipalBinarioDecimal1.setLayout(null);  
        miVentanaPrincipalBinarioDecimal1.setSize(800,530);
        miVentanaPrincipalBinarioDecimal1.setLocationRelativeTo(null);
        miVentanaPrincipalBinarioDecimal1.setResizable(false);
        miVentanaPrincipalBinarioDecimal1.setVisible(true);
        
    }
    public void abrirDecimalBinario()
    {
        miVentanaPrincipalDecimalBinario = new VentanaPrincipalDecimalBinario(this);
        miVentanaPrincipalDecimalBinario.setLayout(null);  
        miVentanaPrincipalDecimalBinario.setSize(800,530);
        miVentanaPrincipalDecimalBinario.setLocationRelativeTo(null);
        miVentanaPrincipalDecimalBinario.setResizable(false);
        miVentanaPrincipalDecimalBinario.setVisible(true);
    }
    public void abrirBinarioTexto()
    {
        miVentanaPrincipalBinarioTexto = new VentanaPrincipalBinarioTexto(this);
        miVentanaPrincipalBinarioTexto.setLayout(null);  
        miVentanaPrincipalBinarioTexto.setSize(800,530);
        miVentanaPrincipalBinarioTexto.setLocationRelativeTo(null);
        miVentanaPrincipalBinarioTexto.setResizable(false);
        miVentanaPrincipalBinarioTexto.setVisible(true);
    }
    public void abrirTextoBinario()
    {
        miVentanaPrincipalTextoBinario = new VentanaPrincipalTextoBinario(this);
        miVentanaPrincipalTextoBinario.setLayout(null);  
        miVentanaPrincipalTextoBinario.setSize(800,530);
        miVentanaPrincipalTextoBinario.setLocationRelativeTo(null);
        miVentanaPrincipalTextoBinario.setResizable(false);
        miVentanaPrincipalTextoBinario.setVisible(true); 
    }
    
    
    public void abrirFirma()
    {
        Firma miFirma = new Firma(this);
        miFirma.setLayout(null);  
        miFirma.setSize (650,271);
        miFirma.setLocationRelativeTo(null);
        miFirma.setResizable(false);
        miFirma.setVisible(true);
        miFirma.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    
     
      
    
 
}