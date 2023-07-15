package com.devsuperior.dslist.dtos;

import com.devsuperior.dslist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class GameListDto {
    private Long id;
    private String name;

    public GameListDto(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

}
