package com.dh.serieservice.api.service.impl;

import com.dh.serieservice.api.service.SerieService;
import com.dh.serieservice.domain.dto.Serie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Qualifier("serieService")
public class SerieServiceImpl implements SerieService {
    @Override
    public List<Serie> findByGenre(String genre) {
        return Stream.of(Serie.builder().build()).collect(Collectors.toList());
    }
}
