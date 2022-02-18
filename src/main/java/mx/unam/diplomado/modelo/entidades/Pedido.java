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
 * Clase Estado
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 17/02/2022
 *
 */
@Entity
@Table(name = "t_pedido")
public class Pedido {

    private Integer id;
    private Double total;
    private Date fecpedido;
    private Date fecentrega;
    private Integer pago;
    private String observacion;
    private Date fecreg;
    private Date fecact;
    private Integer estatus;

    @Id
    @Column(name = "id_pedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "pedido_d_total", precision = 19, scale = 2)
    @NotNull
    public Double getTotal() {
        return total;
    }

    @Column(name = "pedido_dt_fecha_pedido", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecpedido() {
        return fecpedido;
    }

    @Column(name = "pedido_dt_fecha_entrega", columnDefinition = "DATETIME")
    public Date getFecentrega() {
        return fecentrega;
    }

    @Column(name = "pedido_i_tipo_pago")
    @NotNull
    public Integer getPago() {
        return pago;
    }

    @Column(name = "pedido_vc_observacion", length = 250)
    @NotNull
    public String getObservacion() {
        return observacion;
    }

    @Column(name = "pedido_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecreg() {
        return fecreg;
    }

    @Column(name = "pedido_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecact() {
        return fecact;
    }

    @Column(name = "pedido_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setFecpedido(Date fecpedido) {
        this.fecpedido = fecpedido;
    }

    public void setFecentrega(Date fecentrega) {
        this.fecentrega = fecentrega;
    }

    public void setPago(Integer pago) {
        this.pago = pago;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
        return "Pedido{" + "id=" + id + ", total=" + total + ", fecpedido=" + fecpedido + ", fecentrega=" + fecentrega + ", pago=" + pago + ", observacion=" + observacion + ", fecreg=" + fecreg + ", fecact=" + fecact + ", estatus=" + estatus + '}';
    }
}
