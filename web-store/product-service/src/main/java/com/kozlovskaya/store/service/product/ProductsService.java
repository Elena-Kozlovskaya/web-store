package com.kozlovskaya.store.service.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsService {
    private final ProductsRepository productsRepository;

    public List<Product> findAllProducts() {
        return productsRepository.findAll();
    }

}
