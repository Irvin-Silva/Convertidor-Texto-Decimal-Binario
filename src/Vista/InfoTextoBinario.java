/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author irvin
 */
public class InfoTextoBinario extends JDialog 
{
    //Elementos de la ventana 
    private VentanaPrincipalTextoBinario miVentanaPrincipal;
    private ImageIcon iFondo;
    
    //Metodo constructor de la ventana
    public InfoTextoBinario (VentanaPrincipalTextoBinario vp)
    {
        super(vp,true);
        miVentanaPrincipal=vp;
        
        //Caracteristicas de la ventana
        setSize (900,600);
        setTitle("Información Binario - Decimal");
        
        //Logo y Firma
        ImageIcon iIcon = new ImageIcon(getClass().getResource("/vista/logo1_1.png"));
        JLabel lbimagen = new JLabel(iIcon, JLabel.CENTER);
        lbimagen.setBounds(90,510,70,50);
        add(lbimagen);
        
        ImageIcon iFirma = new ImageIcon(getClass().getResource("/vista/FirmaP1.png"));
        lbimagen = new JLabel(iFirma, JLabel.CENTER);
        lbimagen.setBounds(20,510,60,60);
        add(lbimagen);
        
        JLabel Texto1 = new JLabel("Conversión entre texto y binario.");
        Texto1.setBounds(193,5,700,50);
        add(Texto1); 
        Texto1.setFont(new Font("Book Antiqua", Font.ITALIC, 35));
        Texto1.setForeground(Color.BLACK);
        
        JLabel Texto2 = new JLabel("<html> 1) Debemos obtener el número de orden según la ubicación de la letra a traducir por ejemplo la letra “H”  se encuentra en la ubicación número ocho (8) dentro de nuestro abecedario y así, de igual manera, localizamos <p> el resto: <html>");
        Texto2.setBounds(5,50,900,110);
        add(Texto2); 
        Texto2.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
        Texto2.setForeground(Color.BLACK);
        
        JLabel Texto3 = new JLabel("<html> Ya teniendo los números decimales de las ubicaciones de cada letra, ahora lo pasaremos a binario, acompañándonos de la tabla de potencia base dos <html>");
        Texto3.setBounds(5,220,900,110);
        add(Texto3); 
        Texto3.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
        Texto3.setForeground(Color.BLACK);
        
        
       
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/vista/ImagenTB.jpg"));
        lbimagen = new JLabel(imagen1, JLabel.CENTER);
        lbimagen.setBounds(237,30,400,300);
        add(lbimagen);
        
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/vista/Imagen2TB.jpg"));
        lbimagen = new JLabel(imagen2, JLabel.CENTER);
        lbimagen.setBounds(90,73,700,700);
        add(lbimagen);
        
        //Agregamos fondo
        iFondo = new ImageIcon(getClass().getResource("/vista/fondo_1.jpg"));
        JLabel Fondo;
        Fondo = new JLabel(iFondo, JLabel.CENTER);
        Fondo.setBounds(0,0,850,871);
        add(Fondo); 
        
        
    }
    
    
}
