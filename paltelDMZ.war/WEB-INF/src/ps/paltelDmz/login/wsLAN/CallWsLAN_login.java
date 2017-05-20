package ps.paltelDmz.login.wsLAN;

import org.hornetq.utils.json.JSONArray;
import org.hornetq.utils.json.JSONObject;

/**
 * Created by iassi on 5/16/2017.
 */
public class CallWsLAN_login {

    public static boolean login(String areaCode,String telNo,String password) throws Exception
    {
        boolean retult =false;

        LoginwsdlLocator service = new LoginwsdlLocator();
        LoginwsdlPortType port = service.getloginwsdlPort();
        String jsonString = port.login(areaCode, telNo, password);
        if(jsonString !=null && !jsonString.startsWith("{\"data\":"))
            jsonString="{\"data\":"+jsonString+"}";
        JSONObject jsonResult = new JSONObject(jsonString);
        JSONArray data = jsonResult.getJSONArray("data");
        if(data != null)
        {
//            for(int i = 0 ; i < data.length() ; i++)
//            {
                JSONObject JObject = data.getJSONObject(0);
                retult=new Boolean(JObject.getString("result"));
//            }
        }


        return   retult;
    }

    //****************************************************************************




    public static void main(String arg[])
    {
        try
        {
//            System.out.println(getCustomerInfoData("09", "123456"));
            System.out.println(login("09", "123456","sss"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
