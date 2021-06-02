package br.com.cristianpaes.apimedicoepacientes.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "historico")
public class HistoricoEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String dataHoraEntrada;

    @Column(nullable = false)
    String dataHoraSaida;

    @Column(nullable = false)
    String diagnostico;


    @ManyToOne
    @JoinColumn(name = "MedicoResponsavel_id")
    private MedicoEntity medico_id;

    @OneToOne
    private PacienteEntity pacientes;

    public HistoricoEntity(Long id, MedicoEntity medico_id, String dataHoraEntrada,
                           String dataHoraSaida, String diagnostico) {
        this.id = id;
        this.medico_id = medico_id;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.diagnostico = diagnostico;
    }

    public HistoricoEntity(){

    }


}
