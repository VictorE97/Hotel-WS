//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.10 at 12:45:18 AM CDT 
//


package com.proyectosw.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEstancia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaCheckOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idEstancia",
    "fechaCheckOut"
})
@XmlRootElement(name = "RealizarCheckOutRequest")
public class RealizarCheckOutRequest {

    protected int idEstancia;
    @XmlElement(required = true)
    protected String fechaCheckOut;

    /**
     * Gets the value of the idEstancia property.
     * 
     */
    public int getIdEstancia() {
        return idEstancia;
    }

    /**
     * Sets the value of the idEstancia property.
     * 
     */
    public void setIdEstancia(int value) {
        this.idEstancia = value;
    }

    /**
     * Gets the value of the fechaCheckOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCheckOut() {
        return fechaCheckOut;
    }

    /**
     * Sets the value of the fechaCheckOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCheckOut(String value) {
        this.fechaCheckOut = value;
    }

}
