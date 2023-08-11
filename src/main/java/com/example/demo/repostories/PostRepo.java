package com.example.demo.repostories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Category;
import com.example.demo.entities.Post;
import com.example.demo.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	//custom method creation
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
}
