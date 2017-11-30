
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class KotaDAO {

    public KotaDAO() {
    }

        

    public List<DataPengirimanPaket> getKotaList(){
        List<DataPengirimanPaket> kotaList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("E:/persondata.txt"));
            while (scan.hasNextLine()) {
                DataPengirimanPaket dpp = new DataPengirimanPaket();
                String line = scan.nextLine();
                String[] data = line.split(",");
                dpp.setKota(data[0]);
                dpp.setJenisLayananRegular(data[1]);
                dpp.setJenisLayananKilat(data[2]);
                dpp.setJenisLayananSds(data[3]);
                dpp.setJenisLayananOns(data[4]);
                dpp.setJenisBarang(data[5]);
               
        }
        } catch (FileNotFoundException fileErr) {
            System.out.println("File tidak di terimkan");
        } 
        return kotaList;
    }
}
