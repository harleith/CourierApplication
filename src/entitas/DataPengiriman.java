package entitas;

import java.util.Date;

public class DataPengiriman {

        private String code;
        private String destinasi;
        private String packageType;
        private double beratBarang;
        private Date tanggalKirim;
        private Dimensi dimensi;
        private String deliveryService;
        private boolean asuransi;
        private double hargaPengiriman;

    public DataPengiriman() {
    }

    public DataPengiriman(String code, String destinasi, String packageType, double beratBarang, Date tanggalKirim, Dimensi dimensi, String deliveryService, boolean asuransi, double hargaPengiriman) {
        this.code = code;
        this.destinasi = destinasi;
        this.packageType = packageType;
        this.beratBarang = beratBarang;
        this.tanggalKirim = tanggalKirim;
        this.dimensi = dimensi;
        this.deliveryService = deliveryService;
        this.asuransi = asuransi;
        this.hargaPengiriman = hargaPengiriman;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the destinasi
     */
    public String getDestinasi() {
        return destinasi;
    }

    /**
     * @param destinasi the destinasi to set
     */
    public void setDestinasi(String destinasi) {
        this.destinasi = destinasi;
    }

    /**
     * @return the packageType
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * @param packageType the packageType to set
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * @return the beratBarang
     */
    public double getBeratBarang() {
        return beratBarang;
    }

    /**
     * @param beratBarang the beratBarang to set
     */
    public void setBeratBarang(double beratBarang) {
        this.beratBarang = beratBarang;
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
    public Dimensi getDimensi() {
        return dimensi;
    }

    /**
     * @param dimensi the dimensi to set
     */
    public void setDimensi(Dimensi dimensi) {
        this.dimensi = dimensi;
    }

    /**
     * @return the deliveryService
     */
    public String getDeliveryService() {
        return deliveryService;
    }

    /**
     * @param deliveryService the deliveryService to set
     */
    public void setDeliveryService(String deliveryService) {
        this.deliveryService = deliveryService;
    }

    /**
     * @return the asuransi
     */
    public boolean isAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the hargaPengiriman
     */
    public double getHargaPengiriman() {
        return hargaPengiriman;
    }

    /**
     * @param hargaPengiriman the hargaPengiriman to set
     */
    public void setHargaPengiriman(double hargaPengiriman) {
        this.hargaPengiriman = hargaPengiriman;
    }
        
        
    
}
