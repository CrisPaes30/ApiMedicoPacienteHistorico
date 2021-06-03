package br.com.cristianpaes.apimedicoepacientes.Controller;

import br.com.cristianpaes.apimedicoepacientes.Entities.PacienteEntity;
import br.com.cristianpaes.apimedicoepacientes.Repositories.PacienteRepository;
import br.com.cristianpaes.apimedicoepacientes.Services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private final List<PacienteEntity> pacientes;

    @Autowired
    PacienteService pacienteService;

    @Autowired
    PacienteRepository pacienteRepository;


    public PacienteController(List<PacienteEntity> pacientes) {
        this.pacientes = new ArrayList<>();
    }

    @GetMapping
    public List<PacienteEntity> findAll(){
        return pacienteService.findAll();
    }


    @GetMapping("/{id}")
    public PacienteEntity findById(@PathVariable("id") final Long id){
        return pacienteService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody final PacienteEntity paciente){
        this.pacienteService.create(paciente);
    }

    @PutMapping
    public void update(@RequestBody final PacienteEntity paciente){
        this.pacienteService.update(paciente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Long id){
        this.pacienteService.delete(id);
    }


}
