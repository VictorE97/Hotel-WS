//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.09 at 07:18:32 PM CDT 
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
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numCamas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cupoPersonas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoHabitacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "piso",
    "numCamas",
    "cupoPersonas",
    "tipoHabitacion",
    "status"
})
@XmlRootElement(name = "EditarHabitacionRequest")
public class EditarHabitacionRequest {

    protected int numHabitacion;
    protected int piso;
    protected int numCamas;
    protected int cupoPersonas;
    @XmlElement(required = true)
    protected String tipoHabitacion;
    @XmlElement(required = true)
    protected String status;

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
     * Gets the value of the piso property.
     * 
     */
    public int getPiso() {
        return piso;
    }

    /**
     * Sets the value of the piso property.
     * 
     */
    public void setPiso(int value) {
        this.piso = value;
    }

    /**
     * Gets the value of the numCamas property.
     * 
     */
    public int getNumCamas() {
        return numCamas;
    }

    /**
     * Sets the value of the numCamas property.
     * 
     */
    public void setNumCamas(int value) {
        this.numCamas = value;
    }

    /**
     * Gets the value of the cupoPersonas property.
     * 
     */
    public int getCupoPersonas() {
        return cupoPersonas;
    }

    /**
     * Sets the value of the cupoPersonas property.
     * 
     */
    public void setCupoPersonas(int value) {
        this.cupoPersonas = value;
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

}
