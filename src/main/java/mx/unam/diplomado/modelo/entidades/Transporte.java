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
 * Clase Transporte
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 17/02/2022
 *
 */
@Entity
@Table(name = "c_transporte")
public class Transporte {

    private Integer id;
    private Integer numUnidad;
    private Integer modelo;
    private String placas;
    private String marca;
    private Date fecRegistro;
    private Date fecActualizacion;
    private Integer estatus;

    @Id
    @Column(name = "id_transporte")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "trans_i_numero_unidad")
    @NotNull
    public Integer getNumUnidad() {
        return numUnidad;
    }

    @Column(name = "trans_i_modelo")
    @NotNull
    public Integer getModelo() {
        return modelo;
    }

    @Column(name = "trans_vc_placas")
    @NotNull
    public String getPlacas() {
        return placas;
    }

    @Column(name = "trans_vc_marca")
    @NotNull
    public String getMarca() {
        return marca;
    }

    @Column(name = "trans_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecRegistro() {
        return fecRegistro;
    }

    @Column(name = "trans_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecActualizacion() {
        return fecActualizacion;
    }

    @Column(name = "trans_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumUnidad(Integer numUnidad) {
        this.numUnidad = numUnidad;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        return "Transporte{" + "id=" + id + ", numUnidad=" + numUnidad + ", modelo=" + modelo + ", placas=" + placas + ", marca=" + marca + ", fecRegistro=" + fecRegistro + ", fecActualizacion=" + fecActualizacion + ", estatus=" + estatus + '}';
    }
}
