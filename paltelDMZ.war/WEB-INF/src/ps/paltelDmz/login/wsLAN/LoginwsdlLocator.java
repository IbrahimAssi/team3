/**
 * LoginwsdlLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ps.paltelDmz.login.wsLAN;

public class LoginwsdlLocator extends org.apache.axis.client.Service implements Loginwsdl {

    public LoginwsdlLocator() {
    }


    public LoginwsdlLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginwsdlLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for loginwsdlPort
    private java.lang.String loginwsdlPort_address = "http://yousefazem.com/SWEN6307/login.php";

    public java.lang.String getloginwsdlPortAddress() {
        return loginwsdlPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String loginwsdlPortWSDDServiceName = "loginwsdlPort";

    public java.lang.String getloginwsdlPortWSDDServiceName() {
        return loginwsdlPortWSDDServiceName;
    }

    public void setloginwsdlPortWSDDServiceName(java.lang.String name) {
        loginwsdlPortWSDDServiceName = name;
    }

    public LoginwsdlPortType getloginwsdlPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(loginwsdlPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getloginwsdlPort(endpoint);
    }

    public LoginwsdlPortType getloginwsdlPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            LoginwsdlBindingStub _stub = new LoginwsdlBindingStub(portAddress, this);
            _stub.setPortName(getloginwsdlPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setloginwsdlPortEndpointAddress(java.lang.String address) {
        loginwsdlPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (LoginwsdlPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                LoginwsdlBindingStub _stub = new LoginwsdlBindingStub(new java.net.URL(loginwsdlPort_address), this);
                _stub.setPortName(getloginwsdlPortWSDDServiceName());
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
        if ("loginwsdlPort".equals(inputPortName)) {
            return getloginwsdlPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:loginwsdl", "loginwsdl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:loginwsdl", "loginwsdlPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("loginwsdlPort".equals(portName)) {
            setloginwsdlPortEndpointAddress(address);
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
