package model;

import java.util.ArrayList;
import java.util.List;
import payments.Cash;
import payments.CreditDebitCard;
import payments.MoneyBankTransfer;
import payments.PaymentInterface;
import syntheticData.TrouserSyntheticData;

/**
 *
 * @author stkou
 */
public class OrderTrouser {
    
    private List<Trouser> list2;
    
    // Constructor //
    public OrderTrouser () {
        list2 = new ArrayList<Trouser>();
    }

    // Getter //
    public List<Trouser> getList2() {
        return list2;
    }

    // Setter //
    public void setList2(List<Trouser> list2) {
        this.list2 = list2;
    }
    
    
    // Service //
    
    // Add Trouser //
    public void addTrouser(Trouser trouser) {
        list2.add(trouser);
    }
    
    
    // Delete Trouser //
    public void deleteTrouser(Trouser trouser) {
        list2.remove(trouser);
    }
    
    
    // Total Amount //
    public double getTotalAmount() {
        double totalAmount = 0.0;

        for (Trouser currentTrouser : TrouserSyntheticData.allTrousers()) {
            totalAmount += currentTrouser.getPrice();
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
