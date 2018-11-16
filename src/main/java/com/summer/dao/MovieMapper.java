package com.summer.dao;

import com.summer.pojo.Movie;

import java.util.List;

public interface MovieMapper {
    int insert(Movie movie);

    int delete(int id);

    int update(Movie movie);

    List<Movie> list();
}
