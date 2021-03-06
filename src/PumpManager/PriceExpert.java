/*
CS 6329.001 Spring 2016

Grant Ledford 
Hendra Suteja
Joseph Fox 
Katie Patterson 

Handles prices of gas
*/
package PumpManager;

public class PriceExpert {
    private final float RegularPrice = (float) 2.19;
    private final float PlusPrice = (float) 2.29;
    private final float SupremePrice = (float) 2.39;
    private final float TaxRate = (float) .08;
    
    /* return price per gallon of gas based on type */
    public float getPricePerGallon(GasType type) {
        float price = 0;
        if (type == GasType.REGULAR) {
            price = RegularPrice;
        } else if (type == GasType.PLUS) {
            price = PlusPrice;
        } else if (type == GasType.SUPREME) {
            price = SupremePrice;
        }
        
        return price;
    }
    
    /* return tax rate for gas */
    public float getTaxPerGallon(GasType type) {
        return TaxRate;
    }
}
