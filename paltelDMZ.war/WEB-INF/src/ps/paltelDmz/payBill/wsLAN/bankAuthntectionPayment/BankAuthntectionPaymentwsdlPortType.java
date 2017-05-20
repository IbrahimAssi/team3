/**
 * BankAuthntectionPaymentwsdlPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ps.paltelDmz.payBill.wsLAN.bankAuthntectionPayment;

public interface BankAuthntectionPaymentwsdlPortType extends java.rmi.Remote {

    /**
     * GET Customer Bill Header
     */
    public java.lang.String bankAuthntectionPayment(java.lang.String billNumber, java.lang.String billAmount, java.lang.String currency, java.lang.String visaNo) throws java.rmi.RemoteException;
}
