package payments;

/**
 *
 * @author stkou
 */
public class Cash implements PaymentInterface{

    @Override
    public void pay(double price) {
        
        System.out.println("Payment With Cash Complete");
    }
    
}
