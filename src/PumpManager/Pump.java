/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Pump functions
*/
package PumpManager;

import CardServices.Card;
import CardServices.CardType;

public class Pump {
    private boolean cardsAllowed = true;
    private boolean enabled = true;
    private boolean inUse = true;
    private Card pendingCard;
    private float prepay;
    private int pumpId = 1;
    
    private void beginPumping(float maxTotal) {
        
    }
    
    private void endPumping() {
        
    }
    
    public void displayPrepay() {
        
    }
    
    public void displayPrices() {
        
    }
    
    public void displayTotal() {
        
    }
    
    public void enterPIN (String pin) {
        
    }
    
    public void enterZip (String zip) {
        
    }
    
    public boolean getCardsAllowed() {
        return cardsAllowed;
    }
    
    public boolean getEnabled() {
        return enabled;
    }
    
    public int getId() {
        return pumpId;
    }
    
    public boolean getInUse() {
        return inUse;
    }
    
    public void handleRemoved (GasType type) {
        
    }
    
    public void handleReturned () {
        
    }
    
    public void informTypeAndRequestPINOrZip (CardType type) {
        
    }
    
    public void prepay(float total) {
        
    }
    
    public void printReceipt() {
        
    }
    
    public void selectGasType (GasType type) {
        
    }
    
    public void setEnabled(boolean enable) {
        enabled = enable;
    }
    
    public void setCardsAllowed(boolean allow) {
        cardsAllowed = allow;
    }
    
    public void swipeCreditCard (String cardNumber) {
        
    }
}
