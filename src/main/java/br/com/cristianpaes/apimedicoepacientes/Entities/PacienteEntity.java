package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "paciente")
public class PacienteEntity {


//    @GeneratedValue(strategy=GenerationType.SEQUENCE)
//    Long id;

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

//    @OneToOne
//    @JoinColumn(name = "pacientes")
//    private HistoricoEntity historicos;



//    public PacienteEntity(Long id, Long pacienteId, String nome, String nascimento, Integer telefone,
//                          MedicoEntity medico, HistoricoEntity paciente) {
//        this.id = id;
//        this.pacienteId = pacienteId;
//        this.nome = nome;
//        this.nascimento = nascimento;
//        this.telefone = telefone;
////        this.medico = medico;
//        this.paciente = paciente;
//    }
//
//    public PacienteEntity(){
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
//    public Long getPacienteId() {
//        return pacienteId;
//    }
//
//    public void setPacienteId(Long pacienteId) {
//        this.pacienteId = pacienteId;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getNascimento() {
//        return nascimento;
//    }
//
//    public void setNascimento(String nascimento) {
//        this.nascimento = nascimento;
//    }
//
//    public Integer getTelefone() {
//        return telefone;
//    }
//
//    public void setTelefone(Integer telefone) {
//        this.telefone = telefone;
//    }

//    public MedicoEntity getMedico() {
//        return medico;
//    }
//
//    public void setMedico(MedicoEntity medico) {
//        this.medico = medico;
//    }
//
//    public HistoricoEntity getPaciente() {
//        return paciente;
//    }
//
//    public void setPaciente(HistoricoEntity paciente) {
//        this.paciente = paciente;
//    }
}