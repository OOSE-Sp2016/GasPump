/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Handle card functions
*/
package CardServices;

public class Card {
    private String number;
    private String PINorZip;
    private CardType type;

    public Card(String numb, String pinorzip, CardType type) {
        this.number = numb;
        this.PINorZip = pinorzip;
        this.type = type;
    }
    
    public String getNumber() {
        return number;
    }
    
    public String getPINorZip () {
        return PINorZip;
    }
    
    public CardType getType () {
        return type;
    }
}
