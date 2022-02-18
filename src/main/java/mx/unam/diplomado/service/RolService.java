package mx.unam.diplomado.service;

import java.util.List;

import mx.unam.diplomado.modelo.entidades.Rol;

/**
 * Interfaz para definir metodos de la entidad Rol
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 18/02/2022
 *
 */
public interface RolService {

    List<Rol> getRoles();
    
    List<Rol> getRolesPorEstatus(Integer estatus);

    void guardaRol(Rol rol);

    Rol getRol(Integer id);

    void eliminaRol(Integer id);
}
