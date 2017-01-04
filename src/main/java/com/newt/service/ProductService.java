package com.newt.service;

import java.util.List;
import java.util.Map;

import com.newt.model.Product;

public interface ProductService {
	public Product findByproductId(int productId);

	public Map<String, List<Product>> findAll();

	public Product save(Product products);

	public Product findByProductName(String productName);
}
