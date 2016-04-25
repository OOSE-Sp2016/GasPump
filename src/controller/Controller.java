/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Main Controller class
*/

package controller;

import gasPumpMain.GUIListener;

public class Controller implements GUIListener {
    private ControllerJFrame GUIObj;
    
    public enum GUIEventType
    {
        BUTTON1, BUTTON2, BUTTON3, BUTTON4, BUTTON5,
        BUTTON6, BUTTON7, BUTTON8, BUTTON9, BUTTON0,
        BUTTONCLEAR, BUTTONENTER, BUTTONYES, BUTTONNO, BUTTONCANCEL,
        BUTTONREGULAR, BUTTONPLUS, BUTTONPREMIUM,
        BUTTONDEBIT, BUTTONCREDIT, BUTTONSWIPE,
        BUTTONHANDLE, BUTTONPUMPSTART
    };
    
    @Override
    public void GUIEvent(GUIEventType type) {
        GUIObj.displayTextArea.setText("got button event");
    }
    
    public void SetGUIObj(ControllerJFrame obj) {
        GUIObj = obj;
    }
}
