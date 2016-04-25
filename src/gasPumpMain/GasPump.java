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

public class GasPump {
    public static void main(String[] args) {
        /* Create the main controller */
        Controller Control = new Controller();
        
        /* Create and show the test GUI */
        ControllerJFrame TestFrame = new ControllerJFrame();
        TestFrame.pack();
        TestFrame.setVisible(true);
        TestFrame.addListener(Control);
        
        Control.SetGUIObj(TestFrame);
    }
}
