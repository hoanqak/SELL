package com.sell.dao;

import java.util.List;

import com.sell.entity.ListImage;
import com.sell.entity.Product;

public interface ListImageDAO {

	public List<ListImage> getAllListImage();
	public List<ListImage> getListImageByProduct(Product product);
	public ListImage getImage(int id);
	public void deleteImage(ListImage image);
	public void updateImage(ListImage image);
	public void insertImage(ListImage image);
	
}
