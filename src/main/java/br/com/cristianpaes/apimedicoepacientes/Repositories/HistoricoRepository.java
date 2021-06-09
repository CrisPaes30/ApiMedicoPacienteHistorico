package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoPacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.HistoricoEntity;
import br.com.cristianpaes.apimedicoepacientes.Entities.MedicoEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface HistoricoRepository extends JpaRepository<HistoricoEntity,Long> {

    List<HistoricoEntity> findByDiagnosticoContaining(String diagnostico);

//    @Query(value = "SELECT h.id,h.medico_responsavel_id,h.data_hora_entrada,h.data_hora_saida,h.diagnostico,h.pacientes_id" +
//            " FROM historico h GROUP BY historico.id WHERE h.medico_responsavel_id >?1 and h.pacientes_id>?1;",nativeQuery = true)

    @Query("SELECT h FROM HistoricoEntity h WHERE h.id >?1")
    List<HistoricoEntity> findByIdMedicoIdOrderBy(Long id);


    //
    //  @Query(value = "SELECT * FROM historico h WHERE h.pacientes_id >?1",nativeQuery = true)


}


//WHERE historico.id >?1
//
//