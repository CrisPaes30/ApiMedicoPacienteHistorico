package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.Entities.MedicoEntity;
import org.hibernate.secure.spi.JaccPermissionDeclarations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<MedicoEntity, Long> {
}
