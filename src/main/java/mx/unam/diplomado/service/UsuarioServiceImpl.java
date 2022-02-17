package mx.unam.diplomado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.unam.diplomado.modelo.entidades.Usuario;
import mx.unam.diplomado.modelo.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getUsuarios() {
        // TODO Auto-generated method stub
        return usuarioRepository.findAll();
    }

    @Override
    public void guardaUsuario(Usuario usuario) {
        // TODO Auto-generated method stub
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario getUsuario(Integer id) {
        // TODO Auto-generated method stub
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminaUsuario(Integer id) {
        // TODO Auto-generated method stub
        usuarioRepository.deleteById(id);
    }

}
