package model;

import assignment3.enums.ClaspEnum;
import assignment3.enums.ColorEnum;
import assignment3.enums.FabricEnum;
import assignment3.enums.SizeEnum;
import java.util.Scanner;
import services.TShirtOrderCreation;
import services.TrouserOrderCreation;

/**
 *
 * @author stkou
 */
public class Menu {

    public Menu menu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to get in app " + " or 0 to Terminate");
        int choice = sc.nextInt();
        while ((choice) != 1 && (choice) != 0) {
            System.out.println("Wrong Input plz try again: ");
            choice = sc.nextInt();
        }

        if (choice != 0) {
            System.out.println("Press 1 for new TShirt " + "or 2 for new Trouser");
            int choice2 = sc.nextInt();
            do {
                if (choice2 == 1) {

                    ColorEnum ce = TShirtOrderCreation.ClientChoiceColor();
                    SizeEnum se = TShirtOrderCreation.ClientChoiceSize();
                    FabricEnum fe = TShirtOrderCreation.ClientChoiceFabric();
                    TShirtOrderCreation.createTShirt(ce, se, fe);
                    break;
                    
                } else if (choice2 == 2) {
                    ClaspEnum cle = TrouserOrderCreation.ClientChoiceClasp();
                    ColorEnum tce = TrouserOrderCreation.ClientChoiceColor();
                    SizeEnum tse = TrouserOrderCreation.ClientChoiceSize();
                    FabricEnum tfe = TrouserOrderCreation.ClientChoiceFabric();
                    TrouserOrderCreation.createTrouser(cle, tce, tse, tfe);
                    break;
                }

            } while (choice != 0);
            System.out.println("Terminatation");
        } else {
            System.out.println("Termination");
        }
        Menu menu = new Menu();
        return menu;
    }
}
