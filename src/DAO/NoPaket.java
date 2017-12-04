package DAO;

public final class NoPaket {

     public static String generateResiNumber(){
        String noResi = "";
        
        int code = (int) (Math.ceil(Math.random() * 1000000000) * 1);
        noResi += code;
        return noResi;
    }
    
}
