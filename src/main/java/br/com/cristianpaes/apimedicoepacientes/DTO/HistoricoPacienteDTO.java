package br.com.cristianpaes.apimedicoepacientes.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoricoPacienteDTO {


    Long  idPaciente;
    String nomePaciente;
    String dataEntrada;
    String dataSaida;
    String diagnostico;
    String nomeMedico;
    String departamento;

}
