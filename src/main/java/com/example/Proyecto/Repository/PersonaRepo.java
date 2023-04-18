package com.example.Proyecto.Repository;
import com.example.Proyecto.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
public interface PersonaRepo extends CrudRepository<Persona,Integer>{
}
