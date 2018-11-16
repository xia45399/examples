package com.summer.controller;

import com.summer.bean.Movie;
import com.summer.dao.MovieMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("controller/movie")
public class MovieController {
    @Resource
    private MovieMapper movieMapper;

    @RequestMapping("insert")
    public Object insert() {
        Movie movie = new Movie();
        movie.setName("测试");
        movie.setAddTime(System.currentTimeMillis() / 1000);
        return movieMapper.insert(movie);
    }
}
