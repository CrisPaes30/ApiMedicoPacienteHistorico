package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "medico")
public class MedicoEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String departamento;

    @Column(nullable = false)
    String cargo;

    @Column(nullable = true)
    Integer telefone;

    @Column(nullable = false)
    String nome;

    @OneToMany(mappedBy = "medico")
    private List<PacienteEntity> pacientes;

    @OneToMany(mappedBy = "medicoId")
    private List<HistoricoEntity> historicos;


    public MedicoEntity(Long id, String departamento, String cargo, Integer telefone, String nome) {
        this.id = id;
        this.departamento = departamento;
        this.cargo = cargo;
        this.telefone = telefone;
        this.nome = nome;
    }

    public MedicoEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<PacienteEntity> getPacientes() {
        return pacientes;
    }


}
