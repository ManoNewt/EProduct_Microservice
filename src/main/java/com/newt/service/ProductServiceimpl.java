package com.newt.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newt.model.Product;
import com.newt.repository.ProductRepository;

@Service
public class ProductServiceimpl implements ProductService {

	@Autowired
	ProductRepository productRepo;

	public Product findByproductId(int productId) {

		return productRepo.findByProductId(productId);
	}

	public Map<String, List<Product>> findAll() {
		Map<String, List<Product>> productDetails = new HashMap<>();
		List<Product> pdtDetails = (List<Product>) productRepo.findAll();
		if(pdtDetails != null && !(pdtDetails.isEmpty())){
			productDetails.put("productDetails", pdtDetails);
			return productDetails;
		}
		return productDetails;
	}

	public Product save(Product products) {
		return productRepo.save(products);
	}

	@Override
	public Product findByProductName(String productName) {

		return productRepo.findByProductName(productName);
	}
}
