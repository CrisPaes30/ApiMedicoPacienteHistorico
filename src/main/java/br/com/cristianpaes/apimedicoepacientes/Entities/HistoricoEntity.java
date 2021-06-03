package br.com.cristianpaes.apimedicoepacientes.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


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
        //this.medico_id = medico_id;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.diagnostico = diagnostico;
    }

    public HistoricoEntity(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(String dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public String getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public MedicoEntity getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(MedicoEntity medico_id) {
        this.medico_id = medico_id;
    }

    public PacienteEntity getPacientes() {
        return pacientes;
    }

    public void setPacientes(PacienteEntity pacientes) {
        this.pacientes = pacientes;
    }
}
