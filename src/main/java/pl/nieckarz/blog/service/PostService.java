package pl.nieckarz.blog.service;

import pl.nieckarz.blog.payload.PostDto;

import java.util.List;

public interface PostService {


    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();
}
