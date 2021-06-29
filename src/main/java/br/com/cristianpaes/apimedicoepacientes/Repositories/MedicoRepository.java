package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.DTO.DepartmentDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Historico;
import br.com.cristianpaes.apimedicoepacientes.Entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

//    @Query("SELECT h FROM Historico h")
//    List<Medico> findByGroupMedico(String departamento, List<DepartmentDTO> mdDepartamento);

    @Query("SELECT h FROM Historico h")
    List<Medico> findByGroupMedico(List<DepartmentDTO> departamento);
}
