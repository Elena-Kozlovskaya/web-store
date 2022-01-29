package com.kozlovskaya.store.service.product;

import com.kozlovskaya.store.common.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProductsController {
    private final ProductsService productsService;

    private static final Function<Product, ProductDto> mapper = product -> new ProductDto(product.getId(), product.getTitle(), product.getPrice());

    @GetMapping
    public List<ProductDto> getAllProducts(){
            return productsService.findAllProducts().stream().map(mapper).collect(Collectors.toList());
    }

}
