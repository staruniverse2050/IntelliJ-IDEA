package com.example.Proyecto.Controller;

import com.example.Proyecto.Entity.Paciente;
import com.example.Proyecto.Service.PersonaServiceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class Controlador {
    @Autowired
    private PSIMPL impl;
    @GetMapping
    @RequestMapping(value = "ConsultarPacientes",method = RequestMethod.GET)
    public ResponseEntity<?>ConsultarPacientes(){
        List<Paciente>listarPaciente=this.impl.ConsultarPaciente();
        return ResponseEntity.ok(listarPaciente);

    }
    @PutMapping
    @RequestMapping(value = "CrearPacientes",method = RequestMethod.POST)
    public ResponseEntity<?>CrearPacientes(@RequestBody Paciente paciente){
        Paciente PacienteCreado=this.impl.CrearPaciente(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(PacienteCreado);
    }

    @GetMapping
    @RequestMapping(value = "ModificarPacientes",method = RequestMethod.POST)
    public ResponseEntity<?>ModificarPacientes(@RequestBody Paciente paciente){
        Paciente PacienteModificado=this.impl.ModificarPaciente(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(PacienteModificado);
    }
    @GetMapping
    @RequestMapping(value = "BuscarPacientes/{id}",method = RequestMethod.POST)
    public ResponseEntity<?>BuscarPacientes(@PathVariable int id){
        ResponseEntity<?> paciente=this.BuscarPacientes(id);
        return ResponseEntity.ok(paciente);
    }
}
