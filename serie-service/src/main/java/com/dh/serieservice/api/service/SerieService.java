package com.dh.serieservice.api.service;

import com.dh.serieservice.domain.dto.Serie;

import java.util.List;

public interface SerieService {
    List<Serie> findByGenre(String genre);
}
