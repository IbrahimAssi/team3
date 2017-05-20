/**
 * LoginwsdlPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ps.paltelDmz.login.wsLAN;

public interface LoginwsdlPortType extends java.rmi.Remote {

    /**
     * GET Customer Information
     */
    public java.lang.String login(java.lang.String areaCode, java.lang.String telNo, java.lang.String password) throws java.rmi.RemoteException;
}
