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
public class InfoDecimalBinario extends JDialog 
{
    //Elementos de la ventana 
    private VentanaPrincipalDecimalBinario miVentanaPrincipal;
    private ImageIcon iFondo;
    
    //Metodo constructor de la ventana
    public InfoDecimalBinario (VentanaPrincipalDecimalBinario vp)
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
        
        
        JLabel Texto1 = new JLabel("Conversión entre decimal y binario");
        Texto1.setBounds(193,5,700,50);
        add(Texto1); 
        Texto1.setFont(new Font("Book Antiqua", Font.ITALIC, 35));
        Texto1.setForeground(Color.BLACK);
        
        JLabel Texto2 = new JLabel("<html>Se divide el número del sistema decimal entre 2, cuyo resultado entero se vuelve a dividir entre 2, y así sucesivamente hasta que el dividendo sea menor que el divisor, 2. Es decir, cuando el número a dividir sea 1 finaliza la división.A continuación se ordena desde el último cociente hasta el primer resto, simplemente se colocan en orden inverso a como aparecen en la división. Este será el número binario que buscamos.<html>");
        Texto2.setBounds(5,50,900,110);
        add(Texto2); 
        Texto2.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
        Texto2.setForeground(Color.BLACK);
        
        JLabel Texto3 = new JLabel("Ejemplo: ");
        Texto3.setBounds(5,136,900,110);
        add(Texto3); 
        Texto3.setFont(new Font("Book Antiqua", Font.BOLD, 18));
        Texto3.setForeground(Color.BLACK);
        
        //Ejemplo
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/vista/imagen1BD.png"));
        lbimagen = new JLabel(imagen1, JLabel.CENTER);
        lbimagen.setBounds(5,230,500,200);
        add(lbimagen);
        
        JLabel Texto4 = new JLabel("Transformar el número decimal 131 en binario. El método es muy simple:");
        Texto4.setBounds(5,156,900,110);
        add(Texto4); 
        Texto4.setFont(new Font("Book Antiqua", Font.ITALIC, 18));
        Texto4.setForeground(Color.BLACK);
        
        JLabel Texto5 = new JLabel(" -> Ordenamos los residuos, del último al primero: 10000011 En sistema binario, 131 se escribe 10000011");
        Texto5.setBounds(5,396,900,110);
        add(Texto5); 
        Texto5.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
        Texto5.setForeground(Color.BLACK);
        
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/vista/imagen2BD.gif"));
        lbimagen = new JLabel(imagen2, JLabel.CENTER);
        lbimagen.setBounds(530,100,400,400);
        add(lbimagen);
        
        //Agregamos fondo
        iFondo = new ImageIcon(getClass().getResource("/vista/fondo_1.jpg"));
        JLabel Fondo = new JLabel(iFondo, JLabel.CENTER);
        Fondo.setBounds(0,0,900,600);
        add(Fondo); 
        
    }
    
    
}
