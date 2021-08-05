package br.com.cristianpaes.apimedicoepacientes.Entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "historico")
@IdClass(PkIds.class)
public class Historico implements Serializable {

    @Column(nullable = false)
    private String dataHoraEntrada;

    @Column(nullable = false)
    private String dataHoraSaida;

    @Column(nullable = false)
    private String diagnostico;

    @EmbeddedId
    private PkIds pkIds;


    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "idMedicoResponsavel", referencedColumnName = "idMatricula", insertable = false, updatable = false)
    })
    private Medico idMedicoResponsavel;

    @OneToOne
    @JoinColumns(value = {
            @JoinColumn(name = "IdPaciente", referencedColumnName = "IdPaciente", insertable = false, updatable = false)
    })
    private Paciente idPaciente;


    public Historico(String dataHoraEntrada, String dataHoraSaida, String diagnostico,
                     Medico idMedicoResponsavel) {
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.diagnostico = diagnostico;
        this.pkIds = pkIds;
        this.idMedicoResponsavel = idMedicoResponsavel;
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
        return idMedicoResponsavel;
    }

    public void setIdMedicoResponsavel(Medico idMedicoResponsavel) {
        this.idMedicoResponsavel = idMedicoResponsavel;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }
}

