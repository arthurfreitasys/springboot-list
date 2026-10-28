package com.lab.jpa.springbootlist.service;
import com.lab.jpa.springbootlist.dto.ProductRequestDTO;
import com.lab.jpa.springbootlist.dto.ProductResponseDTO;
import com.lab.jpa.springbootlist.model.Product;
import com.lab.jpa.springbootlist.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class ProductService {
    private final ProductRepository repository;
    // Injeção de Dependência por Construtor (Boa Prática Spring)
    public ProductService(ProductRepository repository){
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Page<ProductResponseDTO> listAll(Pageable pageable){
        return repository.findAll(pageable).map(ProductResponseDTO::new);
    }

    public ProductResponseDTO get(Long id) {
        return repository.findById(id)
                .map(ProductResponseDTO::new)
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado com o ID: " +
                        id));
    }

    public Page<ProductResponseDTO> buscar(String busca, Pageable pageable){
        return repository.findByMarcaContainingIgnoreCaseOrNomeContainingIgnoreCase(busca, busca, pageable)
                .map(ProductResponseDTO::new);
    }

    public void save(ProductRequestDTO dto) {
        Product product = new Product();
        product.setId(dto.id()); // Se id for null, o JPA faz INSERT; se tiver id, faz UPDATE
        product.setNome(dto.nome());
        product.setMarca(dto.marca());
        product.setPaisFabricacao(dto.paisFabricacao());
        product.setPreco(dto.preco());
        repository.save(product);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
