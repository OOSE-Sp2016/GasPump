/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

GUIListener interface
*/
package GUISimulation;
import MasterController.Controller.GUIEventType;

public interface GUIListener {
    void GUIEvent(GUIEventType type);
}
