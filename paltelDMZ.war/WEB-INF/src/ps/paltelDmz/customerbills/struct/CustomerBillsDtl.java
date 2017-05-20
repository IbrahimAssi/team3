package ps.paltelDmz.customerbills.struct;

/**
 * Created by iassi on 2017-05-08.
 */
public class CustomerBillsDtl {

    private String accountNumber;
    private String billNumber;
    private String telephoneNumber;
    private String billPeriod;
    private String billAmount;
    private String currency;
    private String dueDate;
    private String paymentStatus;


    public CustomerBillsDtl() {
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "CustomerBillsDtl{" +
                "accountNumber='" + accountNumber + '\'' +
                ", billNumber='" + billNumber + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", billPeriod='" + billPeriod + '\'' +
                ", billAmount='" + billAmount + '\'' +
                ", currency='" + currency + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
