package services;

import assignment3.enums.ColorEnum;
import assignment3.enums.FabricEnum;
import assignment3.enums.SizeEnum;
import java.util.Scanner;

import model.TShirt;

/**
 *
 * @author stkou
 */
public class TShirtOrderCreation {

    //COLOR CHOICE //
    public static ColorEnum ClientChoiceColor() {

        
        TShirt tshirt;

        tshirt = new TShirt();

        System.out.println("Select from the color pallete below: ");

        
        ColorEnum[] c = ColorEnum.values();
        for (int i = 0; i < c.length; i++) {
            ColorEnum c1 = c[i];

            System.out.println(i + ". " + c1.toString());

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Select the corresponding number of color: ");
        int input = sc.nextInt();

        if (input >= 0 && input <= c.length) {
                tshirt.setColor(c[input]);
               
                return c[input];
        } else {
            System.out.println("Choose Again! Wrong Input: ");
            ClientChoiceColor();
            return null;
        }
    }
    
    
    //SIZE CHOICE //
     public static SizeEnum ClientChoiceSize() {

        TShirt tshirt;

        tshirt = new TShirt();

        System.out.println("Select from the size below: ");

        SizeEnum[] c = SizeEnum.values();
        for (int i = 0; i < c.length; i++) {
            SizeEnum c1 = c[i];
            
            System.out.println(i + ". " + c1.toString());
             
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Select the corresponding number of size: ");
        int input = sc.nextInt();

        if (input >= 0 && input <= c.length) {
                tshirt.setSize(c[input]);
                return c[input];
        } else {
            System.out.println("Choose Again! Wrong Input: ");
            ClientChoiceSize();
            return null;
        }
    }
     
     
     //FABRIC CHOICE //
      public static FabricEnum ClientChoiceFabric() {

//        List<TShirt> tshirtlist = new ArrayList<TShirt>();
        TShirt tshirt;

        tshirt = new TShirt();

        System.out.println("Select from the fabric pallete below: ");

        FabricEnum[] c = FabricEnum.values();
        for (int i = 0; i < c.length; i++) {
            FabricEnum c1 = c[i];

            System.out.println(i + ". " + c1.toString());

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Select the corresponding number of fabric: ");
        int input = sc.nextInt();

        if (input >= 0 && input <= c.length) {
                tshirt.setFabric(c[input]);
                return c[input];
        } else {
            System.out.println("Choose Again! Wrong Input: ");
            ClientChoiceFabric();
            return null;
        }
    }
      
      
      public static TShirt createTShirt(ColorEnum ce, SizeEnum se, FabricEnum fe) {
          
          TShirt tshirt = new TShirt(ce, se, fe);
          
          System.out.println("TShirt created!" + tshirt);
          
          return tshirt;
      }
}

