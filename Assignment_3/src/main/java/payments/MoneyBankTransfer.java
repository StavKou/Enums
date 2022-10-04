/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payments;

/**
 *
 * @author stkou
 */
public class MoneyBankTransfer implements PaymentInterface{

    @Override
    public void pay(double price) {
        
        System.out.println("Payment With Bank Transfer is Complete");
    }
    
}
