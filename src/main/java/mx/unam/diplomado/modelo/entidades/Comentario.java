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
 * Clase Comentario
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 16/02/2022 - 16/02/2022
 *
 */
@Entity
@Table(name = "t_comentario")
public class Comentario {

    private Integer id;
    private Integer numcomenatario;
    private String comentario;
    private String tipo;
    private Date fecreg;
    private Date fecact;
    private Integer estatus;

    @Id
    @Column(name = "id_comentario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "comentario_i_numero")
    @NotNull
    public Integer getNumcomenatario() {
        return numcomenatario;
    }

    @Column(name = "comentario_vc_comentario", length = 500)
    @NotNull
    public String getComentario() {
        return comentario;
    }

    @Column(name = "comentario_c_tipo", length = 1)
    @NotNull
    public String getTipo() {
        return tipo;
    }

    @Column(name = "comentario_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecreg() {
        return fecreg;
    }

    @Column(name = "comentario_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecact() {
        return fecact;
    }

    @Column(name = "comentario_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumcomenatario(Integer numcomenatario) {
        this.numcomenatario = numcomenatario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
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
        return "Comentario{" + "id=" + id + ", numcomenatario=" + numcomenatario + ", comentario=" + comentario + ", tipo=" + tipo + ", fecreg=" + fecreg + ", fecact=" + fecact + ", estatus=" + estatus + '}';
    }
}
