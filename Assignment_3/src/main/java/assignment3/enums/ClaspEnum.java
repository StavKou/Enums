package assignment3.enums;

/**
 *
 * @author stkou
 */
public enum ClaspEnum {
    
    ZIPPER(0.5),
    BUTTON(1.0);
    
    private double price;
    
    // Constructor //
    private ClaspEnum(double price) {
        this.price = price;  
    }
    
    // Getter //
    public double getPrice() {
    return price;
    }
    
    
}
