package br.com.cristianpaes.apimedicoepacientes.Controller;

import br.com.cristianpaes.apimedicoepacientes.DTO.DepartmentDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoPacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.MedDpDTO;
import br.com.cristianpaes.apimedicoepacientes.Services.HistoricoService;
import br.com.cristianpaes.apimedicoepacientes.Services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente/historico")
public class HistoricoController {

    @Autowired
    HistoricoService historicoService;

    @Autowired
    MedicoService medicoService;

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

//    @GetMapping("/group{id}")
//    public List<HistoricoPacienteDTO> findByGroupMedico(@RequestParam(required = false) Long id) {
//        return historicoService.findByIdMedico(id);
//
//    }


    @GetMapping("/group{id}")
    public ResponseEntity<MedDpDTO> findAll(@RequestParam(required = false) List<DepartmentDTO> medi) {
        MedDpDTO medDpDTO = medicoService.group(medi);
        return ResponseEntity.ok().body(medDpDTO);
    }

}