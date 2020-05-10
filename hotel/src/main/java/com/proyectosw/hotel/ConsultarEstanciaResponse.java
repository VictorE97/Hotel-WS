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
 *         &lt;element name="numHabitacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numAdultos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numNinos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoHabitacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaCheckIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaCheckOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "tipoHabitacion",
    "fechaCheckIn",
    "fechaCheckOut",
    "status",
    "precio",
    "idCliente"
})
@XmlRootElement(name = "ConsultarEstanciaResponse")
public class ConsultarEstanciaResponse {

    protected int numHabitacion;
    protected int numAdultos;
    protected int numNinos;
    @XmlElement(required = true)
    protected String tipoHabitacion;
    @XmlElement(required = true)
    protected String fechaCheckIn;
    @XmlElement(required = true)
    protected String fechaCheckOut;
    @XmlElement(required = true)
    protected String status;
    protected double precio;
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
     * Gets the value of the tipoHabitacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     * Sets the value of the tipoHabitacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoHabitacion(String value) {
        this.tipoHabitacion = value;
    }

    /**
     * Gets the value of the fechaCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCheckIn() {
        return fechaCheckIn;
    }

    /**
     * Sets the value of the fechaCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCheckIn(String value) {
        this.fechaCheckIn = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
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
