package com.martinps.Repository;

import com.martinps.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo extends CrudRepository<Persona, Integer> {


}
