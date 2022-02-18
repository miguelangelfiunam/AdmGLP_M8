package mx.unam.diplomado.service;

import java.util.List;
import mx.unam.diplomado.modelo.entidades.Estatus;

public interface EstatusService {

    List<Estatus> getEstatus();

    List<Estatus> getEstatusPorTabla(String tabla);

    void guardaEstatus(Estatus estatus);

    Estatus getEstatus(Integer id);

    void eliminaEstatus(Integer id);
}
