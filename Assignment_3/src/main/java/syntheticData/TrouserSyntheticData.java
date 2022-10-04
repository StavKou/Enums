package syntheticData;

import assignment3.enums.ClaspEnum;
import assignment3.enums.ColorEnum;
import assignment3.enums.FabricEnum;
import assignment3.enums.SizeEnum;
import java.util.List;
import model.OrderTrouser;
import model.Trouser;

/**
 *
 * @author stkou
 */
public class TrouserSyntheticData {
    
    public static List<Trouser> allTrousers() {
    
        OrderTrouser order = new OrderTrouser();
        for (ClaspEnum clasp : ClaspEnum.values()) {
            for (ColorEnum color : ColorEnum.values()) {
                for (SizeEnum size : SizeEnum.values()) {
                    for (FabricEnum fabric : FabricEnum.values()) {
                        Trouser trouser = new Trouser(clasp, color, size, fabric);
                        order.addTrouser(trouser);
                    }
                }
            }
        }
        return order.getList2();
    }
}
