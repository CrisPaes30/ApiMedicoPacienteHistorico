package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
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

    @OneToMany(mappedBy = "medico_id")
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


}
