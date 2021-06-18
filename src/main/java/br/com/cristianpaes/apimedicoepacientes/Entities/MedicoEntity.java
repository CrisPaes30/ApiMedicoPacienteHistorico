package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "medico")
public class MedicoEntity {

//    @GeneratedValue(strategy= GenerationType.SEQUENCE)
//    Long id;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idMatricula;

    @Column(nullable = false)
    String departamento;

    @Column(nullable = false)
    String cargo;

    @Column(nullable = true)
    Integer telefone;

    @Column(nullable = false)
    String nomeMedico;

    @OneToMany(mappedBy = "medico")
    private List<PacienteEntity> pacientes;

//    @OneToMany(mappedBy = "medicoId")
//    private List<HistoricoEntity> historicos;

//    public MedicoEntity(Long id, Long idMatricula, String departamento, String cargo, Integer telefone, String nomeMedico,
//                        List<PacienteEntity> pacientes, List<HistoricoEntity> historicos) {
//        this.id = id;
//        this.idMatricula = idMatricula;
//        this.departamento = departamento;
//        this.cargo = cargo;
//        this.telefone = telefone;
//        this.nomeMedico = nomeMedico;
////        this.pacientes = pacientes;
////        this.historicos = historicos;
//    }

//    public MedicoEntity(){
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getIdMatricula() {
//        return idMatricula;
//    }
//
//    public void setIdMatricula(Long idMatricula) {
//        this.idMatricula = idMatricula;
//    }
//
//    public String getDepartamento() {
//        return departamento;
//    }
//
//    public void setDepartamento(String departamento) {
//        this.departamento = departamento;
//    }
//
//    public String getCargo() {
//        return cargo;
//    }
//
//    public void setCargo(String cargo) {
//        this.cargo = cargo;
//    }
//
//    public Integer getTelefone() {
//        return telefone;
//    }
//
//    public void setTelefone(Integer telefone) {
//        this.telefone = telefone;
//    }
//
//    public String getNomeMedico() {
//        return nomeMedico;
//    }
//
//    public void setNomeMedico(String nomeMedico) {
//        this.nomeMedico = nomeMedico;
//    }

//    public List<PacienteEntity> getPacientes() {
//        return pacientes;
//    }
//
//    public void setPacientes(List<PacienteEntity> pacientes) {
//        this.pacientes = pacientes;
//    }
//
//    public List<HistoricoEntity> getHistoricos() {
//        return historicos;
//    }
//
//    public void setHistoricos(List<HistoricoEntity> historicos) {
//        this.historicos = historicos;
//    }
}
