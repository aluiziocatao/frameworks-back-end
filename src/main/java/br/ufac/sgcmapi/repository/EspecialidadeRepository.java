package br.ufac.sgcmapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.ufac.sgcmapi.model.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
    
    @Query(
        "SELECT es FROM Especialidade es WHERE " + 
        "es.nome LIKE %?1%"
        )
    List<Especialidade> findByAll(String termoBusca);
}
