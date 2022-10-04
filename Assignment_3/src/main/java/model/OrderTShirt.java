package model;

import java.util.ArrayList;
import java.util.List;
import payments.Cash;
import payments.CreditDebitCard;
import payments.MoneyBankTransfer;
import payments.PaymentInterface;
import syntheticData.TShirtSyntheticData;

/**
 *
 * @author stkou
 */
public class OrderTShirt {

    private List<TShirt> list;

    // Constructor //
    public OrderTShirt() {
        list = new ArrayList<TShirt>();
    }


    public List<TShirt> getList() {
        return list;
    }

    public void setList(List<TShirt> list) {
        this.list = list;
    }

    // SERVICES //
    
    // ADD TSHIRT //
    public void addTShirt(TShirt tshirt) {

        list.add(tshirt);
    }

    // DELETE TSHIRT //
    public void deleteTShirt(TShirt tshirt) {

        list.remove(tshirt);
    }

    // TOTAL AMOUNT //
    public double getTotalAmount() {
        double totalAmount = 0.0;

        for (TShirt currentTshirt : TShirtSyntheticData.allTShirts()) {
            totalAmount += currentTshirt.getPrice();
        }

        return totalAmount;
    }

    // CHECKOUT //
    public void checkout(PaymentInterface paymentMethod) {

        double totalAmount = getTotalAmount();
        
        paymentMethod.pay(totalAmount);
    }
    
    
   // SWITCH CASE PAYMENTMETHOD //
   public void PaymentMethod(int paymentselection) {
    
       
       switch(paymentselection) {
       
           case 1:
               checkout(new Cash());
               break;
               
           case 2:
               checkout(new CreditDebitCard());
               break;
               
           case 3:
               checkout(new MoneyBankTransfer());
               break;
               
           default:
               System.out.println("Error!");
               break;
       }
    }
   
   
}
