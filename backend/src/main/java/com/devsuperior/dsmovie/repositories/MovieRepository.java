package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.entitites.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
}
