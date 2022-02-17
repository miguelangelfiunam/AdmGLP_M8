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
 * Clase Acceso
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 16/02/2022 - 16/02/2022
 *
 */
@Entity
@Table(name = "t_acceso")
public class Acceso {

    private Integer id;
    private Date fecInicio;
    private Date fecFin;
    private String descripcion;
    private Date fecRegistro;
    private Date fecActualizacion;
    private Integer estatus;
    
    @Id
    @Column(name = "id_acceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    
    @Column(name = "acceso_dt_fecha_Inicio_acceso", columnDefinition = "DATE")
    public Date getFecInicio() {
        return fecInicio;
    }
    
    @Column(name = "acceso_dt_fecha_fin_acceso", columnDefinition = "DATE")
    public Date getFecFin() {
        return fecFin;
    }
    
    @Column(name = "acceso_descripcion", length = 150)
    @NotNull
    public String getDescripcion() {
        return descripcion;
    }
    
    @Column(name = "acceso_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecRegistro() {
        return fecRegistro;
    }
    
    @Column(name = "acceso_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecActualizacion() {
        return fecActualizacion;
    }
    
    @Column(name = "acceso_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return "Acceso{" + "id=" + id + ", fecInicio=" + fecInicio + ", fecFin=" + fecFin + ", descripcion=" + descripcion + ", fecRegistro=" + fecRegistro + ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus + '}';
    }
}
