package mx.unam.diplomado.modelo.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * Clase rol que hace match con el catalogo de roles
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 20/11/2021 - 20/11/2021
 *
 */
@Entity
@Table(name = "c_rol")
public class Rol {

    private Integer idrol; // Identificador del rol
    private String nombre; // Nombre del rol
    private String tipo; // Tipo del rol
    private Date fecreg; // Fecha de registro
    private Date fecact; // Fecha de actualizacion
    private Integer estatus; // Estatus del registro en la base

    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdrol() {
        return idrol;
    }

    @Column(name = "rol_vc_nombre", length = 50)
    @NotNull
    public String getNombre() {
        return nombre;
    }

    @Column(name = "rol_c_tipo_rol", length = 1, columnDefinition = "CHAR")
    @NotNull
    public String getTipo() {
        return tipo;
    }

    @Column(name = "rol_dt_fecha_registro", columnDefinition = "DATETIME", nullable = false)
    public Date getFecreg() {
        return fecreg;
    }

    @Column(name = "rol_dt_fecha_actualizacion", columnDefinition = "DATETIME", nullable = true)
    public Date getFecact() {
        return fecact;
    }

    @Column(name = "rol_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "Rol{" + "idrol=" + idrol + ", nombre=" + nombre + ", tipo=" + tipo + ", fecreg=" + fecreg + ", fecact=" + fecact + ", estatus=" + estatus + '}';
    }
}
