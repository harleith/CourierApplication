
public class Penerima {

    private String nama;
    private String alamat;
    private String kodepos;

    public Penerima() {
    }

    public Penerima(String nama, String alamat, String kodepos) {
        this.nama = nama;
        this.alamat = alamat;
        this.kodepos = kodepos;
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

}
