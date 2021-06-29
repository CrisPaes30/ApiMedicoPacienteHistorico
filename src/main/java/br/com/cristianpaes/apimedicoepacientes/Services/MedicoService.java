package br.com.cristianpaes.apimedicoepacientes.Services;

import br.com.cristianpaes.apimedicoepacientes.DTO.DepartmentDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.MedDpDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Medico;
import br.com.cristianpaes.apimedicoepacientes.Repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


    public DepartmentDTO findGroup(List<MedDpDTO> dto){

         List<MedDpDTO> dep = new ArrayList<>();

        Medico mdc = null;

         for(MedDpDTO md: dep){
             mdc = (Medico) medicoRepository.findByGroupMedico(md.getDepartamento());
         }
         return new DepartmentDTO(dep, mdc);
    }

    


}
