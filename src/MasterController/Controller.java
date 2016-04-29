/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Main Controller class
*/

package MasterController;

import CardServices.Card;
import CardServices.CardType;
import GUISimulation.ControllerSimulatedFuncs;
import GUISimulation.ControllerJFrame;
import GUISimulation.GUIListener;
import PumpManager.GasType;
import java.text.DecimalFormat;
import PumpManager.Pump;

public class Controller implements GUIListener {
    private ControllerJFrame GUIObj;
    private ControllerSimulatedFuncs Simulator;
    private double RegularPrice;
    private double PlusPrice;
    private double PremiumPrice;
    private double CurrentPrice;
    private String PIN;
    private String ZIP;
    private States State;
    private int pumpCount;
    private Pump[] pumps;
    private CardType type = CardType.CREDIT;
    
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
        SELECT_GAS_TYPE, HANDLE_ON, HANDLE_OFF_PUMP_OFF, PUMP_ON, 
        RECEIPT_RESPONSE,
    };

    /* constructor - initialize variables */
    public Controller() {
        State = States.WAITING_FOR_SWIPE;
        
        RegularPrice = 2.19;
        PlusPrice = 2.29;
        PremiumPrice = 2.39;
        
        PIN = "";
        ZIP = "";
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
                promptReceipt();
        } else if (State == States.PUMP_ON) {
            if (type == GUIEventType.BUTTONPUMPSTART)
                pumpStopped();
        } else if (State == States.RECEIPT_RESPONSE) {
        	if(type == GUIEventType.BUTTONYES){
        		printReceipt();
        	}
        	else if(type == GUIEventType.BUTTONNO){
        		noReceipt();
        	}
        		
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
        
        GUIObj.displayTextArea.setText("Enter ZIP:");
        State = States.ENTER_ZIP;
    }
    
    /* Debit card selected not credit */
    private void debitSelected() {
        /* do some bank stuff here */
        
        GUIObj.displayTextArea.setText("Enter PIN:");
        State = States.ENTER_PIN;
    }
    
    /* Button push for pin number */
    private void handlePinButton(GUIEventType type) {
        /* handle the pin stuff per button */
    	
    	String pinDisplay = "";
    	if(type == GUIEventType.BUTTONCANCEL){
    		State = States.WAITING_FOR_SWIPE;
    	}
    	else if(type == GUIEventType.BUTTONENTER){
    		/* on successful entry move state along */
    		if(PIN.length() >= 4){
    	        DecimalFormat numberFormat = new DecimalFormat("#.00");
    	        GUIObj.jTextFieldRegular.setText(numberFormat.format(RegularPrice));
    	        GUIObj.jTextFieldPlus.setText(numberFormat.format(PlusPrice));
    	        GUIObj.jTextFieldPremium.setText(numberFormat.format(PremiumPrice));
    	        GUIObj.displayTextArea.setText("Select gas type");
    	        State = States.SELECT_GAS_TYPE;
    		}
    		/* else clear pin and start over at current state */
    		else{
    			PIN = "";
    			GUIObj.displayTextArea.setText("Invalid PIN, try again");
    		}

    	}
    	/* contains the logic for attaining the PIN via numpad */
    	else{
			if(type == GUIEventType.BUTTON0) {
				PIN = PIN.concat("0");
			}
			else if (type == GUIEventType.BUTTON1){
				PIN = PIN.concat("1");
			}
			else if (type == GUIEventType.BUTTON2){
				PIN = PIN.concat("2");
			}
			else if (type == GUIEventType.BUTTON3){
				PIN = PIN.concat("3");
			}
			else if (type == GUIEventType.BUTTON4){
				PIN = PIN.concat("4");
			}
			else if (type == GUIEventType.BUTTON5){
				PIN = PIN.concat("5");
			}
			else if (type == GUIEventType.BUTTON6){
				PIN = PIN.concat("6");
			}
			else if (type == GUIEventType.BUTTON7){
				PIN = PIN.concat("7");
			}
			else if (type == GUIEventType.BUTTON8){
				PIN = PIN.concat("8");
			}
			else if (type == GUIEventType.BUTTON9){
				PIN = PIN.concat("9");
			}
			else if (type == GUIEventType.BUTTONCLEAR){
				PIN = "";
			}
			for(int i = 0; i < PIN.length(); i++){
				pinDisplay = pinDisplay.concat("*");
			}
			GUIObj.displayTextArea.setText("Enter PIN:" + pinDisplay);
	    }
    
    }
    
    /* Button push for zip */
    private void handleZipButton(GUIEventType type) {
        /* handle the zip stuff per button */
    	
    	if(type == GUIEventType.BUTTONCANCEL){
    		State = States.WAITING_FOR_SWIPE;
    	}
    	else if(type == GUIEventType.BUTTONENTER){
    		/* on successful entry move state along */
    		if(ZIP.length() == 5){
    	        DecimalFormat numberFormat = new DecimalFormat("#.00");
    	        GUIObj.jTextFieldRegular.setText(numberFormat.format(RegularPrice));
    	        GUIObj.jTextFieldPlus.setText(numberFormat.format(PlusPrice));
    	        GUIObj.jTextFieldPremium.setText(numberFormat.format(PremiumPrice));
    	        GUIObj.displayTextArea.setText("Select gas type");
    	        State = States.SELECT_GAS_TYPE;
    		}
    		/* else clear ZIP and start over at current state */
    		else{
    			ZIP = "";
    			GUIObj.displayTextArea.setText("Invalid ZIP, try again");
    		}

    	}
    	/* contains the logic for attaining the ZIP via numpad */
    	else{
			if(type == GUIEventType.BUTTON0) {
				ZIP = ZIP.concat("0");
			}
			else if (type == GUIEventType.BUTTON1){
				ZIP = ZIP.concat("1");
			}
			else if (type == GUIEventType.BUTTON2){
				ZIP = ZIP.concat("2");
			}
			else if (type == GUIEventType.BUTTON3){
				ZIP = ZIP.concat("3");
			}
			else if (type == GUIEventType.BUTTON4){
				ZIP = ZIP.concat("4");
			}
			else if (type == GUIEventType.BUTTON5){
				ZIP = ZIP.concat("5");
			}
			else if (type == GUIEventType.BUTTON6){
				ZIP = ZIP.concat("6");
			}
			else if (type == GUIEventType.BUTTON7){
				ZIP = ZIP.concat("7");
			}
			else if (type == GUIEventType.BUTTON8){
				ZIP = ZIP.concat("8");
			}
			else if (type == GUIEventType.BUTTON9){
				ZIP = ZIP.concat("9");
			}
			else if (type == GUIEventType.BUTTONCLEAR){
				ZIP = "";
			}
			GUIObj.displayTextArea.setText("Enter ZIP:" + ZIP);
	    }
    }
    
    /* select regular */
    private void selectRegular() {
        CurrentPrice = RegularPrice;
        Simulator.setGasCost(RegularPrice);
        GUIObj.displayTextArea.setText("Regular selected, remove handle when ready");
        
        State = States.HANDLE_ON;
    }
    
    /* select plus */
    private void selectPlus() {
        CurrentPrice = PlusPrice;
        Simulator.setGasCost(PlusPrice);
        GUIObj.displayTextArea.setText("Plus selected, remove handle when ready");
        
        State = States.HANDLE_ON;
    }
    
    /* select premium */
    private void selectPremium() {
        CurrentPrice = PremiumPrice;
        Simulator.setGasCost(PremiumPrice);
        GUIObj.displayTextArea.setText("Premium selected, remove handle when ready");
        
        State = States.HANDLE_ON;
    }
    
    /* handle removed */
    private void handleOff() {
    	GUIObj.displayTextArea.setText("Press Start/Stop Pump to begin pumping");
        State = States.HANDLE_OFF_PUMP_OFF;
    }
    
    /* start the pump */
    private void pumpStarted() {
        Simulator.startPump();
        GUIObj.displayTextArea.setText("Gas pumping...");
        State = States.PUMP_ON;
    }
    
    /* stop the pump */
    private void pumpStopped() {
        Simulator.stopPump();
        GUIObj.displayTextArea.setText("Pumping complete, please replace handle");
        State = States.HANDLE_OFF_PUMP_OFF;
    }
    
    /* ask if the user wants their receipt */
    private void promptReceipt() {
    	GUIObj.displayTextArea.setText("Do you want your receipt? (yes or no)");
    	State = States.RECEIPT_RESPONSE;
	}
    
    /* user chose to receive no receipt */
    private void noReceipt() {
        GUIObj.displayTextArea.setText("Have a nice day!");
    }

    /* give user receipt */
    private void printReceipt() {
        GUIObj.displayTextArea.setText("Receipt printed, have a nice day!");
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
    
    private void logTransaction(int pumpId, GasType type, float volume,
            Card card) {
        
    }
    
    public void cancelTransaction(int pumpId) {
        
    }
    
    public void informFinalTotal(int pumpId, GasType type, float volume,
            Card card) {
        
    }
    
    public void informPrepay(int pumpId, float total) {
        
    }
    
    public CardType requestCardType(String cardNumber) {
        return type;
    }
    
    public void setPumpCardsAllowed(boolean allow) {
        
    }
    
    public void setPumpEnabled(boolean enable) {
        
    }
    
    public Card verifyPIN(int pumpId, Card card) {
        return card;
    }
    
    public Card verifyZIP(int pumpId, Card card) {
        return card;
    }
}
