package com.example.Proyecto.Service.PersonaServiceIMPL;

import com.example.Proyecto.Entity.Paciente;
import com.example.Proyecto.Repository.PersonaRepo;
import com.example.Proyecto.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements PersonaService {
    @Autowired
    private PersonaRepo repo;
    @Override
    public List<Paciente> ConsultarPaciente() {
        return (List<Paciente>)this.repo.findAll();
    }

    @Override
    public Paciente CrearPaciente(Paciente paciente) {
        paciente.setEmail(paciente.getEmail());
        return this.repo.save(paciente);
    }

    @Override
    public Paciente ModificarPaciente(Paciente paciente) {
        return this.repo.save(paciente);
    }

    @Override
    public Paciente BuscarPaciente(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarPaciente(int id) {
        this.repo.deleteById(id);

    }
}
