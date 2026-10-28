package com.lab.jpa.springbootlist.repository;
import com.lab.jpa.springbootlist.dto.ProductResponseDTO;
import com.lab.jpa.springbootlist.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByMarcaContainingIgnoreCaseOrNomeContainingIgnoreCase(String marca, String nome, Pageable pageable);
}
