//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.15 a las 07:56:00 PM CDT 
//


package org.example.venta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elemento" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "elemento"
})
@XmlRootElement(name = "BuscarVentaResponse ")
public class BuscarVentaResponse_0020 {

    @XmlElement(required = true)
    protected List<BuscarVentaResponse_0020 .Elemento> elemento;

    /**
     * Gets the value of the elemento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elemento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElemento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuscarVentaResponse_0020 .Elemento }
     * 
     * 
     */
    public List<BuscarVentaResponse_0020 .Elemento> getElemento() {
        if (elemento == null) {
            elemento = new ArrayList<BuscarVentaResponse_0020 .Elemento>();
        }
        return this.elemento;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "id",
        "nombre",
        "codigo",
        "cantidad",
        "precio",
        "fecha"
    })
    public static class Elemento {

        protected int id;
        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String codigo;
        protected int cantidad;
        protected int precio;
        @XmlElement(required = true)
        protected String fecha;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidad.
         * 
         */
        public int getCantidad() {
            return cantidad;
        }

        /**
         * Define el valor de la propiedad cantidad.
         * 
         */
        public void setCantidad(int value) {
            this.cantidad = value;
        }

        /**
         * Obtiene el valor de la propiedad precio.
         * 
         */
        public int getPrecio() {
            return precio;
        }

        /**
         * Define el valor de la propiedad precio.
         * 
         */
        public void setPrecio(int value) {
            this.precio = value;
        }

        /**
         * Obtiene el valor de la propiedad fecha.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFecha() {
            return fecha;
        }

        /**
         * Define el valor de la propiedad fecha.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFecha(String value) {
            this.fecha = value;
        }

    }

}
