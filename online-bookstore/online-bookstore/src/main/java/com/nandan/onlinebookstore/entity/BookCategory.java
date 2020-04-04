package com.nandan.onlinebookstore.entity;

import java.util.*;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_category")
@Getter
@Setter
@ToString
public class BookCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private Set<Book> book;
	
	
	
	
	
	
	
	
	
	
}
