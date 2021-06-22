package br.com.cristianpaes.apimedicoepacientes.DTO;

import br.com.cristianpaes.apimedicoepacientes.Entities.Medico;
import br.com.cristianpaes.apimedicoepacientes.Entities.Paciente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


public class DepartmentDTO {

    String nome;
    Long idMedico;

    public DepartmentDTO(String nome, Long idMedico) {
        this.nome = nome;
        this.idMedico = idMedico;
    }

    public DepartmentDTO() {
    }

    public DepartmentDTO(List<MedDpDTO> listaMed, Medico md) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }
}
