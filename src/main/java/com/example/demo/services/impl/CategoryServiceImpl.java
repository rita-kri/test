package com.example.demo.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.payloads.CategoryDto;
import com.example.demo.repostories.CategoryRepo;
import com.example.demo.services.CategoryServices;

@Service
public class CategoryServiceImpl implements CategoryServices{

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category category = this.modelMapper.map(categoryDto, Category.class);
		Category save = this.categoryRepo.save(category);
		return this.modelMapper.map(save, CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer catId) {
		Category cat = this.categoryRepo.findById(catId)
		.orElseThrow(()-> new ResourceNotFoundException("Category","categoryId" , catId));
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		Category save = this.categoryRepo.save(cat);
		return this.modelMapper.map(save, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer catId) {
		Category cat = this.categoryRepo.findById(catId)
				.orElseThrow(()-> new ResourceNotFoundException("Category", "categoryId", catId));
		this.categoryRepo.delete(cat);
	}

	@Override
	public CategoryDto getCategory(Integer catId) {
		Category cat =this.categoryRepo.findById(catId)
		.orElseThrow(()-> new ResourceNotFoundException("category", "categoryId", catId));
		
		return this.modelMapper.map(cat, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<Category> categories = this.categoryRepo.findAll();
		  List<CategoryDto> collectcat = categories.stream().map(category -> this.modelMapper.map(category, CategoryDto.class)).collect(Collectors.toList());
		return collectcat;
	
	}

}
