package com.osttra.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString

public class Product {
	
	@Id
	private String product_id;
	
	@Size(min = 1, max = 10000)  //string size
	private String name;
	
	@Min(0)
    @Max(200000)
	private Double price;
	
	@Min(0)
    @Max(100000)
	private Integer quantity;
	

}