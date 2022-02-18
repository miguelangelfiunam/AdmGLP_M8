package mx.unam.diplomado.service;

import java.util.List;
import mx.unam.diplomado.modelo.entidades.Rol;
import mx.unam.diplomado.modelo.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementacion del servicio RolService
 *
 * @author Miguel Angel Martinez Rivera
 * @version 1.0.0
 * @since 17/02/2022 - 18/02/2022
 *
 */
@Service
public class RolServiceImpl implements RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    @Override
    public List<Rol> getRoles() {
        return rolRepository.findAll();
    }
    
    @Override
    public void guardaRol(Rol rol) {
        rolRepository.save(rol);
    }
    
    @Override
    public Rol getRol(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }
    
    @Override
    public void eliminaRol(Integer id) {
        rolRepository.deleteById(id);
    }

    @Override
    public List<Rol> getRolesPorEstatus(Integer estatus) {
        return rolRepository.findByEstatus(estatus);
    }
    
}
