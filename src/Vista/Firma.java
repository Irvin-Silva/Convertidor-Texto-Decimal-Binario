/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;



/**
 *
 * @author irvin
 */
public class Firma extends JDialog 
{
    //Elementos de la ventana 
    private VentanaPrincipal miVentanaPrincipal;
    private JLabel Texto1,Texto2,Texto3,Texto4;
    private Firma miFirma;
    private JButton btVolver;
    private ImageIcon iFondo;
    private JLabel Pregunta,lbimagen, hora;
    private ImageIcon iHola;
    
    //Metodo constructor de la ventana
    public Firma(VentanaPrincipal vp)
    {
        
       
        super(vp,true);
        miVentanaPrincipal=vp;

        
        //Caracteristicas de la ventana
        
        setTitle("Irvin Silva");
        setResizable(false);
        setLayout(null);
        
        Texto2= new JLabel("Software desarrollado por: Irvin Aurelio Silva Báez");
        Texto2.setBounds(40,40,600,56);
        add(Texto2); 
        Texto2.setFont(new java.awt.Font("Freestyle Script",Font.BOLD, 30));
        Texto2.setForeground(new java.awt.Color(0, 0, 0  ));
      
        
        Texto1= new JLabel("Estudiante Universidad Industrial de Santander");
        Texto1.setBounds(130,80,500,50);
        add(Texto1); 
        Texto1.setFont(new Font("Lucida Handwriting Cursiva", Font.TYPE1_FONT, 15));
        Texto1.setForeground(Color.BLACK);
        
        Texto3= new JLabel("Socorro");
        Texto3.setBounds(280,120,500,50);
        add(Texto3); 
        Texto3.setFont(new Font("Lucida Handwriting Cursiva", Font.TYPE1_FONT, 17));
        Texto3.setForeground(Color.BLACK);
        
        Texto4= new JLabel("2021");
        Texto4.setBounds(291,155,500,50);
        add(Texto4); 
        Texto4.setFont(new Font("Lucida Handwriting Cursiva", Font.TYPE1_FONT, 17));
        Texto4.setForeground(Color.BLACK);
        
        //Agregamos gif
        iHola = new ImageIcon(getClass().getResource("/vista/Hola.gif"));
        lbimagen = new JLabel(iHola, JLabel.CENTER);
        lbimagen.setBounds(500,121,99,110);
        iHola.setImageObserver(lbimagen); 
        add(lbimagen);
        
         
        //Agregamos fondo
        iFondo = new ImageIcon(getClass().getResource("/vista/FondoFirma.jpg"));
        JLabel lbimagen = new JLabel(iFondo, JLabel.CENTER);
        lbimagen.setBounds(0,0,650,271);
        add(lbimagen); 

   }
}
