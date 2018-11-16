package com.summer.controller;

import com.summer.dao.MovieMapper;
import com.summer.pojo.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @RequestMapping("delete")
    public Object delete(int id) {
        return movieMapper.delete(id);
    }

    @RequestMapping("update")
    public Object update() {
        Movie movie = new Movie();
        movie.setId(5);
        movie.setName("测试修改5");
        return movieMapper.update(movie);
    }

    @RequestMapping("list")
    public Object list() {
        List<Movie> list = movieMapper.list();
        return list;
    }
}
