package com.example.wbdvsu19projectserver.repositories;

import com.example.wbdvsu19projectserver.models.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author Xuan Kong
 * @Date 2019-07-27.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

}