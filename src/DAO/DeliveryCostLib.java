package DAO;

import entitas.HargaPengiriman;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DeliveryCostLib {
    
    public static List<HargaPengiriman> costLib(){
        List<HargaPengiriman> libs = new ArrayList<>();
        
        try {

            Scanner scan = new Scanner(new File(DeliveryCostLib.class.getResource("/aset/FileTarif.txt").getFile()));
            while (scan.hasNextLine()) {
                String next = scan.nextLine();
                String[]data = next.split(",");
                
                HargaPengiriman cost = new HargaPengiriman();
                cost.setDestinasi(data[0]);
                cost.setEconomy(Double.parseDouble(data[1]));
                cost.setRegular(Double.parseDouble(data[2]));
                cost.setHds(Double.parseDouble(data[3]));
                cost.setOns(Double.parseDouble(data[4]));
                cost.setHds(Double.parseDouble(data[5]));
                
                libs.add(cost);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeliveryCostLib.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return libs;
    }
    
}
