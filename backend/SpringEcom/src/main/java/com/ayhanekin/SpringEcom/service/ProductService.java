package com.ayhanekin.SpringEcom.service;

import com.ayhanekin.SpringEcom.model.Product;
import com.ayhanekin.SpringEcom.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile image) {

        try {
            product.setImageData(image.getBytes());
            product.setImageName(image.getOriginalFilename());
            product.setImageType(image.getContentType());
            return productRepository.save(product);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
