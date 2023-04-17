package com.example.Proyecto.Repository;
import com.example.Proyecto.Entity.Paciente;
import org.springframework.data.repository.CrudRepository;
public interface PersonaRepo extends CrudRepository<Paciente,Integer>{
}
