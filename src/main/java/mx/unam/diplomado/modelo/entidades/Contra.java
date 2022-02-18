package mx.unam.diplomado.modelo.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * Clase Contra donde se guardaran la contraseña del usuario cifrada
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 21/11/2021 - 21/11/2021
 *
 */
@Entity
@Table(name = "t_contra")
public class Contra {

    private Integer id;
    private Usuario usuario;
    private String contra;
    private Date fecreg; // Fecha de registro
    private Date fecact; // Fecha de actualizacion
    private Integer estatus; // Estatus del registro en la base

    public Contra(String contra, Date fecreg, Date fecact, Integer estatus) {
        this.contra = contra;
        this.fecreg = fecreg;
        this.fecact = fecact;
        this.estatus = estatus;
    }

    public Contra() {
    }

    @Id
    @Column(name = "id_contra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @OneToOne(mappedBy = "contra")
    public Usuario getUsuario() {
        return usuario;
    }

    @Column(name = "contra_vc_contra_cifrado", length = 500)
    @NotNull
    public String getContra() {
        return contra;
    }

    @Column(name = "contra_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecreg() {
        return fecreg;
    }

    @Column(name = "contra_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecact() {
        return fecact;
    }

    @Column(name = "contra_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
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
        return "Contra{" + "id=" + id + ", usuario=" + usuario + ", contra=" + contra + ", fecreg=" + fecreg + ", fecact=" + fecact + ", estatus=" + estatus + '}';
    }

}
