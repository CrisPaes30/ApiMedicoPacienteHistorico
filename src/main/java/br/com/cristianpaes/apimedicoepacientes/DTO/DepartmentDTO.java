package br.com.cristianpaes.apimedicoepacientes.DTO;

import br.com.cristianpaes.apimedicoepacientes.Entities.Medico;
import br.com.cristianpaes.apimedicoepacientes.Entities.Paciente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Component
public class DepartmentDTO implements Serializable {

    String departamento;
    Long quantidade;

    public DepartmentDTO(String departamento, Long quantidade) {
        this.departamento = departamento;
        this.quantidade = quantidade;
    }

    public DepartmentDTO(){

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}
