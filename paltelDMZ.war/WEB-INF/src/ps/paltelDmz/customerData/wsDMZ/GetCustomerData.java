package ps.paltelDmz.customerData.wsDMZ;

import ps.paltelDmz.customerData.struct.CustomerDataDtl;
import ps.paltelDmz.customerData.struct.CustomerServiceDtl;
import ps.paltelDmz.customerData.wsLAN.CallWsLAN_customerData;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iassi on 2017-05-08.
 */

@WebService
public class GetCustomerData {


    @WebMethod (operationName = "getCustomerData")
    public CustomerDataDtl getCustomerData(@WebParam(name = "areaCode") String areaCode,
                                           @WebParam(name = "telNo")    String telNo)
    {

        /* call web service getCustomerInfo (areaCode,telNo)      from LAN network */
        /* call web service getCustomerServices (areaCode,telNo)  from LAN network */

        CustomerDataDtl customerDataDtl= new CustomerDataDtl();
        List<CustomerServiceDtl> customerServiceDtlList = new ArrayList<CustomerServiceDtl>();
        try
        {
            customerDataDtl = CallWsLAN_customerData.getCustomerInfoData(areaCode, telNo);
        }
        catch (Exception e)
        {
            System.err.println("Error in GetCustomerData.getCustomerData when calling getCustomerInfo ws from LAN network:"+e);
        }

        try
        {
            customerServiceDtlList = CallWsLAN_customerData.getCustomerServices(areaCode, telNo);
        }
        catch (Exception e)
        {
            System.err.println("Error in GetCustomerData.getCustomerData when calling getCustomerInfo ws from LAN network:"+e);
        }

        customerDataDtl.setCustomerServiceDtl(customerServiceDtlList);

        return customerDataDtl;
    }


    /*

    G:\jboss-6.0.0.Final\server\paltelDMZ\deploy\paltelDMZ.war\WEB-INF\lib>java -cp axis-1.4.jar;commons-logging-1.1.jar;commons-discovery-0.2.jar;jaxrpc-1.1.jar;saaj-1.1.jar;wsdl4j-1.4.jar;activation-1.1.jar;mail-1.4.jar org.apache.axis.wsdl.WSDL2Java http://yousefazem.com/SWEN6307/getCustomerInfo.php?wsdl
    G:\jboss-6.0.0.Final\server\paltelDMZ\deploy\paltelDMZ.war\WEB-INF\lib>java -cp axis-1.4.jar;commons-logging-1.1.jar;commons-discovery-0.2.jar;jaxrpc-1.1.jar;saaj-1.1.jar;wsdl4j-1.4.jar;activation-1.1.jar;mail-1.4.jar org.apache.axis.wsdl.WSDL2Java http://yousefazem.com/SWEN6307/getCustomerServices.php?wsdl
    */
}
