
package com.concesionario.automovil.persistencia;

import com.concesionario.automovil.logica.Automovil;
import com.concesionario.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutos(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
