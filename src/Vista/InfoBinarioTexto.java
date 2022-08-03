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
public class InfoBinarioTexto extends JDialog 
{
    //Elementos de la ventana 
    private VentanaPrincipalBinarioTexto miVentanaPrincipal;
    private ImageIcon iFondo;
    
    //Metodo constructor de la ventana
    public InfoBinarioTexto (VentanaPrincipalBinarioTexto vp)
    {
        super(vp,true);
        miVentanaPrincipal=vp;
        
        //Caracteristicas de la ventana
        setSize (900,600);
        setTitle("Información Binario - Texto");
        
        //Logo y Firma
        ImageIcon iIcon = new ImageIcon(getClass().getResource("/vista/logo1_1.png"));
        JLabel lbimagen = new JLabel(iIcon, JLabel.CENTER);
        lbimagen.setBounds(90,510,70,50);
        add(lbimagen);
        
        ImageIcon iFirma = new ImageIcon(getClass().getResource("/vista/FirmaP1.png"));
        lbimagen = new JLabel(iFirma, JLabel.CENTER);
        lbimagen.setBounds(20,510,60,60);
        add(lbimagen);
        
        JLabel Texto1 = new JLabel("Conversión entre binario y texto.");
        Texto1.setBounds(193,5,700,50);
        add(Texto1); 
        Texto1.setFont(new Font("Book Antiqua", Font.ITALIC, 35));
        Texto1.setForeground(Color.BLACK);
        
        JLabel Texto2 = new JLabel("<html> 1) Traducir de Binario a Decimal <p> 2) Localizar ese número decimal en la tabla ASCii <p> 3) Ordenar la Palabra. <html>");
        Texto2.setBounds(5,50,900,110);
        add(Texto2); 
        Texto2.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
        Texto2.setForeground(Color.BLACK);
        
        JLabel Texto3 = new JLabel("De esta forma: ");
        Texto3.setBounds(5,106,900,110);
        add(Texto3); 
        Texto3.setFont(new Font("Book Antiqua", Font.BOLD, 18));
        Texto3.setForeground(Color.BLACK);
        
        //Ejemplo
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/vista/ImagenBT.jpg"));
        lbimagen = new JLabel(imagen1, JLabel.CENTER);
        lbimagen.setBounds(209,10,600,600);
        add(lbimagen);
        
        //Agregamos fondo
        iFondo = new ImageIcon(getClass().getResource("/vista/fondo_1.jpg"));
        JLabel Fondo;
        Fondo = new JLabel(iFondo, JLabel.CENTER);
        Fondo.setBounds(0,0,850,871);
        add(Fondo); 
        
        
    }
    
    
}
