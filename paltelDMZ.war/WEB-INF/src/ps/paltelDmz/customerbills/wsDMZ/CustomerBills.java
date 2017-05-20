package ps.paltelDmz.customerbills.wsDMZ;

import ps.paltelDmz.customerbills.struct.CustomerBillsDtl;
import ps.paltelDmz.customerbills.wsLAN.CallWsLAN_customerBills;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iassi on 2017-05-08.
 */
@WebService
public class CustomerBills {


    @WebMethod(operationName = "getCustomerBillsDmz")
    public List<CustomerBillsDtl> getCustomerBillsDmz  (@WebParam(name = "areaCode") String areaCode,
                                                        @WebParam(name = "telNo")    String telNo)
    {

        // call web service getCustomerBills(areaCode,telNo)  from LAN network
        List<CustomerBillsDtl> customerBillsList =new ArrayList<CustomerBillsDtl>();

        try
        {
           customerBillsList =CallWsLAN_customerBills.getCustomerBills(areaCode, telNo,"all");
        } catch (Exception e) {
            System.err.println("Error in CustomerBills.getCustomerBills when call ws from LAN network:"+e);
        }

        return customerBillsList;
    }


//    G:\jboss-6.0.0.Final\server\paltelDMZ\deploy\paltelDMZ.war\WEB-INF\lib>java -cp axis-1.4.jar;commons-logging-1.1.jar;commons-discovery-0.2.jar;jaxrpc-1.1.jar;saaj-1.1.jar;wsdl4j-1.4.jar;activation-1.1.jar;mail-1.4.jar org.apache.axis.wsdl.WSDL2Java http://yousefazem.com/SWEN6307/getCustomerBills.php?wsdl
}
