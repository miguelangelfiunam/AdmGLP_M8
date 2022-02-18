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
    private Date fecinicio;
    private Date fecfin;
    private String descripcion;
    private Date fecreg;
    private Date fecact;
    private Integer estatus;

    @Id
    @Column(name = "id_acceso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "acceso_dt_fecha_Inicio_acceso", columnDefinition = "DATE")
    public Date getFecinicio() {
        return fecinicio;
    }

    @Column(name = "acceso_dt_fecha_fin_acceso", columnDefinition = "DATE")
    public Date getFecfin() {
        return fecfin;
    }

    @Column(name = "acceso_descripcion", length = 150)
    @NotNull
    public String getDescripcion() {
        return descripcion;
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

    public void setFecinicio(Date fecinicio) {
        this.fecinicio = fecinicio;
    }

    public void setFecfin(Date fecfin) {
        this.fecfin = fecfin;
    }

    public void setFecreg(Date fecreg) {
        this.fecreg = fecreg;
    }

    public void setFecact(Date fecact) {
        this.fecact = fecact;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Acceso{" + "id=" + id + ", fecinicio=" + fecinicio + ", fecfin=" + fecfin + ", descripcion=" + descripcion + ", fecreg=" + fecreg + ", fecact=" + fecact + ", estatus=" + estatus + '}';
    }

}
