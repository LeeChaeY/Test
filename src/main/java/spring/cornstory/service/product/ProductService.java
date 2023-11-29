package spring.cornstory.service.product;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import spring.cornstory.domain.Product;


public interface ProductService {

	public Product getProduct() throws Exception;
	
	public int addProduct(Product product) throws Exception;
}
