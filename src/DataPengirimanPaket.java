
import java.util.Date;

public class DataPengirimanPaket {

    private String nomorPaket;
    private String kota;
    private String jenisBarang;
    private Date tanggalKirim;
    private String dimensi;
    private String jenisLayanan;
    private double asuransi;
    private double hargaBarang;
    private double pembayaran;

    public DataPengirimanPaket() {
    }

    public DataPengirimanPaket(String nomorPaket, String kota, String jenisBarang, Date tanggalKirim, String dimensi, String jenisLayanan, double asuransi, double hargaBarang, double pembayaran) {
        this.nomorPaket = nomorPaket;
        this.kota = kota;
        this.jenisBarang = jenisBarang;
        this.tanggalKirim = tanggalKirim;
        this.dimensi = dimensi;
        this.jenisLayanan = jenisLayanan;
        this.asuransi = asuransi;
        this.hargaBarang = hargaBarang;
        this.pembayaran = pembayaran;
    }

    /**
     * @return the nomorPaket
     */
    public String getNomorPaket() {
        return nomorPaket;
    }

    /**
     * @param nomorPaket the nomorPaket to set
     */
    public void setNomorPaket(String nomorPaket) {
        this.nomorPaket = nomorPaket;
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
     * @return the jenisBarang
     */
    public String getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the tanggalKirim
     */
    public Date getTanggalKirim() {
        return tanggalKirim;
    }

    /**
     * @param tanggalKirim the tanggalKirim to set
     */
    public void setTanggalKirim(Date tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }

    /**
     * @return the dimensi
     */
    public String getDimensi() {
        return dimensi;
    }

    /**
     * @param dimensi the dimensi to set
     */
    public void setDimensi(String dimensi) {
        this.dimensi = dimensi;
    }

    /**
     * @return the jenisLayanan
     */
    public String getJenisLayanan() {
        return jenisLayanan;
    }

    /**
     * @param jenisLayanan the jenisLayanan to set
     */
    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    /**
     * @return the asuransi
     */
    public double getAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(double asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the pembayaran
     */
    public double getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(double pembayaran) {
        this.pembayaran = pembayaran;
    }
    
}
