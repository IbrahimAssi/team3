package ps.paltelDmz.payBill.wsLAN;

import org.hornetq.utils.json.JSONArray;
import org.hornetq.utils.json.JSONObject;
import ps.paltelDmz.payBill.wsLAN.bankAuthntectionPayment.BankAuthntectionPaymentwsdlLocator;
import ps.paltelDmz.payBill.wsLAN.bankAuthntectionPayment.BankAuthntectionPaymentwsdlPortType;
import ps.paltelDmz.payBill.wsLAN.updatePayment.UpdatePaymentwsdlLocator;
import ps.paltelDmz.payBill.wsLAN.updatePayment.UpdatePaymentwsdlPortType;

/**
 * Created by iassi on 5/16/2017.
 */
public class CallWsLAN_payBill {

    public static String getBankAuthntectionPayment(String billNumber,String billAmount,String currency, String visaNumber) throws Exception
    {

        String result="false";
        BankAuthntectionPaymentwsdlLocator service = new BankAuthntectionPaymentwsdlLocator();
        BankAuthntectionPaymentwsdlPortType port = service.getbankAuthntectionPaymentwsdlPort();
        String jsonString = port.bankAuthntectionPayment(billNumber,billAmount,currency,visaNumber);
        if(jsonString !=null && !jsonString.startsWith("{\"data\":"))
            jsonString="{\"data\":"+jsonString+"}";
        JSONObject jsonResult = new JSONObject(jsonString);
        JSONArray data = jsonResult.getJSONArray("data");
        if(data != null)
        {
//            for(int i = 0 ; i < data.length() ; i++)
//            {
            JSONObject JObject = data.getJSONObject(0);
            result=JObject.getString("result");

//            }
        }

        return result;
    }

    // ------------------------------------------------------------------------------


    public static String updatePayment(String areaCode,String telNo,String billNumber) throws Exception
    {

        String result="false";
        UpdatePaymentwsdlLocator service = new UpdatePaymentwsdlLocator();
        UpdatePaymentwsdlPortType port = service.getupdatePaymentwsdlPort();
        String jsonString = port.updatePayment(areaCode, telNo,billNumber);
        if(jsonString !=null && !jsonString.startsWith("{\"data\":"))
            jsonString="{\"data\":"+jsonString+"}";
        JSONObject jsonResult = new JSONObject(jsonString);
        JSONArray data = jsonResult.getJSONArray("data");
        if(data != null)
        {
//            for(int i = 0 ; i < data.length() ; i++)
//            {
            JSONObject JObject = data.getJSONObject(0);
            result=JObject.getString("result");

//            }
        }

        return result;
    }


    //****************************************************************************




    public static void main(String arg[])
    {
        try
        {
//            System.out.println(getCustomerInfoData("09", "123456"));
//            System.out.println(getBankAuthntectionPayment("09", "09", "09", "123456"));
//            System.out.println(updatePayment("09", "09", "123456"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
