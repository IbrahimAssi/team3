/**
 * GetCustomerBillswsdlLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ps.paltelDmz.customerbills.wsLAN;

public class GetCustomerBillswsdlLocator extends org.apache.axis.client.Service implements GetCustomerBillswsdl {

    public GetCustomerBillswsdlLocator() {
    }


    public GetCustomerBillswsdlLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetCustomerBillswsdlLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getCustomerBillswsdlPort
    private java.lang.String getCustomerBillswsdlPort_address = "http://yousefazem.com/SWEN6307/getCustomerBills.php";

    public java.lang.String getgetCustomerBillswsdlPortAddress() {
        return getCustomerBillswsdlPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getCustomerBillswsdlPortWSDDServiceName = "getCustomerBillswsdlPort";

    public java.lang.String getgetCustomerBillswsdlPortWSDDServiceName() {
        return getCustomerBillswsdlPortWSDDServiceName;
    }

    public void setgetCustomerBillswsdlPortWSDDServiceName(java.lang.String name) {
        getCustomerBillswsdlPortWSDDServiceName = name;
    }

    public GetCustomerBillswsdlPortType getgetCustomerBillswsdlPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getCustomerBillswsdlPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetCustomerBillswsdlPort(endpoint);
    }

    public GetCustomerBillswsdlPortType getgetCustomerBillswsdlPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            GetCustomerBillswsdlBindingStub _stub = new GetCustomerBillswsdlBindingStub(portAddress, this);
            _stub.setPortName(getgetCustomerBillswsdlPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetCustomerBillswsdlPortEndpointAddress(java.lang.String address) {
        getCustomerBillswsdlPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (GetCustomerBillswsdlPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                GetCustomerBillswsdlBindingStub _stub = new GetCustomerBillswsdlBindingStub(new java.net.URL(getCustomerBillswsdlPort_address), this);
                _stub.setPortName(getgetCustomerBillswsdlPortWSDDServiceName());
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
        if ("getCustomerBillswsdlPort".equals(inputPortName)) {
            return getgetCustomerBillswsdlPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:getCustomerBillswsdl", "getCustomerBillswsdl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:getCustomerBillswsdl", "getCustomerBillswsdlPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getCustomerBillswsdlPort".equals(portName)) {
            setgetCustomerBillswsdlPortEndpointAddress(address);
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
