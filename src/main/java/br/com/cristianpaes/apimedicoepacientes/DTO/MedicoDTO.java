package br.com.cristianpaes.apimedicoepacientes.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicoDTO {

    Long idMatricula;
    String nome;
    String departamento;
}
