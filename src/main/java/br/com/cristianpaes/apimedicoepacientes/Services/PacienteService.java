package br.com.cristianpaes.apimedicoepacientes.Services;

import br.com.cristianpaes.apimedicoepacientes.Entities.PacienteEntity;
import br.com.cristianpaes.apimedicoepacientes.Repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {


    @Autowired
    PacienteRepository pacienteRepository;


    public List<PacienteEntity> findAll(){
        return pacienteRepository.findAll();
    }



    public PacienteEntity findById(Long id){
        return pacienteRepository.findById(id).orElse(null);
    }

    public PacienteEntity create(PacienteEntity paciente){
        return pacienteRepository.save(paciente);
    }

    public PacienteEntity update(PacienteEntity paciente){
        return pacienteRepository.save(paciente);
    }

    public void delete(Long id){
        this.pacienteRepository.deleteById(id);
    }




}