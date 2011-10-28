//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.25 at 06:58:08 PM EDT 
//


package edu.ncsu.csc573.project.common.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Register" type="{http://www.doogle.project.csc573.csc.ncsu.edu}RegisterType"/>
 *         &lt;element name="Login" type="{http://www.doogle.project.csc573.csc.ncsu.edu}LoginType"/>
 *         &lt;element name="Logout" type="{http://www.doogle.project.csc573.csc.ncsu.edu}LogoutType"/>
 *         &lt;element name="ForgotPWD" type="{http://www.doogle.project.csc573.csc.ncsu.edu}ForgotPWDType"/>
 *         &lt;element name="Search" type="{http://www.doogle.project.csc573.csc.ncsu.edu}SearchType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommandType", propOrder = {
    "register",
    "login",
    "logout",
    "forgotPWD",
    "search"
})
public class CommandType {

    @XmlElement(name = "Register")
    protected RegisterType register;
    @XmlElement(name = "Login")
    protected LoginType login;
    @XmlElement(name = "Logout")
    protected LogoutType logout;
    @XmlElement(name = "ForgotPWD")
    protected ForgotPWDType forgotPWD;
    @XmlElement(name = "Search")
    protected SearchType search;

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterType }
     *     
     */
    public RegisterType getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterType }
     *     
     */
    public void setRegister(RegisterType value) {
        this.register = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link LoginType }
     *     
     */
    public LoginType getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginType }
     *     
     */
    public void setLogin(LoginType value) {
        this.login = value;
    }

    /**
     * Gets the value of the logout property.
     * 
     * @return
     *     possible object is
     *     {@link LogoutType }
     *     
     */
    public LogoutType getLogout() {
        return logout;
    }

    /**
     * Sets the value of the logout property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoutType }
     *     
     */
    public void setLogout(LogoutType value) {
        this.logout = value;
    }

    /**
     * Gets the value of the forgotPWD property.
     * 
     * @return
     *     possible object is
     *     {@link ForgotPWDType }
     *     
     */
    public ForgotPWDType getForgotPWD() {
        return forgotPWD;
    }

    /**
     * Sets the value of the forgotPWD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForgotPWDType }
     *     
     */
    public void setForgotPWD(ForgotPWDType value) {
        this.forgotPWD = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link SearchType }
     *     
     */
    public SearchType getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType }
     *     
     */
    public void setSearch(SearchType value) {
        this.search = value;
    }

}
