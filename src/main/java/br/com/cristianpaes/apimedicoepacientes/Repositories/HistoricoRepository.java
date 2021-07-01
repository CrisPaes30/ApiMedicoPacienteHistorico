package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Historico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface HistoricoRepository extends JpaRepository<Historico, Long> {

    List<Historico> findByDiagnosticoContaining(String diagnostico);

    @Query("select new br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoDTO(h.IdMedicoResponsavel, count(h) as internações)\n" +
            "from Historico h group by h.IdMedicoResponsavel")
    List<HistoricoDTO> findByOrderByMedicoAsc();


}

