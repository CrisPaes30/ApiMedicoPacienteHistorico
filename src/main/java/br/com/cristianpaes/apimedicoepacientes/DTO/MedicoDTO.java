package br.com.cristianpaes.apimedicoepacientes.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicoDTO {

    Long id;
    String nome;
    String departamento;
}
