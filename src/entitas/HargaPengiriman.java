package entitas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class HargaPengiriman {
    private String destinasi;
    private double regular;
    private double economy;
    private double sds;
    private double ons;
    private double hds;

    public HargaPengiriman() {
    }

    public HargaPengiriman(String destinasi, double regular, double economy, double sds, double ons, double hds) {
        this.destinasi = destinasi;
        this.regular = regular;
        this.economy = economy;
        this.sds = sds;
        this.ons = ons;
        this.hds = hds;
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
     * @return the regular
     */
    public double getRegular() {
        return regular;
    }

    /**
     * @param regular the regular to set
     */
    public void setRegular(double regular) {
        this.regular = regular;
    }

    /**
     * @return the economy
     */
    public double getEconomy() {
        return economy;
    }

    /**
     * @param economy the economy to set
     */
    public void setEconomy(double economy) {
        this.economy = economy;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }
    
    
}