package br.com.cristianpaes.apimedicoepacientes.Controller;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoPacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.HistoricoEntity;
import br.com.cristianpaes.apimedicoepacientes.Services.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paciente/historico")
public class HistoricoPacienteController {

    @Autowired
    HistoricoService historicoService;

    @GetMapping
    public List<HistoricoPacienteDTO> getPaciente(){
        return historicoService.findAll();
    }

    @GetMapping("/{id}")
    public HistoricoPacienteDTO findById(@PathVariable("id") final Long id){
        return historicoService.findById(id);
    }

    @GetMapping("/diagnostico{diagnostico}")
    public List<HistoricoEntity> findByDiagnostico(@PathVariable("diagnostico")
                                                        final String diagnostico){
        return historicoService.findByDiagnostico(diagnostico);
    }
}
