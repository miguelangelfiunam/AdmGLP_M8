package mx.unam.diplomado.modelo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * Clase que hace match de una tabla intermedia entre usuario y rol
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 20/11/2021 - 20/11/2021
 *
 */
@Entity
@Table(name = "tr_usuario_rol")
public class Usuario_rol {

    private Integer idusuariorol;
    private Rol rol;
    private Usuario usuario;
    private Date fecreg; // Fecha de registro
    private Date fecact; // Fecha de actualizacion
    private Integer estatus;

    public Usuario_rol() {
    }

    public Usuario_rol(Rol rol, Usuario usuario, Date fecreg, Date fecact, Integer estatus) {
        this.rol = rol;
        this.usuario = usuario;
        this.fecreg = fecreg;
        this.fecact = fecact;
        this.estatus = estatus;
    }

    @Id
    @Column(name = "id_usuario_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdusuariorol() {
        return idusuariorol;
    }

    @ManyToOne(targetEntity = Rol.class, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_rol", nullable = false, referencedColumnName = "id_rol")
    public Rol getRol() {
        return rol;
    }
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    public Usuario getUsuario() {
        return usuario;
    }

    @Column(name = "usu_rol_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecreg() {
        return fecreg;
    }

    @Column(name = "usu_rol_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecact() {
        return fecact;
    }

    @Column(name = "usu_rol_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setIdusuariorol(Integer idusuariorol) {
        this.idusuariorol = idusuariorol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        return "Usuario_rol{" + "idusuariorol=" + idusuariorol + ", rol=" + rol + ", usuario=" + usuario + ", fecreg=" + fecreg + ", fecact=" + fecact + ", estatus=" + estatus + '}';
    }
}
