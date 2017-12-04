package entitas;
public class Laporan {

        private Pengirim sender;
        private Penerima receiver;
        private DataPengiriman packages;
        private String payment;
        private String amountPaymentOrCreditDebitNumber;
        private Double cost;

    public Laporan() {
    }

    public Laporan(Pengirim sender, Penerima receiver, DataPengiriman packages, String payment, String amountPaymentOrCreditDebitNumber, Double cost) {
        this.sender = sender;
        this.receiver = receiver;
        this.packages = packages;
        this.payment = payment;
        this.amountPaymentOrCreditDebitNumber = amountPaymentOrCreditDebitNumber;
        this.cost = cost;
    }

    /**
     * @return the sender
     */
    public Pengirim getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(Pengirim sender) {
        this.sender = sender;
    }

    /**
     * @return the receiver
     */
    public Penerima getReceiver() {
        return receiver;
    }

    /**
     * @param receiver the receiver to set
     */
    public void setReceiver(Penerima receiver) {
        this.receiver = receiver;
    }

    /**
     * @return the packages
     */
    public DataPengiriman getPackages() {
        return packages;
    }

    /**
     * @param packages the packages to set
     */
    public void setPackages(DataPengiriman packages) {
        this.packages = packages;
    }

    /**
     * @return the payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * @return the amountPaymentOrCreditDebitNumber
     */
    public String getAmountPaymentOrCreditDebitNumber() {
        return amountPaymentOrCreditDebitNumber;
    }

    /**
     * @param amountPaymentOrCreditDebitNumber the amountPaymentOrCreditDebitNumber to set
     */
    public void setAmountPaymentOrCreditDebitNumber(String amountPaymentOrCreditDebitNumber) {
        this.amountPaymentOrCreditDebitNumber = amountPaymentOrCreditDebitNumber;
    }

    /**
     * @return the cost
     */
    public Double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }
    
        
        
}
