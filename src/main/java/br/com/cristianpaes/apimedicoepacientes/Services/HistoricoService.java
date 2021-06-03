package br.com.cristianpaes.apimedicoepacientes.Services;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoPacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.HpDTO;
import br.com.cristianpaes.apimedicoepacientes.Repositories.HistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistoricoService {

    @Autowired
    HistoricoRepository historicoRepository;

    @Autowired
    HpDTO hpDTO;

    public List<HistoricoPacienteDTO> findAll(){
        return historicoRepository.findAll()
                .stream()
                .map(hpDTO::toPacienteDTO)
                .collect(Collectors.toList());
    }
    




}