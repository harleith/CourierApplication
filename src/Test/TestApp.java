package Test;

import DAO.CostDAO;
import entitas.DataPengiriman;
import entitas.Dimensi;
import java.util.Date;

public class TestApp {
    public static void main(String[] args) {

        Dimensi dimensi = new Dimensi();
        dimensi.setHeight(5.0);
        dimensi.setLenght(5.0);
        dimensi.setWeight(5.0);
        
        DataPengiriman package2 = new DataPengiriman();
        package2.setDeliveryService("sds");
        package2.setDestinasi("semarang");
        package2.setDimensi(dimensi);
        package2.setAsuransi(true);
        package2.setCode("1001");
        package2.setHargaPengiriman(1000000.0);
        package2.setPackageType("document");
        package2.setBeratBarang(2.0);
 //       package2.setPayment("cash");
        package2.setTanggalKirim(new Date());
        
        CostDAO costs = new CostDAO();
        double cost = costs.calculateAsuransi(package2);
        
        System.out.println("Biaya pengiriman ke: " + package2.getDestinasi()+ " sebesar: " + cost);
    }
        
    }
    