package br.com.cristianpaes.apimedicoepacientes.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoricoPacienteDTO {

    Long idPaciente;
    Long idMatricula;
    String nomePaciente;
    String nomeMedico;
    String dataEntrada;
    String dataSaida;
    String diagnostico;
    String departamento;

}
