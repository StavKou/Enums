import assignment3.enums.ClaspEnum;
import assignment3.enums.ColorEnum;
import assignment3.enums.FabricEnum;
import assignment3.enums.SizeEnum;
import java.util.List;
import model.Menu;
import model.TShirt;
import model.Trouser;
import services.TShirtOrderCreation;
import services.TrouserOrderCreation;
import syntheticData.TShirtSyntheticData;
import syntheticData.TrouserSyntheticData;

/**
 *
 * @author stkou
 */
public class EnumsClothes {

    public static void main(String[] args) {

        // 1 //
//        double e = ColorEnum.BLUE.getPrice();
//        System.out.println(e);

        // 2 //
//        List<TShirt> tshirt = TShirtSyntheticData.allTShirts();
//
//        for (int i = 0; i < tshirt.size(); i++) {
//            System.out.println(tshirt.get(i));
//        }
//        
//        List<Trouser> trouser = TrouserSyntheticData.allTrousers();
//        
//        for (int i = 0; i < trouser.size(); i++) {
//            System.out.println(trouser.get(i));
//        }


        // 3 // 
        // Total Amount //
//        Order order = new Order();
//        order.PaymentMethod(1);
//        System.out.println(order.getTotalAmount());

        // 4 //
        // Create TShirt And Trouser //
//        ColorEnum ce = TShirtOrderCreation.ClientChoiceColor();
//        SizeEnum se = TShirtOrderCreation.ClientChoiceSize();
//        FabricEnum fe = TShirtOrderCreation.ClientChoiceFabric();
//        
//        ClaspEnum cle = TrouserOrderCreation.ClientChoiceClasp();
//        ColorEnum tce = TrouserOrderCreation.ClientChoiceColor();
//        SizeEnum tse = TrouserOrderCreation.ClientChoiceSize();
//        FabricEnum tfe = TrouserOrderCreation.ClientChoiceFabric();

        // 5 //
//        TShirtOrderCreation.createTShirt(ce, se, fe);
//        TrouserOrderCreation.createTrouser(cle, tce, tse, tfe);


        Menu mainMenu = new Menu();
        mainMenu.menu();

    }

}
