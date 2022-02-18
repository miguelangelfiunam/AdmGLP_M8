/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.diplomado.service;

import java.util.List;
import mx.unam.diplomado.modelo.entidades.Estatus;
import mx.unam.diplomado.modelo.repository.EstatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author unam
 */
@Service
public class EstatusServiceImpl implements EstatusService {
    
    @Autowired
    EstatusRepository estatusRepository;
    
    @Override
    public List<Estatus> getEstatus() {
        return estatusRepository.findAll();
    }
    
    @Override
    public List<Estatus> getEstatusPorTabla(String tabla) {
        return estatusRepository.findByTabla(tabla);
    }
    
    @Override
    public void guardaEstatus(Estatus estatus) {
        estatusRepository.save(estatus);
    }
    
    @Override
    public Estatus getEstatus(Integer id) {
        return estatusRepository.findById(id).orElse(null);
    }
    
    @Override
    public void eliminaEstatus(Integer id) {
        estatusRepository.deleteById(id);
    }
    
}
