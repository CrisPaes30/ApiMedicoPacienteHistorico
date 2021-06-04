package br.com.cristianpaes.apimedicoepacientes.Controller;

import br.com.cristianpaes.apimedicoepacientes.Entities.MedicoEntity;
import br.com.cristianpaes.apimedicoepacientes.Services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    MedicoService medicoService;


    @GetMapping
    public List<MedicoEntity> findAll(){
        return medicoService.findAll();
    }

    @GetMapping("/{id}")
    public MedicoEntity findById(@PathVariable("id") final Long id){
        return medicoService.findById(id);
    }

    @GetMapping("/greaterThan{id}")
    public List<MedicoEntity> findByGroupMedico(){
        return medicoService.findByIdMedico();
    }

    @PostMapping
    public void create(@RequestBody final MedicoEntity medico){
        this.medicoService.create(medico);
    }

    @PutMapping
    public void update(@RequestBody final MedicoEntity medico){
        this.medicoService.update(medico);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Long id){
        this.medicoService.delete(id);
    }
}
