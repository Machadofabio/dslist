package com.devsuperior.dslist.dtos;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameDto extends GameMinDto{
    private String genre;
    private String platforms;
    private Double score;
    private String longDescription;

    public GameDto(Game entity){
        BeanUtils.copyProperties(entity, this);
    }
}
