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
 * Clase Estatus
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 16/02/2022 - 16/02/2022
 *
 */
@Entity
@Table(name = "c_estatus")
public class Estatus {

    private Integer id;
    private Integer numeroEstatus;
    private String tabla;
    private String nombreEstatus;
    private String descripcion;
    private Date fecRegistro; // Fecha de Inicio de acceso a la aplicacion
    private Date fecActualizacion; // Fecha de fin de acceso a la aplicacion
    private String activo; // Estado del usuario

    @Id
    @Column(name = "id_estatus")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "estatus_si_num_estatus")
    @NotNull
    public Integer getNumeroEstatus() {
        return numeroEstatus;
    }

    @Column(name = "estatus_vc_nom_tabla", length = 50)
    @NotNull
    public String getTabla() {
        return tabla;
    }

    @Column(name = "estatus_vc_nombre_estatus", length = 50)
    @NotNull
    public String getNombreEstatus() {
        return nombreEstatus;
    }

    @Column(name = "estatus_vc_descripcion", length = 200)
    @NotNull
    public String getDescripcion() {
        return descripcion;
    }

    @Column(name = "estatus_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecRegistro() {
        return fecRegistro;
    }

    @Column(name = "estatus_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecActualizacion() {
        return fecActualizacion;
    }
    
    @Column(name = "estatus_c_activo", length = 1)
    @NotNull
    public String getActivo() {
        return activo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumeroEstatus(Integer numeroEstatus) {
        this.numeroEstatus = numeroEstatus;
    }

    public void setNombreEstatus(String nombreEstatus) {
        this.nombreEstatus = nombreEstatus;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
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

    public void setActivo(String activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Estatus{" + "id=" + id + ", numeroEstatus=" + numeroEstatus + ", tabla=" + tabla + ", nombreEstatus=" + nombreEstatus + ", descripcion=" + descripcion + ", fecRegistro=" + fecRegistro + ", fecActualizacion=" + fecActualizacion + ", activo=" + activo + '}';
    }
}
