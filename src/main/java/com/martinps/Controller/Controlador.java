package com.martinps.Controller;

import com.martinps.Entity.Persona;
import com.martinps.Service.PersonaServiceIMPL.PersonaServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CrudRepositorio")
public class Controlador {

    @Autowired
    private PersonaServiceIMPL personaServiceIMPL;

    @GetMapping
    @RequestMapping(value = "/ConsultarPersona", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPersona(){
        List<Persona> listPersona = this.personaServiceIMPL.consultarPersona();
        return ResponseEntity.ok(listPersona);
    }

    @PostMapping
    @RequestMapping(value = "/CrearPersona", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPersona(@RequestBody Persona persona){
        Persona newPersona = this.personaServiceIMPL.crearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPersona);
    }

    @PutMapping
    @RequestMapping(value = "/ModificarPersona", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersona(@RequestBody Persona persona){
        Persona personaMod = this.personaServiceIMPL.modificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaMod);
    }

    @GetMapping
    @RequestMapping(value = "/BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        Persona persona = this.personaServiceIMPL.buscarpersona(id);
        return ResponseEntity.ok(persona);
    }

    @DeleteMapping
    @RequestMapping(value = "/EliminarPersona/{id}", method = RequestMethod.DELETE)
    public  ResponseEntity<?> EliminarPersona(@PathVariable int id){
        this.personaServiceIMPL.eliminarPersona(id);
        return ResponseEntity.ok().build();
    }

}
