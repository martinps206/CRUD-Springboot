package com.martinps.Service.PersonaServiceIMPL;

import com.martinps.Entity.Persona;
import com.martinps.Repository.PersonaRepo;
import com.martinps.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceIMPL implements PersonaService {
    @Autowired
    private PersonaRepo personaRepo;

    @Override
    public List<Persona> consultarPersona() {
        return (List<Persona>) this.personaRepo.findAll();
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return this.personaRepo.save(persona);
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return this.personaRepo.save(persona);
    }

    @Override
    public Persona buscarpersona(int id) {
        return this.personaRepo.findById(id).get();
    }

    @Override
    public void eliminarPersona(int id) {
        this.personaRepo.deleteById(id);
    }
}
