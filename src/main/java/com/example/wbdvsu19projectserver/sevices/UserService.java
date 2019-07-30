package com.example.wbdvsu19projectserver.sevices;

import com.example.wbdvsu19projectserver.models.Product;
import com.example.wbdvsu19projectserver.models.User;
import com.example.wbdvsu19projectserver.repositories.ProductRepository;
import com.example.wbdvsu19projectserver.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Xuan Kong
 * @Date 2019-07-27.
 */

@Service
public class UserService {


  @Autowired
  UserRepository userRepository;

  @Autowired
  ProductRepository productRepository;

  public List<User> createUser(User newUser) {
    userRepository.save(newUser);
    return findAllUsers();
  }

  public void addProductToUser(Integer uid, Integer pid) {
    User user = userRepository.findById(uid).get();
    Product product = productRepository.findById(pid).get();
    user.addProductToUser(product);
    userRepository.save(user);
  }

  public List<User> findAllUsers() {
    return (List<User>) userRepository.findAll();
  }

  public User findUserById(Integer uid) {
    User user = userRepository.findById(uid).get();
    return user;
  }

  public List<Product> getAllProductsFromUserById(Integer uid) {
    User user = userRepository.findById(uid).get();
    return user.getCollectedProducts();
  }
}