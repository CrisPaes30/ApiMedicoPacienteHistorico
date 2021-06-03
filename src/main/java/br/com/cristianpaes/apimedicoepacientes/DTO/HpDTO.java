package br.com.cristianpaes.apimedicoepacientes.DTO;

import br.com.cristianpaes.apimedicoepacientes.Entities.HistoricoEntity;
import br.com.cristianpaes.apimedicoepacientes.Entities.MedicoEntity;
import br.com.cristianpaes.apimedicoepacientes.Entities.PacienteEntity;
import org.springframework.stereotype.Component;

@Component
public class HpDTO {



    public HistoricoPacienteDTO toPacienteDTO(HistoricoEntity entity) {

        var historicoPacienteDTO  = new HistoricoPacienteDTO();
        historicoPacienteDTO.setNomePaciente(toPaciente(entity.getPacientes()).getNome());
        historicoPacienteDTO.setDataEntrada(entity.getDataHoraEntrada());
        historicoPacienteDTO.setDataSaida(entity.getDataHoraSaida());
        historicoPacienteDTO.setDiagnostico(entity.getDiagnostico());
        historicoPacienteDTO.setNomeMedico(toMedicoDto(entity.getMedico_id()).getNome());

        return historicoPacienteDTO;

    }


    public MedicoDTO toMedicoDto(MedicoEntity entity){

        MedicoDTO medicoDTO = new MedicoDTO();
        medicoDTO.setId(entity.getId());
        medicoDTO.setNome(entity.getNome());

        return medicoDTO;
    }

    public PacienteDTO toPaciente(PacienteEntity pacienteEntity){

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setIdpaciente(pacienteEntity.getId());
        pacienteDTO.setNome(pacienteEntity.getNome());

        return pacienteDTO;
    }


}
