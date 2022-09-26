package com.dh.serieservice.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder @Data
public class Serie {
    private Integer id;
    private String name;
    private String genre;
    private List<Season> seasons;


    public Serie() {
    }

    public Serie(Integer id, String name, String genre, List<Season> seasons) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.seasons = seasons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }
}
