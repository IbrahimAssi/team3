/**
 * BankAuthntectionPaymentwsdlLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ps.paltelDmz.payBill.wsLAN.bankAuthntectionPayment;

public class BankAuthntectionPaymentwsdlLocator extends org.apache.axis.client.Service implements BankAuthntectionPaymentwsdl {

    public BankAuthntectionPaymentwsdlLocator() {
    }


    public BankAuthntectionPaymentwsdlLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BankAuthntectionPaymentwsdlLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for bankAuthntectionPaymentwsdlPort
    private java.lang.String bankAuthntectionPaymentwsdlPort_address = "http://yousefazem.com/SWEN6307/bankAuthntectionPayment.php";

    public java.lang.String getbankAuthntectionPaymentwsdlPortAddress() {
        return bankAuthntectionPaymentwsdlPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String bankAuthntectionPaymentwsdlPortWSDDServiceName = "bankAuthntectionPaymentwsdlPort";

    public java.lang.String getbankAuthntectionPaymentwsdlPortWSDDServiceName() {
        return bankAuthntectionPaymentwsdlPortWSDDServiceName;
    }

    public void setbankAuthntectionPaymentwsdlPortWSDDServiceName(java.lang.String name) {
        bankAuthntectionPaymentwsdlPortWSDDServiceName = name;
    }

    public BankAuthntectionPaymentwsdlPortType getbankAuthntectionPaymentwsdlPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(bankAuthntectionPaymentwsdlPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getbankAuthntectionPaymentwsdlPort(endpoint);
    }

    public BankAuthntectionPaymentwsdlPortType getbankAuthntectionPaymentwsdlPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            BankAuthntectionPaymentwsdlBindingStub _stub = new BankAuthntectionPaymentwsdlBindingStub(portAddress, this);
            _stub.setPortName(getbankAuthntectionPaymentwsdlPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setbankAuthntectionPaymentwsdlPortEndpointAddress(java.lang.String address) {
        bankAuthntectionPaymentwsdlPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (BankAuthntectionPaymentwsdlPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                BankAuthntectionPaymentwsdlBindingStub _stub = new BankAuthntectionPaymentwsdlBindingStub(new java.net.URL(bankAuthntectionPaymentwsdlPort_address), this);
                _stub.setPortName(getbankAuthntectionPaymentwsdlPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("bankAuthntectionPaymentwsdlPort".equals(inputPortName)) {
            return getbankAuthntectionPaymentwsdlPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:bankAuthntectionPaymentwsdl", "bankAuthntectionPaymentwsdl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:bankAuthntectionPaymentwsdl", "bankAuthntectionPaymentwsdlPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("bankAuthntectionPaymentwsdlPort".equals(portName)) {
            setbankAuthntectionPaymentwsdlPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
