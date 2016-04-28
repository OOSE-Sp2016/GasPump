/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Communicating with the bank
*/
package CardServices;

public class BankServices {
    /* get card type from bank */
    public CardType requestCardType(String number) {
        /* for testing purposes, if first char is 'c' then credit,
            if first char is 'd' then debit. Normally bank verification would
            happen here
        */
        CardType type;
      
        if (number.charAt(0) == 'c') {
            type = CardType.CREDIT;
        } else {
            type = CardType.DEBIT;
        }
        
        return type;
    }
    
    public Card verifyCardAndBalance(String number, 
            String pinorzip, CardType type) {
        Card card = new Card(number, pinorzip, type);
        
        /* bank verification would happen here */
        
        return card;
    }
    
    public void chargeCard() {
        /* charge the card */
    }
}
