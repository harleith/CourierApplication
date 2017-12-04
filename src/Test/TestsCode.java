package Test;

import DAO.DeliveryCostLib;
import entitas.HargaPengiriman;
import java.util.List;

public class TestsCode {
public static void main(String[] args) {
        List<HargaPengiriman> cost = DeliveryCostLib.costLib();
        
        for (HargaPengiriman hargaPengiriman : cost) {
            System.out.println("Kota :"+hargaPengiriman.getDestinasi());
        }
    }
    
}
