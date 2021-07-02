package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoPacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.HpDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.PacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Historico;
import br.com.cristianpaes.apimedicoepacientes.Entities.PkIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface HistoricoRepository extends JpaRepository<Historico, Long> {

    List<Historico> findByDiagnosticoContaining(String diagnostico);

    @Query("select new br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoDTO(h.IdMedicoResponsavel, count(h) as internações)\n" +
            "from Historico h group by h.IdMedicoResponsavel")
    List<HistoricoDTO> findByOrderByMedicoAsc();

    //@Query("select h from Historico h where h.pacienteId >?1")
//    List<Historico> findByPacienteId(PkIds id);
}

