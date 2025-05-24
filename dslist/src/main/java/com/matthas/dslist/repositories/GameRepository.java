package com.matthas.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matthas.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
