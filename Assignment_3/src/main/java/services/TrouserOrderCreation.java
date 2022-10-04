package services;

import assignment3.enums.ClaspEnum;
import assignment3.enums.ColorEnum;
import assignment3.enums.FabricEnum;
import assignment3.enums.SizeEnum;
import java.util.Scanner;
import model.Trouser;

/**
 *
 * @author stkou
 */
public class TrouserOrderCreation {

    // Clasp Choice //
    public static ClaspEnum ClientChoiceClasp() {

        Trouser trouser;
        trouser = new Trouser();

        System.out.println("Select from the clasp pallete below: ");

        ClaspEnum[] c = ClaspEnum.values();
        for (int i = 0; i < c.length; i++) {
            ClaspEnum c1 = c[i];

            System.out.println(i + ". " + c1.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Select the corresponding number of clasp: ");
        int input = sc.nextInt();

        if (input >= 0 && input <= c.length) {
            trouser.setClasp(c[input]);

            return c[input];

        } else {
            System.out.println("Choose Again! Wrong Input: ");
            ClientChoiceClasp();
            return null;
        }
    }

    //COLOR CHOICE //
    public static ColorEnum ClientChoiceColor() {
        Trouser trouser = new Trouser();

        System.out.println("Select from the color pallete below: ");

        ColorEnum[] ce = ColorEnum.values();
        for (int i = 0; i < ce.length; i++) {
            ColorEnum c1 = ce[i];

            System.out.println(i + ". " + c1.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Select the corresponding number of color: ");
        int input = sc.nextInt();

        if (input >= 0 && input < ce.length) {
            trouser.setColor(ce[input]);

            return ce[input];
        } else {

            System.out.println("Choose Again! Wrong Input: ");
            ClientChoiceColor();
            return null;
        }
    }

    //SIZE CHOICE //
    public static SizeEnum ClientChoiceSize() {

        Trouser trouser = new Trouser();

        System.out.println("Select from the size below: ");

        SizeEnum[] se = SizeEnum.values();
        for (int i = 0; i < se.length; i++) {
            SizeEnum s1 = se[i];

            System.out.println(i + ". " + s1.toString());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the corresponding number of size: ");
        int input = sc.nextInt();
        
        if (input >= 0 && input < se.length) {
            trouser.setSize(se[input]);
            
            return se[input];
        } else {
        
            System.out.println("Choose Again! Wrong Input: ");
            ClientChoiceSize();
            return null;
        }
    }
    
    
    //FABRIC CHOICE //
    public static FabricEnum ClientChoiceFabric() {
    
        Trouser trouser = new Trouser();
        
        System.out.println("Select from the fabric pallete below: ");
        
        FabricEnum[] fe = FabricEnum.values();
        for (int i = 0; i < fe.length; i++) {
            FabricEnum f = fe[i];
            
            System.out.println(i + ". " + f.toString());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the corresponding number of fabric: ");
        int input = sc.nextInt();
        
        if(input >= 0 && input < fe.length) {
        trouser.setFabric(fe[input]);
        
        return fe[input];
        } else {
        
            System.out.println("Choose Again! Wrong Input: ");
            ClientChoiceFabric();
            return null;
        }  
    }
    
    // Create Trouser //
    public static Trouser createTrouser(ClaspEnum tce, ColorEnum ce, SizeEnum se, FabricEnum fe) {
    
        Trouser trouser = new Trouser(tce, ce, se, fe);
        
        System.out.println("Trouser created!" + trouser);
        
        return trouser;
    }
    
}
