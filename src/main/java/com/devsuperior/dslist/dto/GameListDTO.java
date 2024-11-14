package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
    private long id;
    private String name;

    public GameListDTO() {
    }


    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
