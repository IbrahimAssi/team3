package ps.paltelDmz.login.wsDMZ;

import ps.paltelDmz.login.wsLAN.CallWsLAN_login;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by iassi on 2017-05-08.
 */

@WebService
public class Login {



    @WebMethod(operationName = "dmzLogin")
    public boolean dmzLogin  (@WebParam(name = "areaCode") String areaCode,
                              @WebParam(name = "telNo")    String telNo,
                              @WebParam(name = "password") String password)
    {


        //  call web service login(areaCode,telNo,password) from web service on LAN network

        boolean result=false;
        try
        {
           result= CallWsLAN_login.login(areaCode,telNo,password);
        }
        catch (Exception e)
        {
            System.err.println("Error in Login.login when call login ws from LAN network:"+e);
        }

        return result;
    }


//    G:\jboss-6.0.0.Final\server\paltelDMZ\deploy\paltelDMZ.war\WEB-INF\lib>java -cp axis-1.4.jar;commons-logging-1.1.jar;commons-discovery-0.2.jar;jaxrpc-1.1.jar;saaj-1.1.jar;wsdl4j-1.4.jar;activation-1.1.jar;mail-1.4.jar org.apache.axis.wsdl.WSDL2Java http://yousefazem.com/SWEN6307/login.php?wsdl
}
