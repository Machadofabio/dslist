package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dtos.GameDto;
import com.devsuperior.dslist.dtos.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
        List<Game> gameList = gameRepository.findAll();
        return gameList.stream().map(GameMinDto::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game game = gameRepository.findById(id).get();
        return new GameDto(game);
    }
}
