package exemgui1;

import javax.swing.JFrame;

public class Ventana1 {
    JFrame marco;
    
    public Ventana1 (){
        marco = new JFrame ("ventana1");
        
        //tamaño
        marco.setBounds(0,0,800,600);
        //cerrado de ventana y paro del programa
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }
}
