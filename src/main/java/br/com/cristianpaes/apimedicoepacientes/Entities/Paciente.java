package br.com.cristianpaes.apimedicoepacientes.Entities;

import javax.persistence.*;

@Entity
@Table(name = "paciente")
public class Paciente {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long IdPaciente;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String nascimento;

    @Column(nullable = true)
    private Integer telefone;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    public Paciente(Long pacienteId, String nome, String nascimento, Integer telefone, Medico medico) {
        this.IdPaciente = pacienteId;
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.medico = medico;
    }

    public Paciente() {
    }

    public Long getPacienteId() {
        return IdPaciente;
    }

    public void setPacienteId(Long pacienteId) {
        this.IdPaciente = pacienteId;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}