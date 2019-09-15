/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoresistencia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author braya
 */
public class creadorBotones implements ActionListener {
    
    JButton bandas4, bandas5, calcular;
    JComboBox[] banda4 = new JComboBox[4];
    JComboBox[] banda5 = new JComboBox[5];
    JLabel[] lbBanda4 = new JLabel[4];
    JLabel[] lbBanda5 = new JLabel[5];
    String[] colores = {"Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco", "Dorado", "Plateado"};
    String[] labelsBanda4 = {"Banda 1", "Banda 2", "Multiplicador", "Tolerancia"};
    String[] labelsBanda5 = {"Banda 1", "Banda 2", "Banda 3", "Multiplicador", "Tolerancia"};
    JTextField resultado;
    JPanel seleccion = new JPanel();
    
    public creadorBotones(){
        creadorBotones crearBotones = new creadorBotones();
        JPanel painicial = crearBotones.panelInicial();
        JPanel bandas4 = crearBotones.pbandas4();
        JPanel bandas5 = crearBotones.pbandas5();
        
        JFrame ventana = new JFrame();
                
        ventana.setSize(1000, 750);
        
        ventana.add(painicial);
        ventana.add(bandas4);
        ventana.add(bandas4);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        
        ventana.setVisible(true);
    }
    
    public JPanel panelInicial(){
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 100);  
        
        bandas4 = new JButton("4 Bandas");
        bandas4.setVisible(true);
        bandas4.setBounds(50, 50, 100, 30);
        bandas4.addActionListener(this);
        panel.add(bandas4);
        
        bandas5 = new JButton("5 Bandas");
        bandas5.setVisible(true);
        bandas5.setBounds(200, 50, 100, 30);
        bandas5.addActionListener(this);
        panel.add(bandas5);
        
        resultado = new JTextField("");
        resultado.setEnabled(false);
        resultado.setVisible(true);
        resultado.setBounds(460, 50, 100, 30);
        panel.add(resultado);
        
        calcular = new JButton("Calcular");
        calcular.setVisible(true);
        calcular.setBounds(350, 50, 100, 30);
        calcular.addActionListener(this);
        panel.add(calcular);
        
        return panel;
        
    }
        
    public JPanel pbandas4 (){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 160, 700, 400); 
        
        int k=25;
        for(int i=0; i<=3;i++){
            
            lbBanda4[i]=new JLabel();
            lbBanda4[i].setBounds(k,30,100,20);
            lbBanda4[i].setText(labelsBanda4[i]);
            lbBanda4[i].setVisible(true);
            
            
            banda4[i]=new JComboBox();
            banda4[i].setBounds(k,50,100,20);
            k=k+110;
        }
        
        for(int i=0;i<=1;i++){
            for(int j=0;j<=9;j++){
                banda4[i].addItem(colores[j]);
            }
        }
        
        for(int i=0;i<7;i++){
            banda4[2].addItem(colores[i]);
        }
        
        banda4[2].addItem(colores[10]);
        banda4[2].addItem(colores[11]);
        
        banda4[3].addItem(colores[1]);
        banda4[3].addItem(colores[2]);
        banda4[3].addItem(colores[10]);
        banda4[3].addItem(colores[11]);
        banda4[3].addItem("SIN BANDA");
        
        for(int i=0; i<4;i++){
            banda4[i].setVisible(true);
            panel.add(banda4[i]);
            panel.add(lbBanda4[i]);
        }
        
        panel.setVisible(true);
        
        return panel; 
        
    }
    
    public JPanel pbandas5 (){    
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 160, 700, 400); 
        
        int k=25;
        for(int i=0; i<=4;i++){
            
            lbBanda5[i]=new JLabel();
            lbBanda5[i].setBounds(k,30,100,20);
            lbBanda5[i].setText(labelsBanda5[i]);
            lbBanda5[i].setVisible(true);
            
            
            banda5[i]=new JComboBox();
            banda5[i].setBounds(k,50,100,20);
            k=k+110;
        }
        
        for(int i=0;i<=1;i++){
            for(int j=0;j<=9;j++){
                banda5[i].addItem(colores[j]);
            }
        }
        
        for(int i=0;i<10;i++){
            banda5[2].addItem(colores[i]);
        }
        
        for(int i=0;i<8;i++){
            banda5[3].addItem(colores[i]);
        }
        
        banda5[3].addItem(colores[10]);
        banda5[3].addItem(colores[11]);
        
        banda5[4].addItem(colores[1]);
        banda5[4].addItem(colores[2]);
        banda5[4].addItem(colores[10]);
        banda5[4].addItem(colores[11]);
        banda5[4].addItem("SIN BANDA");
        
        for(int i=0; i<5;i++){
            banda5[i].setVisible(true);
            panel.add(banda5[i]);
            panel.add(lbBanda5[i]);
        }
        
        panel.setVisible(true);
        
        return panel;
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == bandas4){
            
            seleccion = pbandas4();
            seleccion.setVisible(true);
            
        }
    }
    
}
