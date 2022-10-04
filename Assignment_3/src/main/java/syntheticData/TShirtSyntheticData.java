package syntheticData;

import assignment3.enums.ColorEnum;
import assignment3.enums.FabricEnum;
import assignment3.enums.SizeEnum;
import java.util.List;
import model.OrderTShirt;
import model.TShirt;

/**
 *
 * @author stkou
 */
public class TShirtSyntheticData {

    public static List<TShirt> allTShirts() {

        OrderTShirt order = new OrderTShirt();
        for (ColorEnum color : ColorEnum.values()) {
            for (SizeEnum size : SizeEnum.values()) {
                for (FabricEnum fabric : FabricEnum.values()) {
                    TShirt tshirt = new TShirt(color, size, fabric);

                    //add to order //
                    order.addTShirt(tshirt);
                }
            }
        }
        return order.getList();
    }

}
