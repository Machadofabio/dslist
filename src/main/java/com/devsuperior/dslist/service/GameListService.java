package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dtos.GameListDto;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDto> findAll(){
        List<GameList> gameList = gameListRepository.findAll();
        return gameList.stream().map(GameListDto::new).toList();
    }
}
