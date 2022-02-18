package mx.unam.diplomado.service;

import java.util.List;

import mx.unam.diplomado.modelo.entidades.Contra;

/**
 * Interfaz para definir metodos de la entidad Contra
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 18/02/2022
 *
 */
public interface ContraService {

    List<Contra> getContras();

    void guardaContra(Contra contra);

    Contra getContra(Integer id);

    void eliminaContra(Integer id);
}
