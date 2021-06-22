package br.com.cristianpaes.apimedicoepacientes.Services;

import br.com.cristianpaes.apimedicoepacientes.Entities.Paciente;
import br.com.cristianpaes.apimedicoepacientes.Repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {


    @Autowired
    PacienteRepository pacienteRepository;


    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }


    public Paciente findById(Long id){
        return pacienteRepository.findById(id).orElse(null);
    }

    public Paciente create(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public Paciente update(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public void delete(Long id){
        this.pacienteRepository.deleteById(id);
    }




}