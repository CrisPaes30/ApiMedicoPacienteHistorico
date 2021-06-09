package br.com.cristianpaes.apimedicoepacientes.Services;

import br.com.cristianpaes.apimedicoepacientes.Entities.HistoricoEntity;
import br.com.cristianpaes.apimedicoepacientes.Entities.MedicoEntity;
import br.com.cristianpaes.apimedicoepacientes.Repositories.HistoricoRepository;
import br.com.cristianpaes.apimedicoepacientes.Repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

     @Autowired
     MedicoRepository medicoRepository;

     @Autowired
     HistoricoRepository historicoRepository;

     public List<MedicoEntity> findAll(){
         return medicoRepository.findAll();
     }

     public MedicoEntity findById(Long id){
         return medicoRepository.findById(id).orElse(null);
     }


     public MedicoEntity create(MedicoEntity medico){
         return medicoRepository.save(medico);
     }

     public MedicoEntity update(MedicoEntity medico){
         return medicoRepository.save(medico);
     }

    public void delete(Long id){
        this.medicoRepository.deleteById(id);
    }


}
