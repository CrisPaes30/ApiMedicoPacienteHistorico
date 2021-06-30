package br.com.cristianpaes.apimedicoepacientes.Services;

import br.com.cristianpaes.apimedicoepacientes.DTO.DepartmentDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Medico;
import br.com.cristianpaes.apimedicoepacientes.Repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

     @Autowired
     MedicoRepository medicoRepository;


     public List<Medico> findAll(){
         return medicoRepository.findAll();
     }

     public Medico findById(Long id){
         return medicoRepository.findById(id).orElse(null);
     }


     public Medico create(Medico medico){
         return medicoRepository.save(medico);
     }

     public Medico update(Medico medico){
         return medicoRepository.save(medico);
     }

    public void delete(Long id){
        this.medicoRepository.deleteById(id);
    }


    public List<DepartmentDTO> findGroup(){
         return medicoRepository.findByOrderByDepartamentoDesc();
    }

    


}
