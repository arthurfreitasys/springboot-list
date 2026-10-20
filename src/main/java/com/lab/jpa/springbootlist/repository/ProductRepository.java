package com.lab.jpa.springbootlist.repository;
import com.lab.jpa.springbootlist.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long> {
}
