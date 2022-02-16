package mx.unam.diplomado.forms;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author unam
 */
public class UsuarioForm {

    private Integer idUsuario; // Identificador de usuario

    @Size(min = 5, max = 50)
    private String apodo; // Seudonimo del usuario en la aplicacion

    @NotNull
    private String correo1; // Correo electronico

    @NotBlank
    private String correo2; // Correo electronico

    @Size(max = 50)
    @NotNull
    private String nombre; // Nombre de la persona 50

    @Size(max = 50)
    @NotNull
    private String apellido1; // Primer apellido 50

    @Size(max = 50)
    @NotNull
    private String apellido2; // Segundo apellido 50

    @NotNull
    private Integer edad;// Edad de la persona

    @NotNull
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date fechaNacimiento; // Fecha de nacimiento

    @NotNull
    @Size(max = 10)
    private String telefono1; // Telefono del usuario

    @NotNull
    @Size(max = 10)
    private String telefono2; // Segundo telefono de contacto

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getCorreo1() {
        return correo1;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }

    public String getCorreo2() {
        return correo2;
    }

    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    @Override
    public String toString() {
        return "UsuarioForm{" + "idUsuario=" + idUsuario + ", apodo=" + apodo + ", correo1=" + correo1 + ", correo2=" + correo2 + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + '}';
    }
}
