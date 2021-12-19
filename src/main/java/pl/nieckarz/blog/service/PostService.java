package pl.nieckarz.blog.service;

import pl.nieckarz.blog.payload.PostDto;
import pl.nieckarz.blog.payload.PostResponse;

import java.util.List;

public interface PostService {


    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNumber, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(Long id);

    PostDto updatePostById(PostDto postDto, Long id);

    void deletePostById(Long id);
}
