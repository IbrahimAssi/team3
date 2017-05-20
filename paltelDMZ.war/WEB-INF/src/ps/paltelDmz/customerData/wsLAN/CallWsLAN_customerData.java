package ps.paltelDmz.customerData.wsLAN;

import org.hornetq.utils.json.JSONArray;
import org.hornetq.utils.json.JSONObject;
import ps.paltelDmz.customerData.struct.CustomerDataDtl;
import ps.paltelDmz.customerData.struct.CustomerServiceDtl;
import ps.paltelDmz.customerData.wsLAN.customerInfo.GetCustomerInfowsdlLocator;
import ps.paltelDmz.customerData.wsLAN.customerInfo.GetCustomerInfowsdlPortType;
import ps.paltelDmz.customerData.wsLAN.customerServices.GetCustomerServiceswsdlLocator;
import ps.paltelDmz.customerData.wsLAN.customerServices.GetCustomerServiceswsdlPortType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iassi on 5/16/2017.
 */
public class CallWsLAN_customerData {

    public static CustomerDataDtl getCustomerInfoData(String areaCode,String telNo) throws Exception
    {
        CustomerDataDtl customerDataDtl =null;

        GetCustomerInfowsdlLocator service = new GetCustomerInfowsdlLocator();
        GetCustomerInfowsdlPortType port = service.getgetCustomerInfowsdlPort();
        String jsonString = port.getCustomerInfo(areaCode, telNo);
        if(jsonString !=null && !jsonString.startsWith("{\"data\":"))
            jsonString="{\"data\":"+jsonString+"}";
        JSONObject jsonResult = new JSONObject(jsonString);
        JSONArray data = jsonResult.getJSONArray("data");
        if(data != null && !data.equals("[]"))
        {
//            for(int i = 0 ; i < data.length() ; i++)
//            {
                JSONObject JObject = data.getJSONObject(0);

            customerDataDtl =new CustomerDataDtl();
            customerDataDtl.setAccountNumber(JObject.getString("accountNumber"));
            customerDataDtl.setCustomerName(JObject.getString("customerName"));
            customerDataDtl.setAddress(JObject.getString("address"));
            customerDataDtl.setMobile(JObject.getString("mobile"));
            customerDataDtl.setEmail(JObject.getString("email"));
            customerDataDtl.setTelephoneNumber(JObject.getString("telephoneNumber"));
            customerDataDtl.setAreaCode(JObject.getString("areaCode"));
            customerDataDtl.setFaxNumber(JObject.getString("faxNumber"));
            customerDataDtl.setCustomerClassification(JObject.getString("customerClassification"));
            customerDataDtl.setCustomerType(JObject.getString("customerType"));
            customerDataDtl.setSubscriptionDate(JObject.getString("subscriptionDate"));
            customerDataDtl.setLineStatus(JObject.getString("lineStatus"));

//            }
        }


        return customerDataDtl;
    }

    // ------------------------------------------------------------------------------


    public static List<CustomerServiceDtl> getCustomerServices(String areaCode,String telNo) throws Exception
    {
        List<CustomerServiceDtl> customerServiceDtlList = new ArrayList<CustomerServiceDtl>();

        GetCustomerServiceswsdlLocator service = new GetCustomerServiceswsdlLocator();
        GetCustomerServiceswsdlPortType port = service.getgetCustomerServiceswsdlPort();
        String jsonString = port.getCustomerServices(areaCode, telNo);
        if(jsonString !=null && !jsonString.startsWith("{\"data\":"))
            jsonString="{\"data\":"+jsonString+"}";
        JSONObject jsonResult = new JSONObject(jsonString);
        JSONArray data = jsonResult.getJSONArray("data");
        if(data != null)
        {
            for(int i = 0 ; i < data.length() ; i++)
            {
            JSONObject JObject = data.getJSONObject(i);

            CustomerServiceDtl customerServiceDtl =new CustomerServiceDtl();
            customerServiceDtl.setServiceName(JObject.getString("serviceName"));
            customerServiceDtl.setServiceStatus(JObject.getString("serviceStatus"));
            customerServiceDtl.setSubscriptionDate(JObject.getString("subscriptionDate"));
            customerServiceDtlList.add(customerServiceDtl);
            }
        }


        return customerServiceDtlList;
    }

    //****************************************************************************




    public static void main(String arg[])
    {
        try
        {
//            System.out.println(getCustomerInfoData("09", "2345767"));
//            System.out.println(getCustomerServices("09", "2345767"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
