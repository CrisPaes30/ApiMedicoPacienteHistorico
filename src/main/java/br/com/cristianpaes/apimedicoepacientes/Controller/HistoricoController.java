package br.com.cristianpaes.apimedicoepacientes.Controller;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoPacienteDTO;
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

    @GetMapping("/buscar{pkIds}")
        public List<HistoricoPacienteDTO> findByIdPaciente(@RequestParam(required = false)
                                             Long pkIds){
        return this.historicoService.findByPacienteId(pkIds);
    }

    @GetMapping("/diagnostic{diagnostico}")
    public List<HistoricoPacienteDTO> findByDiagnostico(@RequestParam(required = false)
                                                        final String diagnostico){
        return this.historicoService.findByDiagnostico(diagnostico);
    }



}
