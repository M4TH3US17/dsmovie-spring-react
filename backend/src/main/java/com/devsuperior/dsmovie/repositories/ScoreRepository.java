package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.entitites.Score;
import com.devsuperior.dsmovie.entitites.pk.ScorePK;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
}
