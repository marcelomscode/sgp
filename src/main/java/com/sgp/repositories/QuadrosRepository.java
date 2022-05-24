package com.sgp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgp.models.Quadros;

@Repository
public interface QuadrosRepository extends JpaRepository<Quadros, Long>{

}
