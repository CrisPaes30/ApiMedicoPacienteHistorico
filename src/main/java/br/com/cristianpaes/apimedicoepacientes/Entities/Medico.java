package br.com.cristianpaes.apimedicoepacientes.Entities;

import br.com.cristianpaes.apimedicoepacientes.DTO.DepartmentDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.MedDpDTO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "medico")
public class Medico {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idMatricula;

    @Column(nullable = false)
    private String departamento;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = true)
    private Integer telefone;

    @Column(nullable = false)
    private String nomeMedico;

    @OneToMany(mappedBy = "medico")
    private List<Paciente> pacientes;

    public Medico(Long idMatricula, String departamento, String cargo, Integer telefone, String nomeMedico) {
        this.idMatricula = idMatricula;
        this.departamento = departamento;
        this.cargo = cargo;
        this.telefone = telefone;
        this.nomeMedico = nomeMedico;
    }

    public Medico(){

    }

    public Long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}
