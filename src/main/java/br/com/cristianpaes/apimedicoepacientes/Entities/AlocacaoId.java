package br.com.cristianpaes.apimedicoepacientes.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class AlocacaoId implements Serializable {


    @Column(name = "medicoResponsavel_id")

    Long medicoId;

    @Column(name = "paciente")
    Long paciente;


}
