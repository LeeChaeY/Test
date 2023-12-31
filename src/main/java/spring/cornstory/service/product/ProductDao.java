package spring.cornstory.service.product;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import spring.cornstory.domain.Product;

@Mapper
public interface ProductDao {

	public Product getProduct() throws Exception;
	
	public int addProduct(Product product) throws Exception;

}
