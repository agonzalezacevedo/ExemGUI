package exemgui1;

import java.awt.Color;
import javax.swing.*;

public class Componentes {
    
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    JTextField liñaDeTexto;
    
    public Componentes(){
        
        marco = new JFrame ("Compoñentes");
        panel = new JPanel();
        boton = new JButton("BOTON");
        etiqueta = new JLabel();
        liñaDeTexto = new JTextField();
        //damoslle caracteristicas aos compoñentes
        
        marco.setBounds(0,0,600,400);
        panel.setSize(600,400);
        panel.setBackground(Color.red);
        etiqueta.setText("ETIQUETA");
        liñaDeTexto.setText("dame un tamaño");
        //poñemos compoñentes no panel
        
        panel.add(boton);
        panel.add(etiqueta);
        panel.add(liñaDeTexto);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
        
        
    }
}
