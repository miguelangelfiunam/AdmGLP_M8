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
 * Clase Empleado
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 17/02/2022
 *
 */
@Entity
@Table(name = "c_empleado")
public class Empleado {

    private Integer id;
    private Integer numTrab;
    private String numSS;
    private String rfc;
    private Date fecRegistro;
    private Date fecActualizacion;
    private Integer estatus;

    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "empleado_i_num_trab", unique = true)
    @NotNull
    public Integer getNumTrab() {
        return numTrab;
    }

    @Column(name = "empleado_i_numero_ss", length = 15, unique = true)
    @NotNull
    public String getNumSS() {
        return numSS;
    }

    @Column(name = "empleado_c_rfc_trab", length = 13, unique = true)
    @NotNull
    public String getRfc() {
        return rfc;
    }

    @Column(name = "empleado_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecRegistro() {
        return fecRegistro;
    }

    @Column(name = "empleado_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecActualizacion() {
        return fecActualizacion;
    }

    @Column(name = "empleado_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumTrab(Integer numTrab) {
        this.numTrab = numTrab;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
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
        return "Empleado{" + "id=" + id + ", numTrab=" + numTrab + ", numSS=" + numSS + ", rfc=" + rfc + ", fecRegistro=" + fecRegistro + ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus + '}';
    }
}
