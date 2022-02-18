package mx.unam.diplomado.service;

import java.util.List;
import mx.unam.diplomado.modelo.entidades.Contra;
import mx.unam.diplomado.modelo.repository.ContraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementacion del servicio ContraService
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 18/02/2022
 *
 */
@Service
public class ContraServiceImpl implements ContraService {
    
    @Autowired
    ContraRepository contraRepository;
    
    @Override
    public List<Contra> getContras() {
        return contraRepository.findAll();
    }
    
    @Override
    public void guardaContra(Contra contra) {
        contraRepository.save(contra);
    }
    
    @Override
    public Contra getContra(Integer id) {
        return contraRepository.findById(id).orElse(null);
    }
    
    @Override
    public void eliminaContra(Integer id) {
        contraRepository.deleteById(id);
    }
    
}
