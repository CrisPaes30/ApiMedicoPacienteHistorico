package br.com.cristianpaes.apimedicoepacientes.DTO;

import br.com.cristianpaes.apimedicoepacientes.Entities.HistoricoEntity;
import br.com.cristianpaes.apimedicoepacientes.Entities.MedicoEntity;
import br.com.cristianpaes.apimedicoepacientes.Entities.PacienteEntity;
import org.springframework.stereotype.Component;

@Component
public class HpDTO {



    public HistoricoPacienteDTO toPacienteDTO(HistoricoEntity entity) {

        var historicoPacienteDTO  = new HistoricoPacienteDTO();
        historicoPacienteDTO.setId(toMedicoDto((MedicoEntity) entity.getMedicoId()).getId());
        historicoPacienteDTO.setNomePaciente(toPaciente(entity.getPacientes()).getNome());
        historicoPacienteDTO.setDataEntrada(entity.getDataHoraEntrada());
        historicoPacienteDTO.setDataSaida(entity.getDataHoraSaida());
        historicoPacienteDTO.setDiagnostico(entity.getDiagnostico());
        historicoPacienteDTO.setNomeMedico(toMedicoDto((MedicoEntity) entity.getMedicoId()).getNome());
        historicoPacienteDTO.setDepartamento(toMedicoDto((MedicoEntity) entity.getMedicoId()).getDepartamento());

        return historicoPacienteDTO;

    }


    public MedicoDTO toMedicoDto(MedicoEntity entity){

        MedicoDTO medicoDTO = new MedicoDTO();
        medicoDTO.setId(entity.getId());
        medicoDTO.setNome(entity.getNome());
        medicoDTO.setDepartamento(entity.getDepartamento());

        return medicoDTO;
    }

    public PacienteDTO toPaciente(PacienteEntity pacienteEntity){

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setIdpaciente(pacienteEntity.getId());
        pacienteDTO.setNome(pacienteEntity.getNome());

        return pacienteDTO;
    }


}
