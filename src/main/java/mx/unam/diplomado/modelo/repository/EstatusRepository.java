package mx.unam.diplomado.modelo.repository;

import java.util.List;
import mx.unam.diplomado.modelo.entidades.Estatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author unam
 */
@Repository("estatusRepository")
public interface EstatusRepository extends JpaRepository<Estatus, Integer> {

    List<Estatus> findByTabla(String tabla);
}
