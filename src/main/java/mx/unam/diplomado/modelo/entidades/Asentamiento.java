/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.diplomado.modelo.entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Clase Asentamiento
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 16/02/2022 - 16/02/2022
 *
 */
@Entity
@Table(name = "c_asentamiento")
public class Asentamiento {

    private Integer id;
    private String clave;
    private String codigopostal;
    private String tipo;
    private String nombre;
    private Date fecreg;
    private Date fecact;
    private Integer estatus;

    @Id
    @Column(name = "id_asentamiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "asenta_c_clave", length = 4, unique = true)
    @NotNull
    public String getClave() {
        return clave;
    }

    @Column(name = "asenta_c_codigo_postal", length = 5)
    @NotNull
    public String getCodigopostal() {
        return codigopostal;
    }

    @Column(name = "asenta_vc_tipo", length = 70)
    @NotNull
    public String getTipo() {
        return tipo;
    }

    @Column(name = "asenta_vc_nombre", length = 150)
    @NotNull
    public String getNombre() {
        return nombre;
    }

    @Column(name = "acceso_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecreg() {
        return fecreg;
    }

    @Column(name = "acceso_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecact() {
        return fecact;
    }

    @Column(name = "acceso_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecreg(Date fecreg) {
        this.fecreg = fecreg;
    }

    public void setFecact(Date fecact) {
        this.fecact = fecact;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Asentamiento{" + "id=" + id + ", clave=" + clave + ", codigopostal=" + codigopostal + ", tipo=" + tipo + ", nombre=" + nombre + ", fecreg=" + fecreg + ", fecact=" + fecact + ", estatus=" + estatus + '}';
    }
}
