package ps.paltelDmz.customerbills.wsLAN;

import org.hornetq.utils.json.JSONArray;
import org.hornetq.utils.json.JSONObject;
import ps.paltelDmz.customerbills.struct.CustomerBillsDtl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iassi on 5/16/2017.
 */
public class CallWsLAN_customerBills {

    public static List<CustomerBillsDtl> getCustomerBills(String areaCode,String telNo,String billNo) throws Exception
    {
         List<CustomerBillsDtl> dataList=new ArrayList<CustomerBillsDtl>();

        GetCustomerBillswsdlLocator service = new GetCustomerBillswsdlLocator();
        GetCustomerBillswsdlPortType port = service.getgetCustomerBillswsdlPort();
        String jsonString = port.getCustomerBills(areaCode, telNo,billNo);
        if(jsonString !=null && !jsonString.startsWith("{\"data\":"))
            jsonString="{\"data\":"+jsonString+"}";
//        System.out.println(jsonString);
        JSONObject jsonResult = new JSONObject(jsonString);
        JSONArray data = jsonResult.getJSONArray("data");
        if(data != null)
        {
            for(int i = 0 ; i < data.length() ; i++)
            {
                JSONObject JObject = data.getJSONObject(i);

                CustomerBillsDtl customerBillsDtl =new CustomerBillsDtl();
                customerBillsDtl.setAccountNumber(JObject.getString("accountNumber"));
                customerBillsDtl.setBillNumber(JObject.getString("billNumber"));
                customerBillsDtl.setTelephoneNumber(JObject.getString("telephoneNumber"));
                customerBillsDtl.setBillPeriod(JObject.getString("billPeriod"));
                customerBillsDtl.setBillAmount(JObject.getString("billAmount"));
                customerBillsDtl.setCurrency(JObject.getString("currency"));
                customerBillsDtl.setDueDate(JObject.getString("dueDate"));
                customerBillsDtl.setPaymentStatus(JObject.getString("paymentStatus"));

                dataList.add(customerBillsDtl);
            }
        }




        return dataList;
    }

    //****************************************************************************




    public static void main(String arg[])
    {
        try
        {
            List dataList=getCustomerBills("09", "2345767", "all");
            for(Object obj:dataList)
             System.out.println(obj);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
