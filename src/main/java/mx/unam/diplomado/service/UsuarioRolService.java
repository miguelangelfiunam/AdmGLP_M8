package mx.unam.diplomado.service;

import java.util.List;

import mx.unam.diplomado.modelo.entidades.Usuario_rol;

/**
 * Interfaz para definir metodos de la entidad UsuarioRol
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 18/02/2022
 *
 */
public interface UsuarioRolService {

    List<Usuario_rol> getUsuariosRoles();

    void guardaUsuarioRol(Usuario_rol usuarioRol);

    Usuario_rol getUsuarioRol(Integer id);

    void eliminaUsuarioRol(Integer id);
    
    boolean existeRelacionUsuarioRol(Integer idUsuario, Integer idRol);
}
