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
import java.text.DecimalFormat;

public class Controller implements GUIListener {
    private ControllerJFrame GUIObj;
    private ControllerSimulatedFuncs Simulator;
    private double RegularPrice;
    private double PlusPrice;
    private double PremiumPrice;
    private double CurrentPrice;
    private States State;
    
    public enum GUIEventType
    {
        BUTTON1, BUTTON2, BUTTON3, BUTTON4, BUTTON5,
        BUTTON6, BUTTON7, BUTTON8, BUTTON9, BUTTON0,
        BUTTONCLEAR, BUTTONENTER, BUTTONYES, BUTTONNO, BUTTONCANCEL,
        BUTTONREGULAR, BUTTONPLUS, BUTTONPREMIUM,
        BUTTONDEBIT, BUTTONCREDIT, BUTTONSWIPE,
        BUTTONHANDLE, BUTTONPUMPSTART
    };
    
    private enum States {
        WAITING_FOR_SWIPE, SELECT_DEBIT_CREDIT, ENTER_PIN, ENTER_ZIP,
        SELECT_GAS_TYPE, HANDLE_ON, HANDLE_OFF_PUMP_OFF, PUMP_ON, HANDLE_RETURN
    };

    /* constructor - initialize variables */
    public Controller() {
        State = States.WAITING_FOR_SWIPE;
        
        RegularPrice = 2.19;
        PlusPrice = 2.29;
        PremiumPrice = 2.39;
    }
    
    /* GUI event */
    @Override
    public void GUIEvent(GUIEventType type) {
        if (State == States.WAITING_FOR_SWIPE) {
            if (type == GUIEventType.BUTTONSWIPE)
                cardSwiped();
        } else if (State == States.SELECT_DEBIT_CREDIT) {
            if (type == GUIEventType.BUTTONCREDIT)
                creditSelected();
            else if (type == GUIEventType.BUTTONDEBIT)
                debitSelected();
        } else if (State == States.ENTER_PIN) {
            handlePinButton(type);
        } else if (State == States.ENTER_ZIP) {
            handleZipButton(type);
        } else if (State == States.SELECT_GAS_TYPE) {
            if (type == GUIEventType.BUTTONREGULAR) 
                selectRegular();
            else if (type == GUIEventType.BUTTONPLUS) 
                selectPlus();
            else if (type == GUIEventType.BUTTONPREMIUM) 
                selectPremium();
        } else if (State == States.HANDLE_ON) {
            if (type == GUIEventType.BUTTONHANDLE) 
                handleOff();
        } else if (State == States.HANDLE_OFF_PUMP_OFF) {
            if (type == GUIEventType.BUTTONPUMPSTART)
                pumpStarted();
            else if (type == GUIEventType.BUTTONHANDLE) 
                handleReturned();
        } else if (State == States.PUMP_ON) {
            if (type == GUIEventType.BUTTONPUMPSTART)
                pumpStopped();
        } else if (State == States.HANDLE_RETURN) {
            
        } else {
            
        }
    }
    
    /* Card swiped */
    private void cardSwiped() {
        /* do some bank stuff here */
        
        GUIObj.displayTextArea.setText("Select CREDIT or DEBIT");
        State = States.SELECT_DEBIT_CREDIT;
    }
    
    /* Credit card selected not debit */
    private void creditSelected() {
        /* do some bank stuff here */
        
        GUIObj.displayTextArea.setText("Enter ZIP");
        State = States.ENTER_ZIP;
    }
    
    /* Debit card selected not credit */
    private void debitSelected() {
        /* do some bank stuff here */
        
        GUIObj.displayTextArea.setText("Enter PIN");
        State = States.ENTER_PIN;
    }
    
    /* Button push for pin number */
    private void handlePinButton(GUIEventType type) {
        /* handle the pin stuff per button */
        
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        GUIObj.jTextFieldRegular.setText(numberFormat.format(RegularPrice));
        GUIObj.jTextFieldPlus.setText(numberFormat.format(PlusPrice));
        GUIObj.jTextFieldPremium.setText(numberFormat.format(PremiumPrice));
        GUIObj.displayTextArea.setText("Select gas type");
        State = States.SELECT_GAS_TYPE;
    }
    
    /* Button push for zip */
    private void handleZipButton(GUIEventType type) {
        /* handle the zip stuff per button */
        
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        GUIObj.jTextFieldRegular.setText(numberFormat.format(RegularPrice));
        GUIObj.jTextFieldPlus.setText(numberFormat.format(PlusPrice));
        GUIObj.jTextFieldPremium.setText(numberFormat.format(PremiumPrice));
        GUIObj.displayTextArea.setText("Select gas type");
        State = States.SELECT_GAS_TYPE;
    }
    
    /* select regular */
    private void selectRegular() {
        CurrentPrice = RegularPrice;
        Simulator.setGasCost(RegularPrice);
       
        State = States.HANDLE_ON;
    }
    
    /* select plus */
    private void selectPlus() {
        CurrentPrice = PlusPrice;
        Simulator.setGasCost(PlusPrice);
        
        State = States.HANDLE_ON;
    }
    
    /* select premium */
    private void selectPremium() {
        CurrentPrice = PremiumPrice;
        Simulator.setGasCost(PremiumPrice);
        
        State = States.HANDLE_ON;
    }
    
    /* handle removed */
    private void handleOff() {
        
        State = States.HANDLE_OFF_PUMP_OFF;
    }
    
    /* start the pump */
    private void pumpStarted() {
        Simulator.startPump();
        
        State = States.PUMP_ON;
    }
    
    /* stop the pump */
    private void pumpStopped() {
        Simulator.stopPump();
        
        State = States.HANDLE_OFF_PUMP_OFF;
    }
    
    /* handle has been returned */
    private void handleReturned() {
        State = States.HANDLE_RETURN;
    }
    
    /* setters and getters */
    public void setGUIObj(ControllerJFrame obj) {
        GUIObj = obj;
    }
    
    public void setSimulatedObj(ControllerSimulatedFuncs obj) {
        Simulator = obj;
    }
    
    public double getRegularPrice() {
        return RegularPrice;
    }

    public void setRegularPrice(double RegularPrice) {
        this.RegularPrice = RegularPrice;
    }

    public double getPlusPrice() {
        return PlusPrice;
    }

    public void setPlusPrice(double PlusPrice) {
        this.PlusPrice = PlusPrice;
    }

    public double getPremiumPrice() {
        return PremiumPrice;
    }

    public void setPremiumPrice(double PremiumPrice) {
        this.PremiumPrice = PremiumPrice;
    }
}
