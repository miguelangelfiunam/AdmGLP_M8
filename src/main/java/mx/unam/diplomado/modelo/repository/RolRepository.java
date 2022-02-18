package mx.unam.diplomado.modelo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.unam.diplomado.modelo.entidades.Rol;

@Repository("rolRepository")
public interface RolRepository extends JpaRepository<Rol, Integer> {

    List<Rol> findByEstatus(Integer estatus);
}
