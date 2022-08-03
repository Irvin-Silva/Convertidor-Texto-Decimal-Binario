/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author irvin
 */
public class Panel1 extends JPanel implements ActionListener
{
    //Elementos del panel
    private JLabel Pregunta,lbimagen, hora;
    private ImageIcon iFondo, iIcon,iFirma,iHola,imagenFirma;
    private JButton btBinarioDecimal,btDecimalBinario,btBinarioTexto,btTextoBinario,botonFirma,btOscuro;
    private JButton btSalir;
    private VentanaPrincipal ventPrin;
    private Icon iconoFirma;
    
    
    //Metodo constructor
    public Panel1(VentanaPrincipal vp)
    {
        //Contenedor
        setLayout(null);
        setBackground( new Color(255, 255, 255) );
        
        ventPrin=vp;
        
        
        
        //Crear y agrgar la etiqueta lbx
        Pregunta= new JLabel("¿Qué deseas convertir?");
        Pregunta.setBounds(140,55,820,56);
        add(Pregunta); 
        Pregunta.setFont(new Font("Sitka Small", Font.TYPE1_FONT, 45));
        Pregunta.setForeground(Color.BLACK);
        
        
        
        //Crear boton de binario a decimal
        btBinarioDecimal=new JButton("CONVERTIR DE BINARIO A NÚMERO DECIMAL");
        btBinarioDecimal.setBounds(0, 140, 379, 35);
        add(btBinarioDecimal);
        btBinarioDecimal.setBackground(new java.awt.Color(53, 53, 53 ));
        btBinarioDecimal.setFont(new java.awt.Font("Dialog", 1, 17)); 
        btBinarioDecimal.setForeground(new java.awt.Color(255, 255, 255));
        btBinarioDecimal.setBorder(new javax.swing.border.MatteBorder(null));
        btBinarioDecimal.setMargin(new java.awt.Insets(1, 1, 1, 1));  
        btBinarioDecimal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        btBinarioDecimal.setActionCommand("CONVERTIR DE BINARIO A NÚMERO DECIMAL");
        btBinarioDecimal.addActionListener(this);
        
        btBinarioDecimal.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                   btBinarioDecimalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) 
            {
                   btBinarioDecimalMouseExited(evt);
            }
        });
        //Crear boton de decimal a binario
        btDecimalBinario=new JButton("CONVERTIR DE DECIMAL A NÚMERO BINARIO");
        btDecimalBinario.setBounds(416, 140, 379, 35);
        add(btDecimalBinario);
        btDecimalBinario.setBackground(new java.awt.Color(53, 53, 53 ));
        btDecimalBinario.setFont(new java.awt.Font("Dialog", 1, 17)); 
        btDecimalBinario.setForeground(new java.awt.Color(255, 255, 255));
        btDecimalBinario.setBorder(new javax.swing.border.MatteBorder(null));
        btDecimalBinario.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btDecimalBinario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        btDecimalBinario.setActionCommand("CONVERTIR DE DECIMAL A NÚMERO BINARIO");
        btDecimalBinario.addActionListener(this);
        
        btDecimalBinario.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                   btDecimalBinarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) 
            {
                   btDecimalBinarioMouseExited(evt);
            }
        });
        
        
         //Crear boton de numero binario a texto
        btBinarioTexto=new JButton("CONVERTIR DE NÚMERO BINARIO A TEXTO");
        btBinarioTexto.setBounds(0, 240, 379, 35);
        add(btBinarioTexto);
        btBinarioTexto.setBackground(new java.awt.Color(53, 53, 53 ));
        btBinarioTexto.setFont(new java.awt.Font("Dialog", 1, 17)); 
        btBinarioTexto.setForeground(new java.awt.Color(255, 255, 255));
        btBinarioTexto.setBorder(new javax.swing.border.MatteBorder(null));
        btBinarioTexto.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btBinarioTexto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        btBinarioTexto.setActionCommand("CONVERTIR DE NÚMERO BINARIO A TEXTO");
        btBinarioTexto.addActionListener(this);
        
        btBinarioTexto.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                   btBinarioTextoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) 
            {
                   btBinarioTextoMouseExited(evt);
            }
        });
        //Crear boton de texto a binario
        btTextoBinario=new JButton("CONVERTIR DE TEXTO A NÚMERO BINARIO");
        btTextoBinario.setBounds(416, 240, 379, 35);
        add(btTextoBinario);
        btTextoBinario.setBackground(new java.awt.Color(53, 53, 53 ));
        btTextoBinario.setFont(new java.awt.Font("Dialog", 1, 17)); 
        btTextoBinario.setForeground(new java.awt.Color(255, 255, 255));
        btTextoBinario.setBorder(new javax.swing.border.MatteBorder(null));
        btTextoBinario.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btTextoBinario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        btTextoBinario.setActionCommand("CONVERTIR DE TEXTO A NÚMERO BINARIO");
        btTextoBinario.addActionListener(this);
        
        btTextoBinario.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                   btTextoBinarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) 
            {
                   btTextoBinarioMouseExited(evt);
            }
        });
        
        
        //Craear boton salir
        btSalir=new JButton("SALIR");
        btSalir.setBounds(680, 440, 100, 20);
        add(btSalir);
        btSalir.setBackground(new java.awt.Color(253, 35, 35));
        btSalir.setFont(new java.awt.Font("Dialog", 1, 15)); 
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setBorder(new javax.swing.border.MatteBorder(null));
        btSalir.setMargin(new java.awt.Insets(1, 1, 1, 1));
        
        btSalir.setActionCommand("Salir");
        btSalir.addActionListener(this);
        
         btSalir.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                   btSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) 
            {
                   btSalirMouseExited(evt);
            }
        });
        
      
        
        //Agregamos logo
        iIcon = new ImageIcon(getClass().getResource("/vista/logo1_1.png"));
        lbimagen = new JLabel(iIcon, JLabel.CENTER);
        lbimagen.setBounds(150,417,70,50);
        add(lbimagen);
        
        //Firma
        botonFirma=new JButton("Irvin Silva");
        botonFirma.setBounds(0,426,140,33);
        add(botonFirma);
        botonFirma.setBackground(new java.awt.Color(236, 236, 236 ));
        botonFirma.setFont(new java.awt.Font("Freestyle Script",Font.BOLD, 36)); 
        botonFirma.setForeground(new java.awt.Color(1, 1, 1 ));
        botonFirma.setMargin(new java.awt.Insets(1, 1, 1, 1));
        botonFirma.setBorder(new javax.swing.border.MatteBorder(null));
        botonFirma.setActionCommand("");
        botonFirma.addActionListener(this);
        botonFirma.setActionCommand("Firma");
        botonFirma.addActionListener(this);
      
            
        //HORA
        LocalDateTime locaDate = LocalDateTime.now();
        int horas  = locaDate.getHour();
        int minutos = locaDate.getMinute();
        int segundos = locaDate.getSecond();
        
        if(horas>=0 && horas<12)
        {
        hora= new JLabel("Buenos días.");
        hora.setBounds(0,0,820,56);
        add(hora); 
        hora.setFont(new java.awt.Font("Edwardian Script ITC",Font.BOLD, 37));
        hora.setForeground(new java.awt.Color(0, 0, 0  ));
            
        }
        if(horas >=12 && horas <=18)
        {
        hora= new JLabel("Buenas tardes.");
        hora.setBounds(0,0,820,56);
        add(hora); 
        hora.setFont(new java.awt.Font("Edwardian Script ITC",Font.BOLD, 37));
        hora.setForeground(new java.awt.Color(0, 0, 0 ));   
        }
        if(horas >18 && horas <=24)
        {
        hora= new JLabel("Buenas noches.");
        hora.setBounds(0,0,820,56);
        add(hora); 
        hora.setFont(new java.awt.Font("Edwardian Script ITC",Font.BOLD, 37));
        hora.setForeground(new java.awt.Color(0, 0, 0 ));   
        }
        
        
 
        //Agregamos fondo
        iFondo = new ImageIcon(getClass().getResource("/vista/fondo_1.jpg"));
        lbimagen = new JLabel(iFondo, JLabel.CENTER);
        lbimagen.setBounds(0,0,800,500);
        add(lbimagen); 
        
        
        
       
    }

    //Metodo de atencion de eventos 
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
      //Identificar el evento generado
      String comando = ae.getActionCommand();
      
      //Condicionales       
      if (comando.equals("Salir"))
      {
         
          ventPrin.salir();
      }
      if (comando.equals("Firma"))
      {
         
          ventPrin.abrirFirma();
      }
      
      if (comando.equals("CONVERTIR DE BINARIO A NÚMERO DECIMAL"))
      {
         
           ventPrin.abrirBinarioDecimal();
      }
      if (comando.equals("CONVERTIR DE DECIMAL A NÚMERO BINARIO"))
      {
           ventPrin.abrirDecimalBinario();
      }
      
      if(comando.equals("CONVERTIR DE NÚMERO BINARIO A TEXTO"))
      {
          ventPrin.abrirBinarioTexto();
      }
      if(comando.equals("CONVERTIR DE TEXTO A NÚMERO BINARIO"))
      {
          ventPrin.abrirTextoBinario();
      }
      
        
    }
    
     private void btBinarioDecimalMouseEntered(java.awt.event.MouseEvent evt) 
     {                                            
             btBinarioDecimal.setBackground(new java.awt.Color(77, 168, 178 ));
             btBinarioDecimal.setBounds(18, 140, 379, 35);
     }
     private void btBinarioDecimalMouseExited(java.awt.event.MouseEvent evt) 
     {                                            
             btBinarioDecimal.setBackground(new java.awt.Color(53, 53, 53));
             btBinarioDecimal.setBounds(0,140, 379, 35);
     }
      private void btDecimalBinarioMouseEntered(java.awt.event.MouseEvent evt) 
     {                                            
             btDecimalBinario.setBackground(new java.awt.Color(77, 168, 178 ));
             btDecimalBinario.setBounds(398, 140, 379, 35);
             
     }
     private void btDecimalBinarioMouseExited(java.awt.event.MouseEvent evt) 
     {                                            
             btDecimalBinario.setBackground(new java.awt.Color(53, 53, 53));
             btDecimalBinario.setBounds(416, 140, 379, 35);
     }
      private void btBinarioTextoMouseEntered(java.awt.event.MouseEvent evt) 
     {                                            
             btBinarioTexto.setBackground(new java.awt.Color(77, 168, 178 ));
             btBinarioTexto.setBounds(18,240, 379, 35 );
     }
     private void btBinarioTextoMouseExited(java.awt.event.MouseEvent evt) 
     {                                            
             btBinarioTexto.setBackground(new java.awt.Color(53, 53, 53));
             btBinarioTexto.setBounds(0,240, 379, 35 );
     }
     private void btTextoBinarioMouseEntered(java.awt.event.MouseEvent evt) 
     {                                            
             btTextoBinario.setBackground(new java.awt.Color(77, 168, 178 ));
             btTextoBinario.setBounds(398, 240, 379, 35);
     }
     private void btTextoBinarioMouseExited(java.awt.event.MouseEvent evt) 
     {                                            
             btTextoBinario.setBackground(new java.awt.Color(53, 53, 53));
             btTextoBinario.setBounds(416, 240, 379, 35);
     }
     
     private void btSalirMouseEntered(java.awt.event.MouseEvent evt) 
     {                                            
             btSalir.setBackground(new java.awt.Color(255, 69, 77));
            
     }
     private void btSalirMouseExited(java.awt.event.MouseEvent evt) 
     {                                            
             btSalir.setBackground(new java.awt.Color(253, 35, 35));
             
     }
      private void btOscuroMouseEntered(java.awt.event.MouseEvent evt) 
     {                                            
             btOscuro.setBackground(new java.awt.Color(44, 66, 79));
            
     }
     private void btOscuroMouseExited(java.awt.event.MouseEvent evt) 
     {                                            
             btOscuro.setBackground(new java.awt.Color(60, 80, 156));
             
     }
    
}
