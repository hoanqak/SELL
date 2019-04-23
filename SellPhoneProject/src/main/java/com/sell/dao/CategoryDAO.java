package com.sell.dao;

import java.util.List;

import com.sell.entity.Category;

public interface CategoryDAO {

	public List<Category> getListCategory();
	public Category getCategory(int id);
	public void deleteCategory(Category category);
	public void updateCategory(Category category);
	public void insertCategory(Category category);
	
}
