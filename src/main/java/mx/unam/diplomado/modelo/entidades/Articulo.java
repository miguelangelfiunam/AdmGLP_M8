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
 * Clase Articulo
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 16/02/2022 - 16/02/2022
 *
 */
@Entity
@Table(name = "c_articulo")
public class Articulo {

    private Integer id;
    private String nombre;
    private Double precio;
    private Date fecreg;
    private Date fecact;
    private Integer estatus;

    @Id
    @Column(name = "id_articulo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "articulo_vc_nombre", length = 70)
    @NotNull
    public String getNombre() {
        return nombre;
    }

    @Column(name = "articulo_d_precio_articulo", precision = 19, scale = 2)
    @NotNull
    public Double getPrecio() {
        return precio;
    }

    @Column(name = "articulo_dt_fecha_registro", columnDefinition = "DATETIME")
    @NotNull
    public Date getFecreg() {
        return fecreg;
    }

    @Column(name = "articulo_dt_fecha_actualizacion", columnDefinition = "DATETIME")
    public Date getFecact() {
        return fecact;
    }

    @Column(name = "articulo_si_estatus")
    @NotNull
    public Integer getEstatus() {
        return estatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
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
        return "Articulo{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fecreg=" + fecreg + ", fecact=" + fecact + ", estatus=" + estatus + '}';
    }
}
