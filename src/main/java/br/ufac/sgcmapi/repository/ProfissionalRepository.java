package br.ufac.sgcmapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.ufac.sgcmapi.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long>{

    @Query(
        "SELECT p FROM Profissional p WHERE "+
        " p.nome LIKE %?1% OR "+
        " p.registroConselho LIKE %?1% OR "+
        " p.especialidade LIKE %?1% OR "+
        " p.unidade LIKE %?1% OR "+
        " p.telefone LIKE %?1% OR"+
        " p.email LIKE %?1% OR"+
        " p.id LIKE %?1% OR"+
        " p.email LIKE %?1%"
    )
    List<Profissional> findByAll(String termoBusca);

}
