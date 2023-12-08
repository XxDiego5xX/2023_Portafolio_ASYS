/*
 ITESS-TICS--TI502-ASYSC
 Agosto-Diciembre 2023
 U4-Portafolio de evidencias
 Descripción: Plantilla para portafolio de evidencias
 by FJMP 
 07/12/2023
 */
package app;

import gui.MainASYS;
import gui.Introduction;
import gui.FourierSeries;
import javax.swing.JFrame;


public class Main {
    
    public JFrame mainASYS;
    public JFrame introduction;
    public JFrame fourierSeries;
    public JFrame fourierTransform;
    public JFrame discreteSystem;
    
    public Main() {
        mainASYS = new MainASYS(this);
        //complexNumbersASYS = new ComplexNumbersASYS(this);
        //realGraphASYS = new RealGraphASYS(this);
        
    }
    
    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    mainASYS.setVisible(true);
                }
            });
    }
    public static void main(String[] args) {
                new Main().run();
        
    }
}
