package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "historico")
@IdClass(PkIds.class)
public class HistoricoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

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
            @JoinColumn(name = "medicoResponsavel_id", referencedColumnName = "idMatricula", insertable = false, updatable = false)
    })
    private MedicoEntity medicoResponsavel;

    @OneToOne
    @JoinColumns(value = {
            @JoinColumn(name = "paciente", referencedColumnName = "pacienteId", insertable = false, updatable = false)
    })
    private PacienteEntity pacientes;


//    public HistoricoEntity(Long id, String dataHoraEntrada, String dataHoraSaida, String diagnostico,
//                           MedicoEntity medicoId, String paciente) {
//        this.id = id;
//        this.dataHoraEntrada = dataHoraEntrada;
//        this.dataHoraSaida = dataHoraSaida;
//        this.diagnostico = diagnostico;
////        this.medicoId = medicoId;
//        this.paciente = paciente;
//    }
//
//    public HistoricoEntity(){
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
//    public String getDataHoraEntrada() {
//        return dataHoraEntrada;
//    }
//
//    public void setDataHoraEntrada(String dataHoraEntrada) {
//        this.dataHoraEntrada = dataHoraEntrada;
//    }
//
//    public String getDataHoraSaida() {
//        return dataHoraSaida;
//    }
//
//    public void setDataHoraSaida(String dataHoraSaida) {
//        this.dataHoraSaida = dataHoraSaida;
//    }
//
//    public String getDiagnostico() {
//        return diagnostico;
//    }
//
//    public void setDiagnostico(String diagnostico) {
//        this.diagnostico = diagnostico;
//    }
//
//    public MedicoEntity getMedicoId() {
//        return medicoId;
//    }
//
//    public void setMedicoId(MedicoEntity medicoId) {
//        this.medicoId = medicoId;
//    }

//    public PacienteEntity getPaciente() {
//        return paciente;
//    }
//
//    public void setPacientes(PacienteEntity paciente) {
//        this.paciente = paciente;
//    }
}

//@AttributeOverrides(value = {
//        @AttributeOverride( name = "idMatricula", column = @Column(name = "medicoResponsavel_id", insertable = false,updatable = false)),
//        @AttributeOverride( name = "paciente", column = @Column(name = "pacienteId",insertable = false,updatable = false))
//})