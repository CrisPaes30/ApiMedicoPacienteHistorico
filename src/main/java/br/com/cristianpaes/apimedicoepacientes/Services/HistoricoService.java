package br.com.cristianpaes.apimedicoepacientes.Services;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoPacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.HpDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.PacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Historico;
import br.com.cristianpaes.apimedicoepacientes.Entities.PkIds;
import br.com.cristianpaes.apimedicoepacientes.Repositories.HistoricoRepository;
import br.com.cristianpaes.apimedicoepacientes.Repositories.HistoricoRepositoryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistoricoService {


    @Autowired
    HistoricoRepository historicoRepository;

    @Autowired
    HistoricoRepositoryTest historicoRepositoryTest;

    @Autowired
    HpDTO hpDTO;

    public List<HistoricoPacienteDTO> findAll(){
        return historicoRepository.findAll()
                .stream()
                .map(hpDTO::toHistoricoDTO)
                .collect(Collectors.toList());
    }

    public List<Historico> findById(PkIds id){
        return historicoRepositoryTest.findByPacienteId(id);
    }


    public List<HistoricoPacienteDTO> findByDiagnostico(String diagnostico){
        return historicoRepository.findByDiagnosticoContaining(diagnostico)
                .stream()
                .map(hpDTO::toHistoricoDTO)
                .collect(Collectors.toList());
    }

    public List<HistoricoDTO> groupByDiagnostico(){
        return historicoRepository.findByOrderByMedicoAsc();
    }


}
