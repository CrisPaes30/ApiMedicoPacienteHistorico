package br.com.cristianpaes.apimedicoepacientes.Controller;

import br.com.cristianpaes.apimedicoepacientes.Entities.Paciente;
import br.com.cristianpaes.apimedicoepacientes.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private final List<Paciente> pacientes;

    @Autowired
    PacienteService pacienteService;


    public PacienteController(List<Paciente> pacientes) {
        this.pacientes = new ArrayList<>();
    }

    @GetMapping
    public List<Paciente> findAll(){
        return pacienteService.findAll();
    }


    @GetMapping("/{id}")
    public Paciente findById(@PathVariable("id") final Long id){
        return pacienteService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody final Paciente paciente){
        this.pacienteService.create(paciente);
    }

    @PutMapping
    public void update(@RequestBody final Paciente paciente){
        this.pacienteService.update(paciente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Long id){
        this.pacienteService.delete(id);
    }


}
