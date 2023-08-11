package com.example.demo.payloads;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoryDto {
	
	private Integer catergoryId;
	
	@NotBlank
	@Size(min =4, message = "Category title shoudle valid")
	private String  categoryTitle;
	
	@NotBlank
	@Size(min = 10, message = "category description should be valid")
	private String categoryDescription;
	
	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCatergoryId() {
		return catergoryId;
	}
	public void setCatergoryId(Integer catergoryId) {
		this.catergoryId = catergoryId;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	@Override
	public String toString() {
		return "CategoryDto [catergoryId=" + catergoryId + ", categoryTitle=" + categoryTitle + ", categoryDescription="
				+ categoryDescription + "]";
	}
	
	

}
