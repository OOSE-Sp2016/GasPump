/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Simulation functions for the controller
This functionality would normally be done by hardware
*/
package GUISimulation;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class ControllerSimulatedFuncs {
    private ControllerJFrame GUIObj;
    private double TankSize = 0;
    private double CurrentGallons = 0;
    private double GasCost = 0;
    private double CurrentTotal = 0;
    private Thread PumpThread;
    private boolean StopPump = false;
    private boolean PumpRunning = false;
    
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
    
    /* Stop pumping gas */
    public void stopPump() {
        if (PumpRunning) {
            StopPump = true;
        }
    }
    
    /* Increment totals */
    private void incrementPump() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        GUIObj.jTextFieldGallons.setText(numberFormat.format(CurrentGallons));
        
        PumpRunning = true;
        while(StopPump == false) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {

            }
            
            CurrentGallons += .09;
            GUIObj.jTextFieldGallons.setText(
                    numberFormat.format(CurrentGallons));
            
            CurrentTotal += .09 * GasCost;
            String totalTxt = "$" + numberFormat.format(CurrentTotal);
            GUIObj.jTextFieldTotal.setText(totalTxt);
        }
    
        PumpRunning = false;
        System.out.println("stopping pump");
    }

    public void setGasCost(double GasCost) {
        this.GasCost = GasCost;
    }
    
    
}
