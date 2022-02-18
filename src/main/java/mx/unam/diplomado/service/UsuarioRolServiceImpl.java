package mx.unam.diplomado.service;

import java.util.List;
import mx.unam.diplomado.modelo.entidades.Usuario_rol;
import mx.unam.diplomado.modelo.repository.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementacion del servicio UsuarioRolService
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 18/02/2022
 *
 */
@Service
public class UsuarioRolServiceImpl implements UsuarioRolService {

    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    @Override
    public List<Usuario_rol> getUsuariosRoles() {
        return usuarioRolRepository.findAll();
    }

    @Override
    public void guardaUsuarioRol(Usuario_rol usuarioRol) {
        usuarioRolRepository.save(usuarioRol);
    }

    @Override
    public Usuario_rol getUsuarioRol(Integer id) {
        return usuarioRolRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminaUsuarioRol(Integer id) {
        usuarioRolRepository.deleteById(id);
    }

    @Override
    public boolean existeRelacionUsuarioRol(Integer idusuario, Integer idrol) {
        return usuarioRolRepository.existsByUsuarioIdusuarioAndRolIdrol(idusuario, idrol);
    }

}
