//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.15 at 06:04:50 PM UTC 
//


package com.proyectosw.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="numHabitacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numAdultos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numNinos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaCheckIn" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaCheckOut" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "numHabitacion",
    "numAdultos",
    "numNinos",
    "fechaCheckIn",
    "fechaCheckOut",
    "idCliente"
})
@XmlRootElement(name = "RegistrarCheckInRequest")
public class RegistrarCheckInRequest {

    protected int numHabitacion;
    protected int numAdultos;
    protected int numNinos;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCheckIn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCheckOut;
    protected int idCliente;

    /**
     * Gets the value of the numHabitacion property.
     * 
     */
    public int getNumHabitacion() {
        return numHabitacion;
    }

    /**
     * Sets the value of the numHabitacion property.
     * 
     */
    public void setNumHabitacion(int value) {
        this.numHabitacion = value;
    }

    /**
     * Gets the value of the numAdultos property.
     * 
     */
    public int getNumAdultos() {
        return numAdultos;
    }

    /**
     * Sets the value of the numAdultos property.
     * 
     */
    public void setNumAdultos(int value) {
        this.numAdultos = value;
    }

    /**
     * Gets the value of the numNinos property.
     * 
     */
    public int getNumNinos() {
        return numNinos;
    }

    /**
     * Sets the value of the numNinos property.
     * 
     */
    public void setNumNinos(int value) {
        this.numNinos = value;
    }

    /**
     * Gets the value of the fechaCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCheckIn() {
        return fechaCheckIn;
    }

    /**
     * Sets the value of the fechaCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCheckIn(XMLGregorianCalendar value) {
        this.fechaCheckIn = value;
    }

    /**
     * Gets the value of the fechaCheckOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCheckOut() {
        return fechaCheckOut;
    }

    /**
     * Sets the value of the fechaCheckOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCheckOut(XMLGregorianCalendar value) {
        this.fechaCheckOut = value;
    }

    /**
     * Gets the value of the idCliente property.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

}
