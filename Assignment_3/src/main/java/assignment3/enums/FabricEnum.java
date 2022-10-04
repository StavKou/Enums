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
public enum FabricEnum {
    
    WOOL(12),
    COTTON(14),
    POLYESTER(15),
    RAYON(18),
    LINNEN(22),
    CASMIR(30),
    SILK(31);
    
    private double price;

    private FabricEnum() {
    }

    private FabricEnum(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    
}
