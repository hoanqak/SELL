package com.sell.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

<<<<<<< HEAD
<<<<<<< HEAD
=======
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numberProduct")
=======
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numberProduct")
>>>>>>> parent of 8057a19... add view and any
	private int id;
	@Column
	private String name;
	@Column
	private double price;
	@Column
	private String description;
	@Column
	private double discount;
	@Column(name = "number_of_product")
	private int numberOfProduct;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;
	@Column
	private String image;
	@Column
	private String ram;
	@Column
	private String memory;
	@Column
	private String chip;
	@Column
	private String camera;
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private List<ListImage> listImage;

	public Product() {
		super();
	}

	public Product(String name, double price, String description, double discount, int numberOfProduct,
<<<<<<< HEAD
			Category category, String image, String ram, String memory, String chip, String camera) {
=======
			Category category, String image) {
>>>>>>> parent of 8057a19... add view and any
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.discount = discount;
		this.numberOfProduct = numberOfProduct;
		this.category = category;
		this.image = image;
<<<<<<< HEAD
		this.ram = ram;
		this.memory = memory;
		this.chip = chip;
		this.camera = camera;
=======
>>>>>>> parent of 8057a19... add view and any
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getNumberOfProduct() {
		return numberOfProduct;
	}

	public void setNumberOfProduct(int numberOfProduct) {
		this.numberOfProduct = numberOfProduct;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<ListImage> getListImage() {
		return listImage;
	}

	public void setListImage(List<ListImage> listImage) {
		this.listImage = listImage;
	}

<<<<<<< HEAD
	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

=======
>>>>>>> parent of 8057a19... add view and any
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", discount=" + discount + ", numberOfProduct=" + numberOfProduct + ", category=" + category
				+ ", image=" + image + ", listImage=" + listImage + "]";
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c8caac8777be131e73094d3e52d2959718faa85c
=======
>>>>>>> parent of 8057a19... add view and any

>>>>>>> 7c18d6d1a1766967ab90fbf07be708ca746d1e8e
}
