package com.martinps.Service;

import com.martinps.Entity.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> consultarPersona();
    public Persona crearPersona(Persona persona);
    public Persona modificarPersona(Persona persona);
    public Persona buscarpersona(int id);
    public void eliminarPersona(int id);

}
