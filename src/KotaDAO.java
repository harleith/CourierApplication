
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KotaDAO {

    public static List<DataPengirimanPaket> getKota(){
        List<DataPengirimanPaket> kotaList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("E:/persondata.txt"));
            while (scan.hasNextLine()) {
                DataPengirimanPaket dpp = new DataPengirimanPaket();
                String line = scan.nextLine();
                String[] data = line.split(",");
                dpp.setJenisLayananRegular(data[1]);
                Double.parseDouble(dpp.getJenisLayananRegular());
                dpp.setJenisLayananKilat(data[2]);
                Double.parseDouble(dpp.getJenisLayananKilat());
                dpp.setJenisLayananSds(data[3]);
                Double.parseDouble(dpp.getJenisLayananSds());
                dpp.setJenisLayananOns(data[4]);
                Double.parseDouble(dpp.getJenisLayananOns());
                dpp.setJenisLayananHds(data[5]);
                Double.parseDouble(dpp.getJenisLayananHds());
                kotaList.add(dpp);
                
        }
        } catch (FileNotFoundException fileErr) {
            System.out.println("File tidak di terimkan");
        } 
        return kotaList;
    } 
    } 

