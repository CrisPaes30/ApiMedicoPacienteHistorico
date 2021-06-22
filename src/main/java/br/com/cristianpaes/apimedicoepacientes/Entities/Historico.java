package br.com.cristianpaes.apimedicoepacientes.Entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "historico")
@IdClass(PkIds.class)
public class Historico implements Serializable {

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
    private Medico IdMedicoResponsavel;

    @OneToOne
    @JoinColumns(value = {
            @JoinColumn(name = "pacienteId", referencedColumnName = "pacienteId", insertable = false, updatable = false)
    })
    private Paciente pacienteId;


    public Historico(String dataHoraEntrada, String dataHoraSaida, String diagnostico, PkIds pkIds,
                     Medico idMedicoResponsavel, Paciente pacienteId) {
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.diagnostico = diagnostico;
        this.pkIds = pkIds;
        this.IdMedicoResponsavel = idMedicoResponsavel;
        this.pacienteId = pacienteId;
    }

    public Historico(){

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

    public Medico getIdMedicoResponsavel() {
        return IdMedicoResponsavel;
    }

    public void setIdMedicoResponsavel(Medico idMedicoResponsavel) {
        IdMedicoResponsavel = idMedicoResponsavel;
    }

    public Paciente getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Paciente pacienteId) {
        this.pacienteId = pacienteId;
    }
}

