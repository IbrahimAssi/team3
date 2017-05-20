/**
 * GetCustomerInfowsdlLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ps.paltelDmz.customerData.wsLAN.customerInfo;

public class GetCustomerInfowsdlLocator extends org.apache.axis.client.Service implements GetCustomerInfowsdl {

    public GetCustomerInfowsdlLocator() {
    }


    public GetCustomerInfowsdlLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetCustomerInfowsdlLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getCustomerInfowsdlPort
    private java.lang.String getCustomerInfowsdlPort_address = "http://yousefazem.com/SWEN6307/getCustomerInfo.php";

    public java.lang.String getgetCustomerInfowsdlPortAddress() {
        return getCustomerInfowsdlPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getCustomerInfowsdlPortWSDDServiceName = "getCustomerInfowsdlPort";

    public java.lang.String getgetCustomerInfowsdlPortWSDDServiceName() {
        return getCustomerInfowsdlPortWSDDServiceName;
    }

    public void setgetCustomerInfowsdlPortWSDDServiceName(java.lang.String name) {
        getCustomerInfowsdlPortWSDDServiceName = name;
    }

    public GetCustomerInfowsdlPortType getgetCustomerInfowsdlPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getCustomerInfowsdlPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetCustomerInfowsdlPort(endpoint);
    }

    public GetCustomerInfowsdlPortType getgetCustomerInfowsdlPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            GetCustomerInfowsdlBindingStub _stub = new GetCustomerInfowsdlBindingStub(portAddress, this);
            _stub.setPortName(getgetCustomerInfowsdlPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetCustomerInfowsdlPortEndpointAddress(java.lang.String address) {
        getCustomerInfowsdlPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (GetCustomerInfowsdlPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                GetCustomerInfowsdlBindingStub _stub = new GetCustomerInfowsdlBindingStub(new java.net.URL(getCustomerInfowsdlPort_address), this);
                _stub.setPortName(getgetCustomerInfowsdlPortWSDDServiceName());
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
        if ("getCustomerInfowsdlPort".equals(inputPortName)) {
            return getgetCustomerInfowsdlPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:getCustomerInfowsdl", "getCustomerInfowsdl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:getCustomerInfowsdl", "getCustomerInfowsdlPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getCustomerInfowsdlPort".equals(portName)) {
            setgetCustomerInfowsdlPortEndpointAddress(address);
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
