package br.com.cristianpaes.apimedicoepacientes.Repositories;

import br.com.cristianpaes.apimedicoepacientes.DTO.DepartmentDTO;
import br.com.cristianpaes.apimedicoepacientes.Entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedicoRepository extends JpaRepository<Medico, Long> {


    @Query("select new br.com.cristianpaes.apimedicoepacientes.DTO.DepartmentDTO(m.departamento, count(m) as quantidade)\n" +
            "from Medico m group by m.departamento")
    List<DepartmentDTO> findByOrderByDepartamentoDesc();
}
