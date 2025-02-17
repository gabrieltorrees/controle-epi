package com.controle.epi.repository;

import com.controle.epi.model.Epi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpiRepository extends JpaRepository<Epi, Long> {

}
