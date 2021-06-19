package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "historico")
@IdClass(PkIds.class)
public class HistoricoEntity implements Serializable {

    @Column(nullable = false)
    String dataHoraEntrada;

    @Column(nullable = false)
    String dataHoraSaida;

    @Column(nullable = false)
    String diagnostico;

    @EmbeddedId
    private PkIds pkIds;


    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "idMedicoResponsavel", referencedColumnName = "idMatricula", insertable = false, updatable = false)
    })
    private MedicoEntity IdMedicoResponsavel;

    @OneToOne
    @JoinColumns(value = {
            @JoinColumn(name = "pacienteId", referencedColumnName = "pacienteId", insertable = false, updatable = false)
    })
    private PacienteEntity pacienteId;


    public HistoricoEntity(String dataHoraEntrada, String dataHoraSaida, String diagnostico, PkIds pkIds,
                           MedicoEntity idMedicoResponsavel, PacienteEntity pacienteId) {
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.diagnostico = diagnostico;
        this.pkIds = pkIds;
        this.IdMedicoResponsavel = idMedicoResponsavel;
        this.pacienteId = pacienteId;
    }

    public HistoricoEntity(){

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

    public PkIds getPkIds() {
        return pkIds;
    }

    public void setPkIds(PkIds pkIds) {
        this.pkIds = pkIds;
    }

    public MedicoEntity getIdMedicoResponsavel() {
        return IdMedicoResponsavel;
    }

    public void setIdMedicoResponsavel(MedicoEntity idMedicoResponsavel) {
        IdMedicoResponsavel = idMedicoResponsavel;
    }

    public PacienteEntity getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(PacienteEntity pacienteId) {
        this.pacienteId = pacienteId;
    }
}

