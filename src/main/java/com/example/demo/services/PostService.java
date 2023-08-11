package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Post;
import com.example.demo.payloads.PostDto;

public interface PostService {
	
//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all posts
	List<PostDto> getAllPosts();
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get all posts by category
	List<PostDto> getPostsByCategory(Integer categorId);
	
	//get all posts by user
		List<PostDto> getPostsByUser(Integer userId);
		
		//search post
		List<Post> searchPosts(String keyword);
	
	
}
