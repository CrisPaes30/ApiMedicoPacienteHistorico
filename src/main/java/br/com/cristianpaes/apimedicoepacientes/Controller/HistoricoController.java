package br.com.cristianpaes.apimedicoepacientes.Controller;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoPacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.PacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Historico;
import br.com.cristianpaes.apimedicoepacientes.Entities.PkIds;
import br.com.cristianpaes.apimedicoepacientes.Services.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente/historico")
public class HistoricoController {

    @Autowired
    HistoricoService historicoService;


    @GetMapping
    public List<HistoricoPacienteDTO> getPaciente(){
        return historicoService.findAll();
    }

    @GetMapping("/{id}")
        public List<Historico> findById(@RequestParam (required = false) final PkIds id){
        return this.historicoService.findById(id);
    }

    @GetMapping("/diagnostico{diagnostico}")
    public List<HistoricoPacienteDTO> findByDiagnostico(@RequestParam(required = false)
                                                        final String diagnostico){
        return this.historicoService.findByDiagnostico(diagnostico);
    }

    @GetMapping("/group")
    public List<HistoricoDTO> findByGroupDiagnostico(){
        return this.historicoService.groupByDiagnostico();
    }



}
