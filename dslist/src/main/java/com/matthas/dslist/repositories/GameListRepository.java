package com.matthas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matthas.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
