package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "historico")
public class HistoricoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    @EmbeddedId
    AlocacaoId tbId;

    @Column(nullable = false)
    String dataHoraEntrada;

    @Column(nullable = false)
    String dataHoraSaida;

    @Column(nullable = false)
    String diagnostico;

    @MapsId("medicoResponsavel_id")
    @ManyToOne
    @JoinColumn(name = "medicoResponsavel_id", insertable = false, updatable = false)
    private MedicoEntity medicoId;


    @MapsId("paciente")
    @OneToOne
    @JoinColumn(name = "pacienteId",insertable = false, updatable = false)
    private PacienteEntity pacientes;

    public HistoricoEntity(Long id, AlocacaoId tbId, String dataHoraEntrada, String dataHoraSaida,
                           String diagnostico, MedicoEntity medicoId, PacienteEntity pacientes) {
        this.id = id;
        this.tbId = tbId;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.diagnostico = diagnostico;
        this.medicoId = medicoId;
        this.pacientes = pacientes;
    }

    public HistoricoEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AlocacaoId getTbId() {
        return tbId;
    }

    public void setTbId(AlocacaoId tbId) {
        this.tbId = tbId;
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

    public MedicoEntity getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(MedicoEntity medicoId) {
        this.medicoId = medicoId;
    }

    public PacienteEntity getPacientes() {
        return pacientes;
    }

    public void setPacientes(PacienteEntity pacientes) {
        this.pacientes = pacientes;
    }
}
