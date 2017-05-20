/**
 * GetCustomerServiceswsdlLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ps.paltelDmz.customerData.wsLAN.customerServices;

public class GetCustomerServiceswsdlLocator extends org.apache.axis.client.Service implements GetCustomerServiceswsdl {

    public GetCustomerServiceswsdlLocator() {
    }


    public GetCustomerServiceswsdlLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetCustomerServiceswsdlLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getCustomerServiceswsdlPort
    private java.lang.String getCustomerServiceswsdlPort_address = "http://yousefazem.com/SWEN6307/getCustomerServices.php";

    public java.lang.String getgetCustomerServiceswsdlPortAddress() {
        return getCustomerServiceswsdlPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getCustomerServiceswsdlPortWSDDServiceName = "getCustomerServiceswsdlPort";

    public java.lang.String getgetCustomerServiceswsdlPortWSDDServiceName() {
        return getCustomerServiceswsdlPortWSDDServiceName;
    }

    public void setgetCustomerServiceswsdlPortWSDDServiceName(java.lang.String name) {
        getCustomerServiceswsdlPortWSDDServiceName = name;
    }

    public GetCustomerServiceswsdlPortType getgetCustomerServiceswsdlPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getCustomerServiceswsdlPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetCustomerServiceswsdlPort(endpoint);
    }

    public GetCustomerServiceswsdlPortType getgetCustomerServiceswsdlPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            GetCustomerServiceswsdlBindingStub _stub = new GetCustomerServiceswsdlBindingStub(portAddress, this);
            _stub.setPortName(getgetCustomerServiceswsdlPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetCustomerServiceswsdlPortEndpointAddress(java.lang.String address) {
        getCustomerServiceswsdlPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (GetCustomerServiceswsdlPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                GetCustomerServiceswsdlBindingStub _stub = new GetCustomerServiceswsdlBindingStub(new java.net.URL(getCustomerServiceswsdlPort_address), this);
                _stub.setPortName(getgetCustomerServiceswsdlPortWSDDServiceName());
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
        if ("getCustomerServiceswsdlPort".equals(inputPortName)) {
            return getgetCustomerServiceswsdlPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:getCustomerServiceswsdl", "getCustomerServiceswsdl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:getCustomerServiceswsdl", "getCustomerServiceswsdlPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getCustomerServiceswsdlPort".equals(portName)) {
            setgetCustomerServiceswsdlPortEndpointAddress(address);
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
