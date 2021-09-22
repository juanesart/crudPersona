package com.sofkaU.crudPersona.controlador;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.servicios.InterfaceServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InterfaceServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona>listarPersonas(){
        return servicio.listar();
    }

    @PostMapping(value = "/guardarPersonas")
    public Persona guardarPersonas(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }

    @GetMapping(value = "/listarPorId/{id}")
    public Persona listarPorId(@PathVariable Integer id){
        return servicio.listarId(id);
    }
}
