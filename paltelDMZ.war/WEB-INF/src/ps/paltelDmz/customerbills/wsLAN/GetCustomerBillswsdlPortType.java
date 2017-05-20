/**
 * GetCustomerBillswsdlPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ps.paltelDmz.customerbills.wsLAN;

public interface GetCustomerBillswsdlPortType extends java.rmi.Remote {

    /**
     * GET Customer Bill Header
     */
    public java.lang.String getCustomerBills(java.lang.String area_code, java.lang.String telNo, java.lang.String billNo) throws java.rmi.RemoteException;
}
