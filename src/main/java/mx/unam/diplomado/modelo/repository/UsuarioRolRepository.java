package mx.unam.diplomado.modelo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.unam.diplomado.modelo.entidades.Usuario_rol;

@Repository("usuarioRolRepository")
public interface UsuarioRolRepository extends JpaRepository<Usuario_rol, Integer> {

    List<Usuario_rol> findByEstatus(Integer estatus);
    
    boolean existsByUsuarioIdusuarioAndRolIdrol(Integer idUsuario, Integer idRol);
}
