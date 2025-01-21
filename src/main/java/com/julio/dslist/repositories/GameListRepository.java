package com.julio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julio.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList , Long>{
 
}
