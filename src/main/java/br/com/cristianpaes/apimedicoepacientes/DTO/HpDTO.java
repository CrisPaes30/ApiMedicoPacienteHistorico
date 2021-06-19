package br.com.cristianpaes.apimedicoepacientes.DTO;

import br.com.cristianpaes.apimedicoepacientes.Entities.HistoricoEntity;
import br.com.cristianpaes.apimedicoepacientes.Entities.MedicoEntity;
import br.com.cristianpaes.apimedicoepacientes.Entities.PacienteEntity;
import br.com.cristianpaes.apimedicoepacientes.Entities.PkIds;
import org.springframework.stereotype.Component;

@Component
public class HpDTO {

    public HistoricoPacienteDTO toPacienteDTO(HistoricoEntity entity) {

        var historicoPacienteDTO  = new HistoricoPacienteDTO();
        historicoPacienteDTO.setIdPaciente(entity.getPacienteId().getPacienteId());
        historicoPacienteDTO.setIdMatricula(entity.getIdMedicoResponsavel().getIdMatricula());
        historicoPacienteDTO.setNomePaciente(entity.getPacienteId().getNome());
        historicoPacienteDTO.setDataEntrada(entity.getDataHoraEntrada());
        historicoPacienteDTO.setDataSaida(entity.getDataHoraSaida());
        historicoPacienteDTO.setDiagnostico(entity.getDiagnostico());
        historicoPacienteDTO.setNomeMedico(toMedicoDto(entity.getIdMedicoResponsavel()).getNome());
        historicoPacienteDTO.setDepartamento(toMedicoDto(entity.getIdMedicoResponsavel()).getDepartamento());

        return historicoPacienteDTO;

    }


    public MedicoDTO toMedicoDto(MedicoEntity entity){

        MedicoDTO medicoDTO = new MedicoDTO();
        medicoDTO.setIdMatricula(entity.getIdMatricula());
        medicoDTO.setNome(entity.getNomeMedico());
        medicoDTO.setDepartamento(entity.getDepartamento());

        return medicoDTO;
    }

    public PacienteDTO toPaciente(PkIds pacienteEntity){

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setIdPaciente(pacienteEntity.getPacienteId());
//        pacienteDTO.setNome(pacienteEntity.getNome());

        return pacienteDTO;
    }


}
