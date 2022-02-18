package mx.unam.diplomado.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.unam.diplomado.modelo.entidades.Contra;

@Repository("contraRepository")
public interface ContraRepository extends JpaRepository<Contra, Integer> {

}
