package com.sgp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgp.models.QuadrosValores;

@Repository
public interface QuadrosValoresRepository extends JpaRepository<QuadrosValores, Long>{

}
