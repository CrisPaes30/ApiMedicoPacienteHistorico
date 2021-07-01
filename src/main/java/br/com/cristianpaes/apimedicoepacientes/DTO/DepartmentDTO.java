package br.com.cristianpaes.apimedicoepacientes.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO implements Serializable {

    String departamento;
    Long quantidade;

}
