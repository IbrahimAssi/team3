package ps.paltelDmz.customerData.struct;

/**
 * Created by iassi on 2017-05-08.
 */
public class CustomerServiceDtl
{
    private String serviceName;
    private String serviceStatus;
    private String subscriptionDate;

    public CustomerServiceDtl() {
    }

    public CustomerServiceDtl(String serviceName, String serviceStatus, String subscriptionDate) {
        this.serviceName = serviceName;
        this.serviceStatus = serviceStatus;
        this.subscriptionDate = subscriptionDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    @Override
    public String toString() {
        return "CustomerServiceDtl{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceStatus='" + serviceStatus + '\'' +
                ", subscriptionDate='" + subscriptionDate + '\'' +
                '}';
    }
}
