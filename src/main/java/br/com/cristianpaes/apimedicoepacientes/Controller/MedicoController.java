package br.com.cristianpaes.apimedicoepacientes.Controller;

import br.com.cristianpaes.apimedicoepacientes.DTO.DepartmentDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Medico;
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
    public List<Medico> findAll(){
        return medicoService.findAll();
    }

    @GetMapping("/{id}")
    public Medico findById(@PathVariable("id") final Long id){
        return medicoService.findById(id);
    }


    @PostMapping
    public void create(@RequestBody final Medico medico){
        this.medicoService.create(medico);
    }

    @PutMapping
    public void update(@RequestBody final Medico medico){
        this.medicoService.update(medico);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Long id){
        this.medicoService.delete(id);
    }

    @GetMapping("/group")
    public List<DepartmentDTO> findGroup(){
        return medicoService.findGroup();
    }
}
