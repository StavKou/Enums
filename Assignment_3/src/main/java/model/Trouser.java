package model;

import assignment3.enums.ClaspEnum;
import assignment3.enums.ColorEnum;
import assignment3.enums.FabricEnum;
import assignment3.enums.SizeEnum;

/**
 *
 * @author stkou
 */
public class Trouser {
    
    private ClaspEnum clasp;
    private ColorEnum color;
    private SizeEnum size;
    private FabricEnum fabric;
    
    // Constructors //

    public Trouser() {
    }

    public Trouser(ClaspEnum clasp, ColorEnum color, SizeEnum size, FabricEnum fabric) {
        this.clasp = clasp;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }
    
    
    // Trouser Service //
    
    public double getPrice() {
        return this.clasp.getPrice()
                + this.color.getPrice()
                + this.fabric.getPrice()
                + this.size.getPrice();
    }

    public ClaspEnum getClasp() {
        return clasp;
    }

    public void setClasp(ClaspEnum clasp) {
        this.clasp = clasp;
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
        sb.append("Trouser{clasp=").append(clasp);
        sb.append(", color=").append(color);
        sb.append(", size=").append(size);
        sb.append(", fabric=").append(fabric);
        sb.append('}');
        return sb.toString();
    }
    
}
