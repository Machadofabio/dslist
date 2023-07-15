package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dtos.GameListDto;
import com.devsuperior.dslist.dtos.GameMinDto;
import com.devsuperior.dslist.service.GameListService;
import com.devsuperior.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDto>> findAll() {
        return ResponseEntity.ok(gameListService.findAll());
    }

    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<List<GameMinDto>> findByList(@PathVariable Long listId){
        return ResponseEntity.ok(gameService.findByList(listId));
    }

}
