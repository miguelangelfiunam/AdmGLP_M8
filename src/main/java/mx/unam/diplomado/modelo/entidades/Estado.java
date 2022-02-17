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
 * Clase Estado
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 17/02/2022
 *
 */
@Entity
@Table(name = "c_estado")
public class Estado {

    private Integer id;
    private String clave;
    private String nombre;
    private Date fecRegistro;
    private Date fecActualizacion;
    private Integer estatus;

    @Id
    @Column(name = "id_estado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "estado_c_clave", length = 2, unique = true)
    @NotNull
    public String getClave() {
        return clave;
    }

    @Column(name = "estado_vc_nombre", length = 100)
    @NotNull
    public String getNombre() {
        return nombre;
    }

    @Column(name = "estado_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecRegistro() {
        return fecRegistro;
    }

    @Column(name = "estado_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecActualizacion() {
        return fecActualizacion;
    }

    @Column(name = "estado_si_estatus")
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecRegistro(Date fecRegistro) {
        this.fecRegistro = fecRegistro;
    }

    public void setFecActualizacion(Date fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", clave=" + clave + ", nombre=" + nombre + ", fecRegistro=" + fecRegistro + ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus + '}';
    }
}