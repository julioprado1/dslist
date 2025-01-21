package com.julio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game , Long>{
 
}
