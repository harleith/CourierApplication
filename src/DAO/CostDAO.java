package DAO;

import entitas.DataPengiriman;
import entitas.HargaPengiriman;
import java.util.List;

public class CostDAO {

    private double hargaAsuransi = 0.003;

    public double calculateAsuransi(DataPengiriman dataPengiriman) {
        double totalBayar = 0.0;

        double costdest = 0.0;
        double berat = dataPengiriman.getBeratBarang();
        double harga = dataPengiriman.getHargaPengiriman();

        List<HargaPengiriman> harPeng = DeliveryCostLib.costLib();

        for (HargaPengiriman hargaPengiriman : harPeng) {

            if (hargaPengiriman.getDestinasi().equalsIgnoreCase(dataPengiriman.getDestinasi()));

            if (dataPengiriman.getDeliveryService().equalsIgnoreCase("Regular")) {
                costdest += hargaPengiriman.getRegular();
                if (dataPengiriman.isAsuransi()) {
                    totalBayar = (costdest * berat) + (harga * hargaAsuransi);
                    System.out.println("Total Cost DAO: " + totalBayar);
                }
            } else {
                totalBayar = costdest * berat;
            }
            
            
            if (dataPengiriman.getDeliveryService().equalsIgnoreCase("Ekonomi")) {
                costdest += hargaPengiriman.getEconomy();
                if (dataPengiriman.isAsuransi()) {
                    totalBayar = (costdest * berat) + (harga * hargaAsuransi);
                    System.out.println("Total Cost DAO: " + totalBayar);
                }
            } else {
                totalBayar = costdest * berat;
            }
            
            if (dataPengiriman.getDeliveryService().equalsIgnoreCase("HDS")) {
                costdest += hargaPengiriman.getHds();
                if (dataPengiriman.isAsuransi()) {
                    totalBayar = (costdest * berat) + (harga * hargaAsuransi);
                    System.out.println("Total Cost DAO: " + totalBayar);
                }
            } else {
                totalBayar = costdest * berat;
            }
            
            if (dataPengiriman.getDeliveryService().equalsIgnoreCase("ONS")) {
                costdest += hargaPengiriman.getOns();
                if (dataPengiriman.isAsuransi()) {
                    totalBayar = (costdest * berat) + (harga * hargaAsuransi);
                    System.out.println("Total Cost DAO: " + totalBayar);
                }
            } else {
                totalBayar = costdest * berat;
            }
            
            if (dataPengiriman.getDeliveryService().equalsIgnoreCase("SDS")) {
                costdest += hargaPengiriman.getSds();
                if (dataPengiriman.isAsuransi()) {
                    totalBayar = (costdest * berat) + (harga * hargaAsuransi);
                    System.out.println("Total Cost DAO: " + totalBayar);
                }
            } else {
                totalBayar = costdest * berat;
            }
        }
        
        return totalBayar;
    }
}
