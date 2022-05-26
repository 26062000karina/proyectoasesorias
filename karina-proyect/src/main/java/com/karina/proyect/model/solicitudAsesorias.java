// Generated with g9.

package com.karina.proyect.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="solicitudAsesorias")
public class solicitudAsesorias implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	/** Primary key. */
    protected static final String PK = "idSolicitud";

    

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int idSolicitud;
    @Column(nullable=false, length=80)
    private String nombreCompleto;
    @Column(nullable=false, length=80)
    private String asesor;
    @Column(nullable=false, length=50)
    private String materiaSolicitada;
    @Column(nullable=false, length=30)
    private String fechaSolicitud;
    @Column(nullable=false, length=30)
    private String fechaInicio;
    @Column(nullable=false, length=30)
    private String fechaFin;

    /** Default constructor. */
    public solicitudAsesorias() {
        super();
    }

    /**
     * Access method for idSolicitud.
     *
     * @return the current value of idSolicitud
     */
    public int getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * Setter method for idSolicitud.
     *
     * @param aIdSolicitud the new value for idSolicitud
     */
    public void setIdSolicitud(int aIdSolicitud) {
        idSolicitud = aIdSolicitud;
    }

    /**
     * Access method for nombreCompleto.
     *
     * @return the current value of nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Setter method for nombreCompleto.
     *
     * @param aNombreCompleto the new value for nombreCompleto
     */
    public void setNombreCompleto(String aNombreCompleto) {
        nombreCompleto = aNombreCompleto;
    }

    /**
     * Access method for asesor.
     *
     * @return the current value of asesor
     */
    public String getAsesor() {
        return asesor;
    }

    /**
     * Setter method for asesor.
     *
     * @param aAsesor the new value for asesor
     */
    public void setAsesor(String aAsesor) {
        asesor = aAsesor;
    }

    /**
     * Access method for materiaSolicitada.
     *
     * @return the current value of materiaSolicitada
     */
    public String getMateriaSolicitada() {
        return materiaSolicitada;
    }

    /**
     * Setter method for materiaSolicitada.
     *
     * @param aMateriaSolicitada the new value for materiaSolicitada
     */
    public void setMateriaSolicitada(String aMateriaSolicitada) {
        materiaSolicitada = aMateriaSolicitada;
    }

    /**
     * Access method for fechaSolicitud.
     *
     * @return the current value of fechaSolicitud
     */
    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Setter method for fechaSolicitud.
     *
     * @param aFechaSolicitud the new value for fechaSolicitud
     */
    public void setFechaSolicitud(String aFechaSolicitud) {
        fechaSolicitud = aFechaSolicitud;
    }

    /**
     * Access method for fechaInicio.
     *
     * @return the current value of fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Setter method for fechaInicio.
     *
     * @param aFechaInicio the new value for fechaInicio
     */
    public void setFechaInicio(String aFechaInicio) {
        fechaInicio = aFechaInicio;
    }

    /**
     * Access method for fechaFin.
     *
     * @return the current value of fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * Setter method for fechaFin.
     *
     * @param aFechaFin the new value for fechaFin
     */
    public void setFechaFin(String aFechaFin) {
        fechaFin = aFechaFin;
    }

    /**
     * Compares the key for this instance with another SolicitudAsesorias.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SolicitudAsesorias and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof solicitudAsesorias)) {
            return false;
        }
        solicitudAsesorias that = (solicitudAsesorias) other;
        if (this.getIdSolicitud() != that.getIdSolicitud()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SolicitudAsesorias.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof solicitudAsesorias)) return false;
        return this.equalKeys(other) && ((solicitudAsesorias)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdSolicitud();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[SolicitudAsesorias |");
        sb.append(" idSolicitud=").append(getIdSolicitud());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idSolicitud", Integer.valueOf(getIdSolicitud()));
        return ret;
    }

}
