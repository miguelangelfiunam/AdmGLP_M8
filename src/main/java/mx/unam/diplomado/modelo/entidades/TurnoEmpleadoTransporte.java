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
 * Clase Turno Empleado Transporte
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 17/02/2022
 *
 */
@Entity
@Table(name = "tr_turno_empleado_transporte")
public class TurnoEmpleadoTransporte {

    private Integer id;
    private Date fecEntrada;
    private Date fecSalida;
    private Integer estatus;

    @Id
    @Column(name = "id_turno_empleado_transporte")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "turno_emp_trans_dt_fecha_entrada", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecEntrada() {
        return fecEntrada;
    }

    @Column(name = "turno_emp_trans_dt_fecha_salida", columnDefinition = "DATETIME")
    public Date getFecSalida() {
        return fecSalida;
    }

    @Column(name = "turno_emp_trans_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFecEntrada(Date fecEntrada) {
        this.fecEntrada = fecEntrada;
    }

    public void setFecSalida(Date fecSalida) {
        this.fecSalida = fecSalida;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

}
