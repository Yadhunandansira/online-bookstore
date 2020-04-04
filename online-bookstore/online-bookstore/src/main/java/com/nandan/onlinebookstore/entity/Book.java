package com.nandan.onlinebookstore.entity;

import java.math.*;
import java.sql.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="tbl_book")

public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String sku;
	
	private String name;
	
	private String description;
	
	@Column(name="unit_price")
	private BigDecimal unitPrice;
	
	@Column(name="image_url")
	private String imageUrl;
	
	private boolean active;
	
	@Column(name="units_in_stock")
	private int unitInStock;
	
	@Column(name="date_created")
	private Date Createdon;
	
	@Column(name="last_updated")
	private Date updatedon;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private BookCategory category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public Date getCreatedon() {
		return Createdon;
	}

	public void setCreatedon(Date createdon) {
		Createdon = createdon;
	}

	public Date getUpdatedon() {
		return updatedon;
	}

	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}

	public BookCategory getCategory() {
		return category;
	}

	public void setCategory(BookCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description + ", unitPrice="
				+ unitPrice + ", imageUrl=" + imageUrl + ", active=" + active + ", unitInStock=" + unitInStock
				+ ", Createdon=" + Createdon + ", updatedon=" + updatedon + ", category=" + category + "]";
	}
	
	
	
	
}
