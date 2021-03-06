package br.com.cristianpaes.apimedicoepacientes.DTO;

import br.com.cristianpaes.apimedicoepacientes.Entities.Historico;
import br.com.cristianpaes.apimedicoepacientes.Entities.Medico;
import br.com.cristianpaes.apimedicoepacientes.Entities.PkIds;
import org.springframework.stereotype.Component;

@Component
public class HpDTO {

    public HistoricoPacienteDTO toHistoricoDTO(Historico entity) {

        var historicoPacienteDTO  = new HistoricoPacienteDTO();
        historicoPacienteDTO.setIdPaciente(entity.getIdPaciente().getPacienteId());
        historicoPacienteDTO.setNomePaciente(entity.getIdPaciente().getNome());
        historicoPacienteDTO.setDataEntrada(entity.getDataHoraEntrada());
        historicoPacienteDTO.setDataSaida(entity.getDataHoraSaida());
        historicoPacienteDTO.setDiagnostico(entity.getDiagnostico());
        historicoPacienteDTO.setNomeMedico(toMedicoDto(entity.getIdMedicoResponsavel()).getNome());
        historicoPacienteDTO.setDepartamento(toMedicoDto(entity.getIdMedicoResponsavel()).getDepartamento());

        return historicoPacienteDTO;

    }

    public MedicoDTO toMedicoDto(Medico entity){

        MedicoDTO medicoDTO = new MedicoDTO();
        medicoDTO.setIdMatricula(entity.getIdMatricula());
        medicoDTO.setNome(entity.getNomeMedico());
        medicoDTO.setDepartamento(entity.getDepartamento());

        return medicoDTO;
    }





}
