package com.matthas.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matthas.dslist.dto.GameDTO;
import com.matthas.dslist.dto.GameMinDTO;
import com.matthas.dslist.entities.Game;
import com.matthas.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public GameDTO findByID(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
        
    }

    @Transactional
    public List<GameMinDTO> findAll() {
       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
       return dto;
    }
}
