/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author irvin
 */
public class BarraMenuDecimalBinario extends JMenuBar implements ActionListener  
{
    //Elementos del menu
    private VentanaPrincipalDecimalBinario miVentanaPrincipal;
    private JMenu mOperaciones, mInfo;
    private JMenuItem miCalcular,miBorrar,miSalir,mLimpiar,miInfo;
    private VentanaPrincipal vent;
    
    //Metodo Constructor
    public BarraMenuDecimalBinario (VentanaPrincipalDecimalBinario ventPrin)
    {
        miVentanaPrincipal = ventPrin;
        //vent = new VentanaPrincipal();
        //vent.setVisible(false);
        
        mOperaciones = new JMenu("Operaciones");
        mOperaciones.setMnemonic('0');
        this.add(mOperaciones);
        
        miCalcular =new JMenuItem("Convertir a binario");
        miCalcular.setActionCommand("Convertir a binario");
        miCalcular.addActionListener(this);
        miCalcular.setMnemonic('x');
        mOperaciones.add(miCalcular);
        
        Icon iconoCalcular = new ImageIcon(getClass().
        getResource("/vista/calcular.png"));
        miCalcular.setIcon(iconoCalcular);
        
        Icon iconoProceso = new ImageIcon(getClass().
        getResource("/vista/proceso.png"));
        mOperaciones.setIcon(iconoProceso);
        
        miSalir =new JMenuItem("Salir");
        miSalir.setActionCommand("Salir");
        miSalir.addActionListener(this);
        miSalir.setMnemonic('x');
        mOperaciones.add(miSalir);
        
        Icon imgBoton = new ImageIcon(getClass().
        getResource("/vista/salir.png"));
        miSalir.setIcon(imgBoton);
        
        mLimpiar =new JMenuItem("Limpiar");
        mLimpiar.setActionCommand("Limpiar");
        mLimpiar.addActionListener(this);
        mLimpiar.setMnemonic('x');
        mOperaciones.add(mLimpiar);
        
        Icon iconoLimpiar = new ImageIcon(getClass().
        getResource("/vista/limpiar.png"));
        mLimpiar.setIcon(iconoLimpiar);
        
        miInfo =new JMenuItem("Información");
        miInfo.setActionCommand("Info");
        miInfo.addActionListener(this);
        miInfo.setMnemonic('x');
        mOperaciones.add(miInfo);
        
        Icon iconoInfo = new ImageIcon(getClass().
        getResource("/vista/informacion.png"));
        miInfo.setIcon(iconoInfo);
        
        
    }


    @Override
    public void actionPerformed (ActionEvent e)
    {
        String comando=e.getActionCommand();
        if(comando.equals("Salir"))
        {
            miVentanaPrincipal.salir();
        }
        if(comando.equals("Limpiar"))
        {
            miVentanaPrincipal.limpiar();
        }
        if(comando.equals("Convertir a binario"))
        {
            miVentanaPrincipal.calcular();
        }
        if(comando.equals("Info"))
        {
            
            miVentanaPrincipal.mostrarInfoDecimalBinario();
        }
    }
}

