package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "paciente")
public class PacienteEntity {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long pacienteId;

    @Column(nullable = false)
    String nome;

    @Column(nullable = false)
    String nascimento;

    @Column(nullable = true)
    Integer telefone;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private MedicoEntity medico;

    public PacienteEntity(Long pacienteId, String nome, String nascimento, Integer telefone, MedicoEntity medico) {
        this.pacienteId = pacienteId;
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.medico = medico;
    }

    public PacienteEntity() {
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public MedicoEntity getMedico() {
        return medico;
    }

    public void setMedico(MedicoEntity medico) {
        this.medico = medico;
    }
}