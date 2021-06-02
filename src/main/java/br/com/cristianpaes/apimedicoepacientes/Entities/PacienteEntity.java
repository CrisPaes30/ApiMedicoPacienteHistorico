package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "paciente")
public class PacienteEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String nome;

    @Column(nullable = false)
    String nascimento;

    @Column(nullable = true)
    Integer telefone;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private MedicoEntity medico;

    @OneToOne
    @JoinColumn(name = "id")
    private HistoricoEntity paciente;


    public PacienteEntity(Long id, String nome, String nascimento, Integer telefone, MedicoEntity medico) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.medico = medico;
    }

    public PacienteEntity(){
    }


}
