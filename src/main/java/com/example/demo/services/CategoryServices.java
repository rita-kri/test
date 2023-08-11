package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.payloads.CategoryDto;

@Service
public interface CategoryServices {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer catId);
	
	//delete
	public void deleteCategory(Integer catId);

	//get
	CategoryDto getCategory(Integer catId);

	
	//getAll
	List<CategoryDto> getCategories();
	
	

}
