package ps.paltelDmz.payBill.wsDMZ;


import ps.paltelDmz.customerbills.struct.CustomerBillsDtl;
import ps.paltelDmz.customerbills.wsLAN.CallWsLAN_customerBills;
import ps.paltelDmz.payBill.wsLAN.CallWsLAN_payBill;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by iassi on 2017-05-08.
 */

@WebService
public class PayBill {


    @WebMethod(operationName = "payBill")
    public String payBill  (    @WebParam(name = "areaCode")   String areaCode,
                                @WebParam(name = "telNo")      String telNo,
                                @WebParam(name = "billNumber") String billNumber,
                                @WebParam(name = "visaNumber") String visaNumber
                                )
    {


        /* call web service getCustomerBills (telNo,billNumber)  from LAN network to retrive bill amount */
        /* call web service bankAuthntectionPayment (billNumber,billAmount,currency,visaNumber) return "result" as boolen from LAN network */
        /* call web service updatePayment (areaCode,telNo,billNumber)  from LAN network */


        CustomerBillsDtl customerBillsDtl=null;
        try
        {
           List<CustomerBillsDtl> customerBillsList = CallWsLAN_customerBills.getCustomerBills(areaCode, telNo,billNumber);
           if(customerBillsList !=null && customerBillsList.size()>0)
               customerBillsDtl=customerBillsList.get(0);
        } catch (Exception e) {
            System.err.println("Error in PayBill.payBill when call ws from LAN network:"+e);
            return "Error in get bill info";
        }

        try
        {
            String bankAuthntectionResult= CallWsLAN_payBill.getBankAuthntectionPayment(customerBillsDtl.getBillNumber(),customerBillsDtl.getBillAmount(),customerBillsDtl.getCurrency(),visaNumber);
            if(bankAuthntectionResult !=null && bankAuthntectionResult.equals("false"))
                return "invalid bank authntection";
        } catch (Exception e) {
            System.err.println("Error in CallWsLAN_payBill.getBankAuthntectionPayment when call ws from LAN network:"+e);
            return "Error in bank authntection";
        }


        try
        {
            String bankAuthntectionResult= CallWsLAN_payBill.updatePayment(areaCode, telNo,customerBillsDtl.getBillNumber());
            if(bankAuthntectionResult !=null && bankAuthntectionResult.equals("false"))
                return "failed payment operation";
        } catch (Exception e) {
            System.err.println("Error in CallWsLAN_payBill.getBankAuthntectionPayment when call ws from LAN network:"+e);
            return "Error in payment operation";
        }







        return "Success operation";
    }


//    G:\jboss-6.0.0.Final\server\paltelDMZ\deploy\paltelDMZ.war\WEB-INF\lib>java -cp axis-1.4.jar;commons-logging-1.1.jar;commons-discovery-0.2.jar;jaxrpc-1.1.jar;saaj-1.1.jar;wsdl4j-1.4.jar;activation-1.1.jar;mail-1.4.jar org.apache.axis.wsdl.WSDL2Java http://yousefazem.com/SWEN6307/bankAuthntectionPayment.php?wsdl
//    G:\jboss-6.0.0.Final\server\paltelDMZ\deploy\paltelDMZ.war\WEB-INF\lib>java -cp axis-1.4.jar;commons-logging-1.1.jar;commons-discovery-0.2.jar;jaxrpc-1.1.jar;saaj-1.1.jar;wsdl4j-1.4.jar;activation-1.1.jar;mail-1.4.jar org.apache.axis.wsdl.WSDL2Java http://yousefazem.com/SWEN6307/updatePayment.php?wsdl
}
