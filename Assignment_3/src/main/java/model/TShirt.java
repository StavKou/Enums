/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import assignment3.enums.ColorEnum;
import assignment3.enums.FabricEnum;
import assignment3.enums.SizeEnum;

/**
 *
 * @author stkou
 */
public class TShirt {
    
    private ColorEnum color;
    private SizeEnum size;
    private FabricEnum fabric;

    // Constructors //
    public TShirt() {
    }

    
    
    public TShirt(ColorEnum color, SizeEnum size, FabricEnum fabric) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

   
 
    //TSHIRT SERVICE //
     public double getPrice() {
        return this.color.getPrice()
                + this.size.getPrice()
                + this.fabric.getPrice();        
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public SizeEnum getSize() {
        return size;
    }

    public void setSize(SizeEnum size) {
        this.size = size;
    }

    public FabricEnum getFabric() {
        return fabric;
    }

    public void setFabric(FabricEnum fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TShirt{color=").append(color);
        sb.append(", size=").append(size);
        sb.append(", fabric=").append(fabric);
        sb.append('}');
        return sb.toString();
    }

    

}
