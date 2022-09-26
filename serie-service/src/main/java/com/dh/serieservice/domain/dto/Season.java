package com.dh.serieservice.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder @Data
public class Season {
    private Integer id;
    private Integer seasonNumber;
    private String genre;
    private List<Chapter> chapters;

    public Season() {
    }

    public Season(Integer id, Integer seasonNumber, String genre, List<Chapter> chapters) {
        this.id = id;
        this.seasonNumber = seasonNumber;
        this.genre = genre;
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}
