/**
 * GetCustomerInfowsdlPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ps.paltelDmz.customerData.wsLAN.customerInfo;

public interface GetCustomerInfowsdlPortType extends java.rmi.Remote {

    /**
     * GET Customer Information
     */
    public java.lang.String getCustomerInfo(java.lang.String area_code, java.lang.String telNo) throws java.rmi.RemoteException;
}
