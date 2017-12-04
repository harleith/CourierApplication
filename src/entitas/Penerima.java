package entitas;
public class Penerima {

        private String namaPengirim;
        private String alamat;
        private String kota;
        private String telpon;

    public Penerima() {
    }

    public Penerima(String namaPengirim, String alamat, String kota, String telpon) {
        this.namaPengirim = namaPengirim;
        this.alamat = alamat;
        this.kota = kota;
        this.telpon = telpon;
    }

    /**
     * @return the namaPengirim
     */
    public String getNamaPengirim() {
        return namaPengirim;
    }

    /**
     * @param namaPengirim the namaPengirim to set
     */
    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the telpon
     */
    public String getTelpon() {
        return telpon;
    }

    /**
     * @param telpon the telpon to set
     */
    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }
        
        
    
}
