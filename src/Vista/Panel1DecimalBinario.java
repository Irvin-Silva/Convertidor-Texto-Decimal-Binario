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
import javax.swing.BorderFactory;
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
public class Panel1DecimalBinario extends JPanel implements ActionListener
{
    //Elementos del panel
    private JLabel Sbruto,lbimagen,tSnResultado;
    private ImageIcon iFondo, iIcon,iFirma;
    private JTextField tBinario;
    private JButton btBinarioDecimal,btDecimalBinrio,btBinarioTexto,btTextoBinario;
    private JButton btSalir;
    private JButton btLimpiar;
    private JButton btConvertir;
    private JButton btVolver;
    private JScrollPane SpResultado;
    private JTextArea JResultado;
    private JLabel texto2;
    private JLabel texto;
    private VentanaPrincipalDecimalBinario ventPrin;
    //Metodo constructor
    public Panel1DecimalBinario(VentanaPrincipalDecimalBinario vp)
    {
        //Contenedor
        setLayout(null);
        setBackground( new Color(255, 255, 255) );
        
        ventPrin=vp;
        
       
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
        
        //Agregamos logo
        
        iIcon = new ImageIcon(getClass().getResource("/vista/logo1_1.png"));
        lbimagen = new JLabel(iIcon, JLabel.CENTER);
        lbimagen.setBounds(90,420,70,50);
        add(lbimagen);
        
        iFirma = new ImageIcon(getClass().getResource("/vista/FirmaP1.png"));
        lbimagen = new JLabel(iFirma, JLabel.CENTER);
        lbimagen.setBounds(20,420,60,60);
        add(lbimagen);
        
        //Texto
        texto= new JLabel("Número decimal a convertir");
        texto.setBounds(10,42,820,56);
        add(texto); 
        texto.setFont(new Font("", Font.TYPE1_FONT, 45));
        texto.setForeground(Color.BLACK);
        
        texto2= new JLabel("Su resultado es: ");
        texto2.setBounds(10,242,820,56);
        add(texto2); 
        texto2.setFont(new Font("", Font.TYPE1_FONT, 45));
        texto2.setForeground(Color.BLACK);
        
        //Campo de texto
        tBinario=new JTextField();
        tBinario.setBounds (10,103,575,30);
        tBinario.setFont(new Font("", Font.TRUETYPE_FONT, 18));
        tBinario.setForeground(Color.DARK_GRAY);
        add(tBinario);
        
        //Agregamos boton volver al inicio
        btVolver=new JButton("VOLVER AL INICIO");
        btVolver.setBounds(494, 440, 160, 20);
        add(btVolver);
        btVolver.setBackground(new java.awt.Color(242, 136, 41 ));
        btVolver.setFont(new java.awt.Font("Dialog", 1, 15)); 
        btVolver.setForeground(new java.awt.Color(255, 255, 255));
        btVolver.setBorder(new javax.swing.border.MatteBorder(null));
        btVolver.setMargin(new java.awt.Insets(1, 1, 1, 1));    
        
        btVolver.setActionCommand("VOLVER AL INICIO");
        btVolver.addActionListener(this);
        
        //Botón limpiar
        btLimpiar=new JButton("LIMPIAR");
        btLimpiar.setBounds(595, 103, 109, 30);
        add(btLimpiar);
        btLimpiar.setBackground(new java.awt.Color(53, 53, 53 ));
        btLimpiar.setFont(new java.awt.Font("Dialog", 1, 17)); 
        btLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpiar.setBorder(new javax.swing.border.MatteBorder(null));
        btLimpiar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        
        btLimpiar.setActionCommand("LIMPIAR");
        btLimpiar.addActionListener(this);
        
        //Botón convertir
        btConvertir=new JButton("CONVERTIR A BINARIO");
        btConvertir.setBounds(11, 168, 210, 30);
        add(btConvertir);
        btConvertir.setBackground(new java.awt.Color(51, 153, 255));
        btConvertir.setFont(new java.awt.Font("Dialog", 1, 15)); 
        btConvertir.setForeground(new java.awt.Color(255, 255, 255));
        btConvertir.setBorder(new javax.swing.border.MatteBorder(null));
        btConvertir.setMargin(new java.awt.Insets(1, 1, 1, 1));
        
        btConvertir.setActionCommand("CONVERTIR A DECIMAL");
        btConvertir.addActionListener(this);
        
        btConvertir.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                   btConvertirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) 
            {
                   btConvertirMouseExited(evt);
            }
        });
        
        //Resultado
        JResultado = new JTextArea();
        SpResultado = new JScrollPane(JResultado);
        SpResultado.setBounds(10, 298, 575, 40);
        
        add(SpResultado);
        
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
      
      //Click salir      
      if (comando.equals("Salir"))
      {
         
          ventPrin.salir();
      }
      if (comando.equals("CONVERTIR A DECIMAL"))
      {
         
           ventPrin.calcular();
      }
      if (comando.equals("LIMPIAR"))
      {
         
           ventPrin.limpiar();
      }
      if (comando.equals("VOLVER AL INICIO"))
      {
          ventPrin.volverInicio();
      }
     
    }
     //Metodos auxiliares1
    public String obtenerX()
    {
        return tBinario.getText();
    }
    
    
    public void borrartBinario()
    {
        tBinario.setText("");
    }
    
    public void borrarJResultado()
    {
        JResultado.setText("");
    }
     
      public void mostrarResultado(String msj)
    {
        JResultado.append(msj+"\n");
    }
      private void btConvertirMouseEntered(java.awt.event.MouseEvent evt) 
     {                                            
             btConvertir.setBackground(new java.awt.Color(61, 92, 233 ));
             
     }
     private void btConvertirMouseExited(java.awt.event.MouseEvent evt) 
     {                                            
             btConvertir.setBackground(new java.awt.Color(51, 153, 255));
            
     }
}
