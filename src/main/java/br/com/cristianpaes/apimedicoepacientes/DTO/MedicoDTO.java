package br.com.cristianpaes.apimedicoepacientes.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class MedicoDTO {

    Long idMatricula;
    String nome;
    String departamento;

}
