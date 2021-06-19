package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Embeddable
public class PkIds implements Serializable {

    @EqualsAndHashCode.Include
    @JoinColumn(name = "medicoResponsavel_id")
    private Long IdMedicoResponsavel;

    @EqualsAndHashCode.Include
    //@JoinColumn(name = "paciente")
    private Long pacienteId;

}
