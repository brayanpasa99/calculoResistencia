/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoresistencia;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author braya
 */
public class CalculoResistencia {
    
    public static JFrame ventana;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        creadorBotones crearBotones = new creadorBotones();
        JPanel painicial = crearBotones.panelInicial();
        JPanel bandas = crearBotones.seleccion;
        
        ventana = new JFrame();
        
        bandas.updateUI();
        
        ventana.setSize(1000, 750);
        
        ventana.add(painicial);
        ventana.add(bandas);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        
        ventana.setVisible(true);
        
    }
    
}
