package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.Entities.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<PacienteEntity,Long> {
}
