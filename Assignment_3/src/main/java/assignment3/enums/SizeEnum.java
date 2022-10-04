/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3.enums;

/**
 *
 * @author stkou
 */
public enum SizeEnum {
    
    XS(1.2),
    S(1.3),
    M(1.4),
    L(1.5),
    XL(1.6),
    XXL(1.7),
    XXXL(2);

    private double price;

    private SizeEnum() {
    }

    private SizeEnum(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    
    
}
