package br.ufac.sgcmapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.ufac.sgcmapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

    @Query(
        "SELECT pa FROM Paciente pa WHERE "+
        "pa.email LIKE %?1% OR "+
        "pa.nome LIKE %?1% OR "+
        "pa.telefone LIKE %?1%"
    )
    List<Paciente> findByAll(String termoBusca);
    
}
