package br.com.cristianpaes.apimedicoepacientes.DTO;

import br.com.cristianpaes.apimedicoepacientes.Entities.MedicoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacienteDTO{

    Long idPaciente;
    Long idMedico;
    String nome;
    String dataEntrada;
    String dataSaida;
    String diagnostico;
}
