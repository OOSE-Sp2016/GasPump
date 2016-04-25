/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Simulation functions for the controller
This functionality would normally be done by hardware
*/
package controller;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControllerSimulatedFuncs {
    private ControllerJFrame GUIObj;
    private double TankSize = 0;
    private double CurrentGallons = 0;
    private double GasCost = 0;
    private double CurrentTotal = 0;
    private Thread PumpThread;
    private boolean StopPump = false;
    
    public void setGUIObj (ControllerJFrame obj) {
        GUIObj = obj;
    }
    
    /* Generate a random gas tank size for "full" */
    public void generateGasTankSize () {
        Random random = new Random();
        TankSize = random.nextDouble() * (long)20 + (long)5;
        System.out.print("Simulated gas tank size: ");
        System.out.println(TankSize);
    }
    
    /* Start pumping gas */
    public void startPump() {
        if (TankSize == 0) {
            /* Get a gas tank size */
            generateGasTankSize();
        }
        
        if (GasCost == 0) {
            /* Can't start the pump without knowing the price */
            JOptionPane.showMessageDialog(null, "Can't start pump "
                    + "without a gas price.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Runnable r = new Runnable() {
            public void run() {
                incrementPump();
            }
        };
        
        PumpThread = new Thread(r);
        PumpThread.start();
    }
    
    private void incrementPump() {
        while(StopPump == false) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControllerSimulatedFuncs.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        System.out.println("stopping");
    }
}
