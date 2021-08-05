package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.*;

import javax.persistence.Embeddable;
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
    private Long idMedicoResponsavel;

    @EqualsAndHashCode.Include
    private Long idPaciente;

}
