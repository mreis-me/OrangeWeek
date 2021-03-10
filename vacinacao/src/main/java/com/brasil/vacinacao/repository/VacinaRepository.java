package com.brasil.vacinacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brasil.vacinacao.model.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long>{

}
