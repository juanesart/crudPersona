package com.sofkaU.crudPersona.servicios;

import com.sofkaU.crudPersona.entidades.Persona;
import com.sofkaU.crudPersona.repositorio.InterfaceRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiciosPersona implements InterfaceServiciosPersona{

    @Autowired
    private InterfaceRepositorioPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void borrar(int id) {

    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}