package com.devsuperior.dslist.entities;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game_list")
public class GameList {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;

    public GameList() {
    }


    public GameList(long id, String name) {
        this.id = id;
        this.name = name;
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
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GameList)) {
            return false;
        }
        GameList gameList = (GameList) o;
        return id == gameList.id && Objects.equals(name, gameList.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    
    
}
