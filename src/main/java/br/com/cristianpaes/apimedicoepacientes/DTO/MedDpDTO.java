package br.com.cristianpaes.apimedicoepacientes.DTO;

import br.com.cristianpaes.apimedicoepacientes.Entities.Medico;

import java.util.ArrayList;
import java.util.List;


public class MedDpDTO {

    private List<DepartmentDTO> medicos = new ArrayList<>();
    private String departamento;
    private Long idMedico;


    public MedDpDTO(List<DepartmentDTO> medicos, String departamento, Long idMedico) {
        this.medicos = medicos;
        this.departamento = departamento;
        this.idMedico = idMedico;
    }

    public MedDpDTO() {
    }

    public List<DepartmentDTO> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<DepartmentDTO> medicos) {
        this.medicos = medicos;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }
}
