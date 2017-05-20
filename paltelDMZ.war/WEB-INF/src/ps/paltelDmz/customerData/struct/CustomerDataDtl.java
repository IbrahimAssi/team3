package ps.paltelDmz.customerData.struct;

import java.util.List;

/**
 * Created by iassi on 2017-05-08.
 */
public class CustomerDataDtl {

    private String accountNumber;
    private String customerName;
    private String address;
    private String mobile;
    private String email;
    private String telephoneNumber;
    private String areaCode;
    private String faxNumber;
    private String customerClassification;
    private String customerType;
    private String subscriptionDate;
    private String lineStatus;
    private List <CustomerServiceDtl> customerServiceDtl;

    public CustomerDataDtl() {
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getCustomerClassification() {
        return customerClassification;
    }

    public void setCustomerClassification(String customerClassification) {
        this.customerClassification = customerClassification;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public String getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }

    public List<CustomerServiceDtl> getCustomerServiceDtl() {
        return customerServiceDtl;
    }

    public void setCustomerServiceDtl(List<CustomerServiceDtl> customerServiceDtl) {
        this.customerServiceDtl = customerServiceDtl;
    }

    @Override
    public String toString() {
        return "CustomerDataDtl{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", customerClassification='" + customerClassification + '\'' +
                ", customerType='" + customerType + '\'' +
                ", subscriptionDate='" + subscriptionDate + '\'' +
                ", lineStatus='" + lineStatus + '\'' +
                ", customerServiceDtl=" + customerServiceDtl +
                '}';
    }
}
