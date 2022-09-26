package com.dh.serieservice.domain.dto;

import lombok.Builder;
import lombok.Data;

@Builder @Data
public class Chapter {
    private Integer id;
    private String name;
    private Integer number;
    private String urlStream;

    public Chapter() {
    }

    public Chapter(Integer id, String name, Integer number, String urlStream) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.urlStream = urlStream;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUrlStream() {
        return urlStream;
    }

    public void setUrlStream(String urlStream) {
        this.urlStream = urlStream;
    }
}
