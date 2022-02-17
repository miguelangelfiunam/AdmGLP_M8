package mx.unam.diplomado.service;

import java.util.List;

import mx.unam.diplomado.modelo.entidades.Usuario;

public interface UsuarioService {

    List<Usuario> getUsuarios();

    void guardaUsuario(Usuario usuario);

    Usuario getUsuario(Integer id);

    void eliminaUsuario(Integer id);
}
