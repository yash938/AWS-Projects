package com.javatechie.repository;

import com.javatechie.entity.Product;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ProductRepository  extends CrudRepository<Product,String> {
}
