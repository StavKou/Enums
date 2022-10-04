package assignment3.enums;

/**
 *
 * @author stkou
 */
public enum ColorEnum {

    RED(0.5),
    ORANGE(0.8),
    YELLOW(0.9),
    GREEN(0.4),
    BLUE(0.3),
    INDIGO(0.7),
    VIOLET(0.8);

    private double price;
    

    private ColorEnum(double price) {
        this.price = price;    
    }

   
    public double getPrice() {
        return price;
    }
}
