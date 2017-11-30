
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class DataPengirimanPaket {
    private String nomorPaket;
    private String kota;
    private String jenisBarang;
    private Date tanggalKirim;
    private String dimensi;
    private double asuransi;
    private double hargaBarang;
    private double pembayaran;
    private String jenisLayananRegular;
    private String jenisLayananKilat;
    private String jenisLayananSds;
    private String jenisLayananOns;
    private String JenisLayananHds;

    public DataPengirimanPaket() {
    }

    public DataPengirimanPaket(String nomorPaket, String kota, String jenisBarang, Date tanggalKirim, String dimensi, double asuransi, double hargaBarang, double pembayaran, String jenisLayananRegular, String jenisLayananKilat, String jenisLayananSds, String jenisLayananOns, String JenisLayananHds) {
        this.nomorPaket = nomorPaket;
        this.kota = kota;
        this.jenisBarang = jenisBarang;
        this.tanggalKirim = tanggalKirim;
        this.dimensi = dimensi;
        this.asuransi = asuransi;
        this.hargaBarang = hargaBarang;
        this.pembayaran = pembayaran;
        this.jenisLayananRegular = jenisLayananRegular;
        this.jenisLayananKilat = jenisLayananKilat;
        this.jenisLayananSds = jenisLayananSds;
        this.jenisLayananOns = jenisLayananOns;
        this.JenisLayananHds = JenisLayananHds;
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

    /**
     * @return the jenisLayananRegular
     */
    public String getJenisLayananRegular() {
        return jenisLayananRegular;
    }

    /**
     * @param jenisLayananRegular the jenisLayananRegular to set
     */
    public void setJenisLayananRegular(String jenisLayananRegular) {
        this.jenisLayananRegular = jenisLayananRegular;
    }

    /**
     * @return the jenisLayananKilat
     */
    public String getJenisLayananKilat() {
        return jenisLayananKilat;
    }

    /**
     * @param jenisLayananKilat the jenisLayananKilat to set
     */
    public void setJenisLayananKilat(String jenisLayananKilat) {
        this.jenisLayananKilat = jenisLayananKilat;
    }

    /**
     * @return the jenisLayananSds
     */
    public String getJenisLayananSds() {
        return jenisLayananSds;
    }

    /**
     * @param jenisLayananSds the jenisLayananSds to set
     */
    public void setJenisLayananSds(String jenisLayananSds) {
        this.jenisLayananSds = jenisLayananSds;
    }

    /**
     * @return the jenisLayananOns
     */
    public String getJenisLayananOns() {
        return jenisLayananOns;
    }

    /**
     * @param jenisLayananOns the jenisLayananOns to set
     */
    public void setJenisLayananOns(String jenisLayananOns) {
        this.jenisLayananOns = jenisLayananOns;
    }

    /**
     * @return the JenisLayananHds
     */
    public String getJenisLayananHds() {
        return JenisLayananHds;
    }

    /**
     * @param JenisLayananHds the JenisLayananHds to set
     */
    public void setJenisLayananHds(String JenisLayananHds) {
        this.JenisLayananHds = JenisLayananHds;
    }

    
    
}
