package com.sell.dao;

import java.util.List;

import com.sell.entity.Category;
import com.sell.entity.Product;

public interface ProductDAO {

	public List<Product> getListProductByCategory(Category category);
	public List<Product> getAllListProduct();
	public Product getProduct(int id);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);
	public void insertProduct(Product product);
	public List<Product> getProductNew(int number);
	public List<Product> getProductHightLights(int number);
}
