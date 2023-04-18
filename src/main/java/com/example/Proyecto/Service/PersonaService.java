package com.example.Proyecto.Service;

import com.example.Proyecto.Entity.Persona;

import java.util.List;

public interface PersonaService {
    public List<Persona> ConsulterPersona();
    public Persona CrearPersona(Persona persona);
    public Persona ModificarPersona(Persona persona);
    public Persona BuscarPersona(int id);
    public void EliminatorPersona(int id);


}
