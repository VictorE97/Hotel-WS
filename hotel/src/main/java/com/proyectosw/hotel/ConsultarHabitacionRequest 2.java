//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.16 at 10:18:58 PM CDT 
//


package com.proyectosw.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
    "numHabitacion"
})
@XmlRootElement(name = "ConsultarHabitacionRequest")
public class ConsultarHabitacionRequest {

    protected int numHabitacion;

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

}
