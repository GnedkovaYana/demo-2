package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<>(Arrays.asList(
            new Post(0L,"post 1", new Date()),
            new Post(1L, "post 2", new Date()),
            new Post(2L,"post 3", new Date())));

    public List<Post> listAllPosts(){
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(null, text, new Date()));
    }
}
