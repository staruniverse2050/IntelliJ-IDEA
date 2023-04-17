package com.example.Proyecto.Service;

import com.example.Proyecto.Entity.Paciente;

import java.util.List;

public interface PersonaService {
    public List<Paciente> ConsultarPaciente();
    public Paciente CrearPaciente(Paciente paciente);
    public Paciente ModificarPaciente(Paciente paciente);
    public Paciente BuscarPaciente(int id);
    public void EliminarPaciente(int id);


}
