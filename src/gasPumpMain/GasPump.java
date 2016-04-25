/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Main class
*/
package gasPumpMain;

import controller.ControllerJFrame;
import controller.Controller;
import controller.ControllerSimulatedFuncs;

public class GasPump {
    public static void main(String[] args) {
        /* Create the main controller */
        Controller Control = new Controller();
        
        /* Create and show the test GUI */
        ControllerJFrame TestFrame = new ControllerJFrame();
        TestFrame.pack();
        TestFrame.setVisible(true);
        TestFrame.addListener(Control);
        
        /* Create the simulator */
        ControllerSimulatedFuncs Simulator = new ControllerSimulatedFuncs();
        
        /* Sync up controller with other objs */
        Control.setGUIObj(TestFrame);
        Control.setSimulatedObj(Simulator);
        Simulator.setGUIObj(TestFrame);
        
        /* this is just here for testing */
        Simulator.startPump();
    }
}
