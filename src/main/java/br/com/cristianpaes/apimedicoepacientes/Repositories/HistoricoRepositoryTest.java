package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.DTO.HistoricoDTO;
import br.com.cristianpaes.apimedicoepacientes.DTO.PacienteDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Historico;
import br.com.cristianpaes.apimedicoepacientes.Entities.PkIds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface HistoricoRepositoryTest extends JpaRepository<Historico, PkIds> {

    @Query("select h from Historico h where h.pacienteId >?1")
    List<Historico> findByPacienteId(PkIds id);
}

