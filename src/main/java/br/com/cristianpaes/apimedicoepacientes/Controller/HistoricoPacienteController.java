package br.com.cristianpaes.apimedicoepacientes.Controller;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoPacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.Services.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return this.historicoService.findById(id);
    }

    @GetMapping("/diagnostico{diagnostico}")
    public List<HistoricoPacienteDTO> findByDiagnostico(@RequestParam(required = false)
                                                        final String diagnostico){
        return this.historicoService.findByDiagnostico(diagnostico);
    }
}
