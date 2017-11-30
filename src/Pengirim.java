
public class Pengirim {

    private String nama;
    private String alamat;
    private String kota;
    private String kodepos;
    private String provinsi;
    private String telepon;

    public Pengirim() {
    }

    public Pengirim(String nama, String alamat, String kota, String kodepos, String provinsi, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.kodepos = kodepos;
        this.provinsi = provinsi;
        this.telepon = telepon;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
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
     * @return the kodepos
     */
    public String getKodepos() {
        return kodepos;
    }

    /**
     * @param kodepos the kodepos to set
     */
    public void setKodepos(String kodepos) {
        this.kodepos = kodepos;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the telepon
     */
    public String getTelepon() {
        return telepon;
    }

    /**
     * @param telepon the telepon to set
     */
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    
}
