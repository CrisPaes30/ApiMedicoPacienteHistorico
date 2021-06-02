package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.Entities.HistoricoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<HistoricoEntity,Long> {
}
