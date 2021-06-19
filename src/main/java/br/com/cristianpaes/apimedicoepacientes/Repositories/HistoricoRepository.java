package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.Entities.HistoricoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface HistoricoRepository extends JpaRepository<HistoricoEntity, Long> {

    List<HistoricoEntity> findByDiagnosticoContaining(String diagnostico);


//    @Query(value = "select h.paciente_id ,h.id_medico_responsavel, h.data_hora_entrada, h.data_hora_saida, h.diagnostico, count(*) \n" +
//            "from historico h \n" +
//            "where h.id_medico_responsavel >?1 \n" +
//            "group by h.id_medico_responsavel\n" +
//            "order by count(*) DESC",nativeQuery = true)

    @Query("SELECT h.IdMedicoResponsavel FROM HistoricoEntity h WHERE h.IdMedicoResponsavel >?1")
    List<HistoricoEntity> findByIdMedicoResponsavelOrderBy(Long id);


    //@Query("SELECT h.medicoId FROM HistoricoEntity h WHERE h.medicoId >?1")
    //  @Query(value = "SELECT * FROM historico h WHERE h.pacientes_id >?1",nativeQuery = true)


}


//WHERE historico.id >?1
//
//